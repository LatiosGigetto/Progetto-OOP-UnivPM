/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.filter;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img_Caption;
import facebookproj.progettoesameUNIVPM.model.Facebook_Obj;

public class Filter_Caption extends Filter {

	public Filter_Caption(ArrayList<Facebook_Img> photos) {
		super(photos);
	}

	/**
	 * this method check if the class Facebook_Obj is an instance of
	 * Facebook_Img_Caption
	 */
	@Override
	public JSONArray getFilter(String status) {
		ArrayList<Facebook_Img> filtered = new ArrayList<>();
		switch (status) {
		case "captioned":
			for (Facebook_Img o : photos) {
				if (o instanceof Facebook_Img_Caption) {
					filtered.add(o);
				}
			}
			break;
		case "uncaptioned":
			for (Facebook_Img o : photos) {
				if (o instanceof Facebook_Img) {
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
