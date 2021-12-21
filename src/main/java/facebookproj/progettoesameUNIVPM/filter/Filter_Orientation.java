/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.filter;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img;

public class Filter_Orientation extends Filter {
	public Filter_Orientation(ArrayList<Facebook_Img> photos) {
		super(photos);
	}

	/**
	 * Filters the photos array by orientation.
	 */
	@Override
	public JSONArray getFilter(String orientation) {
		ArrayList<Facebook_Img> filtered = new ArrayList<>();
		switch (orientation) {
		case "horizontal":
			for (Facebook_Img o : photos) {
				if (o.getWidth() > o.getHeight()) {
					filtered.add(o);
				}

			}
			break;
		case "vertical":
			for (Facebook_Img o : photos) {
				if (o.getWidth() < o.getHeight()) {
					filtered.add(o);
				}
			}
			break;
		case "square":
			for (Facebook_Img o : photos) {
				if (o.getWidth() == o.getHeight()) {
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