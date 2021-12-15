/*
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.services;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import facebookproj.progettoesameUNIVPM.exceptions.ResponseNotFound;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;

public interface FacebookDataService {
	
	public abstract JSONArray getPhotoArray(); 
	public abstract void JSONtoObject() throws ResponseNotFound, FileNotFoundException, IOException;
	public abstract String getJSONfromURL() throws IOException, ParseException; 
	
}
