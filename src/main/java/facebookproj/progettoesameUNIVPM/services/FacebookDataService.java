package facebookproj.progettoesameUNIVPM.services;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import org.json.simple.JSONArray;

public interface FacebookDataService {
	
	public abstract JSONArray getPhotoArray() throws IOException, ParseException;
//	public abstract JSONArray toJSON();
//	public abstract void filter();
	
}
