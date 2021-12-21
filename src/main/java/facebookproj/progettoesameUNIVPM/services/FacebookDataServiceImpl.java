/**
 * Implements the FacebookDataService interface.
 * Used by the Controller to call the main methods used by the program.
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import facebookproj.progettoesameUNIVPM.model.Facebook_Obj;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img_Caption;
import facebookproj.progettoesameUNIVPM.exceptions.*;

public class FacebookDataServiceImpl implements FacebookDataService {

	private String access_token = "";
	private String url = "https://graph.facebook.com/3092662700971535/photos/uploaded?access_token=" + access_token
			+ "&fields=height,width,name&limit=500";
	private File response = new File("./resources/response.json");
	private File config = new File("config.txt");
	/**
	 * Used to store the contents of response.json as Facebook_Obj.
	 * 
	 * @see Facebook_Obj
	 */
	ArrayList<Facebook_Img> photos = new ArrayList<>();

	/**
	 * Gets the access token from the config.txt file.
	 * 
	 * 
	 * @throws FileNotFoundException
	 * @throws InvalidTokenException
	 */

	public void getTokenFromFile() throws FileNotFoundException, InvalidTokenException {
		Scanner scanner = new Scanner(config);
		String tmp = "";
		if (scanner.hasNextLine()) {
			tmp = scanner.nextLine();
		} else {
			scanner.close();
			throw new InvalidTokenException();
		}
		this.access_token = tmp.substring(6);
		this.url = "https://graph.facebook.com/3092662700971535/photos/uploaded?access_token=" + access_token
				+ "&fields=height,width,name&limit=500";
		scanner.close();
	}

	/**
	 * Gets the latest metadata available through an API Call and writes it to
	 * response.json.
	 * 
	 * @see String access_token
	 * @see String url
	 * 
	 * @return if the refresh was succesful or not.
	 */

	public String getJSONfromURL() throws IOException {
		try {
			InputStream input = new URL(url).openStream();
			JSONParser parser = new JSONParser();
			JSONObject result = (JSONObject) parser.parse(new InputStreamReader(input));
			FileWriter fileOut = new FileWriter(response);
			fileOut.write(result.toString());
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
			return "Failed to retrieve data from URL";
		}
		this.JSONtoObject();
		return "Local data refreshed successfully.";
	}

	/**
	 * Stores data from response.json to the ArrayList photos.
	 * 
	 * @see ArrayList photos
	 */

	public void JSONtoObject() throws IOException {

		try {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(response));
			JSONObject jsonObj = (JSONObject) obj;
			JSONArray jsonArr = (JSONArray) jsonObj.get("data");
			photos.clear();

			for (int i = 0; i < jsonArr.size(); i++) {
				JSONObject temp = (JSONObject) jsonArr.get(i);
				String id = (String) temp.get("id");
				int height = ((Number) temp.get("height")).intValue();
				int width = ((Number) temp.get("width")).intValue();
				if (temp.get("name") == null) {
					photos.add(new Facebook_Img(id, height, width));
				} else {
					photos.add(new Facebook_Img_Caption(id, height, width, "yes"));
				}
			}
			// System.out.println(photos); Legacy code. Used for quick debug.
		} catch (FileNotFoundException | ParseException e) {
			throw new ResponseNotFoundException();
		}

	}

	/**
	 * Gets the locally saved response.json.
	 * 
	 * @deprecated for privacy reasons.
	 * @return the JSONArray to be used by the Controller
	 */

	public JSONArray getPhotoArray() {

		try {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(response));
			JSONObject jsonObj = (JSONObject) obj;
			JSONArray photos = (JSONArray) jsonObj.get("data");
			return photos;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
			// TODO Handle exception
		}
		return null; // Should never get here. If it does, there MUST be some problems.

	}

	/**
	 * Turns the photos array into a JSONArray and returns it.
	 * 
	 * @return the photos array as a JSONArray.
	 */

	public JSONArray getPhotosNoCaption() {
		JSONArray result = new JSONArray();
		result.addAll(photos);
		return result;
	}

	/**
	 * Returns the ArrayList photos.
	 * 
	 * 
	 * @return photos
	 */

	public ArrayList<Facebook_Img> getPhotos() {
		return photos;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public File getResponse() {
		return response;
	}

	public void setResponse(File response) {
		this.response = response;
	}

	public void setPhotos(ArrayList<Facebook_Img> photos) {
		this.photos = photos;
	}

	public File getConfig() {
		return config;
	}

	public void setConfig(File token) {
		this.config = token;
	}

	
}
