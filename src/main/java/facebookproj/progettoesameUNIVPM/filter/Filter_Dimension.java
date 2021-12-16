/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.filter;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img;

public class Filter_Dimension extends Filter {
	private final int MAXDIMENSION = 500;

	public Filter_Dimension(ArrayList<Facebook_Img> photos) {
		super(photos);
	}
	/**
	 * Filters the photos array by dimension.
	 */
	@Override
	public JSONArray getFilter(String dimension) {
		ArrayList<Facebook_Img> filtered = new ArrayList<>();
		switch (dimension) {
		case "small":
			for (Facebook_Img o : photos) {
				if (o.getWidth() < MAXDIMENSION && o.getHeight() < MAXDIMENSION) {
					filtered.add(o);
				}
			}
			break;
		case "large":
			for (Facebook_Img o : photos) {
				if (o.getWidth() >= MAXDIMENSION || o.getHeight() >= MAXDIMENSION) {
					filtered.add(o);
				}
			}
			break;

		}
		JSONArray result = new JSONArray();
		result.addAll(filtered);
		return result;
	}

}
