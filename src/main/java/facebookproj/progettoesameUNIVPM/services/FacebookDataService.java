package facebookproj.progettoesameUNIVPM.services;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import facebookproj.progettoesameUNIVPM.exceptions.InvalidTokenException;
import facebookproj.progettoesameUNIVPM.exceptions.ResponseNotFoundException;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;

/**
 * Is implemented by FacebookDataServiceImpl.
 * 
 * 
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */

public interface FacebookDataService {

	public abstract JSONArray getPhotoArray();

	public abstract void JSONtoObject() throws ResponseNotFoundException, FileNotFoundException, IOException;

	public abstract String getJSONfromURL() throws IOException, ParseException;

	public void getTokenFromFile() throws FileNotFoundException, InvalidTokenException;

	public JSONArray getPhotosNoCaption();

	public ArrayList<Facebook_Img> getPhotos();

}
