package facebookproj.progettoesameUNIVPM.services;

import java.net.URL;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FacebookDataServiceImpl implements FacebookDataService {
	
	private final String access_token = ""; // TODO find a way to get the access token here
	
	private final String url = "https://graph.facebook.com/3092662700971535/photos/uploaded?access_token=" 
								+ access_token + "&fields=height,width,name&limit=500";
	/* File local;

		public void setFile(File in) {      Legacy code
			this.local = in;
		}
	 */
	
		public JSONArray getPhotoArray() {
			
				File local = new File("./JSON/response.json");
			 FileReader fileIn;
			try {
				JSONParser parser = new JSONParser();
				Object obj = parser.parse(new FileReader(local));
				JSONObject jsonObj = (JSONObject) obj;
				JSONArray photos = (JSONArray) jsonObj.get("data");
				return photos;
			} catch (IOException | ParseException e) {
				// TODO handle exception
				e.printStackTrace();
			}

		}
}
