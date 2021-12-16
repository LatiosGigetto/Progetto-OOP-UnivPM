/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.filter;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import facebookproj.progettoesameUNIVPM.model.*;

public abstract class Filter {
	
	protected ArrayList<Facebook_Img> photos = new ArrayList<>();
	/**
	 * Constructior.
	 * @param photos
	 */
	public Filter(ArrayList<Facebook_Img> photos) {
		this.photos = photos;
	}
	/**
	 * 
	 * @return photos
	 */
	public abstract JSONArray getFilter(String param);
}
