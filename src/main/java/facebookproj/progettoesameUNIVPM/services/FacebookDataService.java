package facebookproj.progettoesameUNIVPM.services;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public interface FacebookDataService {
	
	public abstract JSONArray getPhotoArray();
	public abstract JSONArray toJSON();
	public abstract void filter();
	
}
