/*
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.services;

import java.net.URL;
import java.util.ArrayList;
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
	
	private final String access_token = ""; // TODO find a way to get the access token here
	
	private final String url = "https://graph.facebook.com/3092662700971535/photos/uploaded?access_token=" 
								+ access_token + "&fields=height,width,name&limit=500";
	
	ArrayList<Facebook_Obj> photos = new ArrayList<>();
	
	/* File local;

		public void setFile(File in) {      Legacy code, might reuse
			this.local = in;
		}
	 */
	
		public void JSONtoObject() throws FileNotFoundException, IOException, ResponseNotFound { 
			
			try {
				File local = new File("./JSON/response.json");
				JSONParser parser = new JSONParser();
				Object obj = parser.parse(new FileReader(local));
				JSONObject jsonObj = (JSONObject) obj;
				JSONArray jsonArr = (JSONArray) jsonObj.get("data");
				
				for (int i = 0; i < jsonArr.size(); i++) {
					JSONObject temp = (JSONObject) jsonArr.get(i);
					String id = (String) temp.get("id");
					int height = ((Number) temp.get("height")).intValue();
					int width = ((Number)temp.get("width")).intValue();
					if (temp.get("name") == null) {
						Facebook_Img current = new Facebook_Img(id, height, width);
						photos.add(current);
					}
					else {
						Facebook_Img_Caption current = new Facebook_Img_Caption(id, height, width);
						photos.add(current);
					}
				}
			} catch (FileNotFoundException | ParseException e ) {
				e.printStackTrace();
				//TODO Handle exception
			}
			
		}	
		
		public JSONArray getPhotoArray()  {
			
			try {
				File local = new File("./JSON/response.json");
				JSONParser parser = new JSONParser();
				Object obj = parser.parse(new FileReader(local));
				JSONObject jsonObj = (JSONObject) obj;
				JSONArray photos = (JSONArray) jsonObj.get("data");
				return photos;
			} catch (IOException | ParseException e) {
				e.printStackTrace();
				//TODO Handle exception
			}
			return null;                        // Should never get here. If it does, there MUST be some problems.
			
		}
		
		
		
		
}
