/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 */

package facebookproj.progettoesameUNIVPM.statistics;

import java.util.ArrayList;
import facebookproj.progettoesameUNIVPM.model.*;
import facebookproj.progettoesameUNIVPM.filter.*;

/**
 * The methods in this class each give a different statistic.
 * 
 * @see Filter
 */

public class Statistics {
	
	private ArrayList<Facebook_Img> photos = new ArrayList<>();
	
	public Statistics(ArrayList<Facebook_Img> photos) {
		this.photos = photos;
	}

	
	public int getAllPhotos() {
		return photos.size();
	}

	public int getCaptionedPhotos() {
		return new Filter_Caption(photos).getFilter("captioned").size();
	}

	public int getUncaptionedPhotos() {
		return new Filter_Caption(photos).getFilter("uncaptioned").size();
	}

	public int getHorizontalPhotos() {
		return new Filter_Orientation(photos).getFilter("horizontal").size();
	}

	public int getVerticalPhotos() {
		return new Filter_Orientation(photos).getFilter("vertical").size();
	}

	public int getSquarePhotos() {
		return new Filter_Orientation(photos).getFilter("square").size();
	}

	public int getAverageHeight() {
		int i = 0;
		for (Facebook_Img o : photos) {
			i += o.getHeight();
		}
		return i / photos.size();
	}
	
	public int getAverageWidth() {
		int i = 0;
		for (Facebook_Img o : photos) {
			i += o.getWidth();
		}
		return i / photos.size();
	}

	/**
	 * Calls all other methods and combines them into a String.
	 * 
	 * @return the full string of statistics.
	 */
	
	public String toString () {
		return "Statistics for current photos:\n"
				+ "Total number of photos: " + this.getAllPhotos() + "\n"
				+ "Captioned photos: " + this.getCaptionedPhotos() + "\n"
				+ "Uncaptioned photos: " + this.getUncaptionedPhotos() + "\n"
				+ "Horizontal photos: " + this.getHorizontalPhotos() + "\n"
				+ "Vertical photos: " + this.getVerticalPhotos() + "\n"
				+ "Square photos: " + this.getSquarePhotos() + "\n"
				+ "Average height in pixels: " + this.getAverageHeight() + "\n"
				+ "Average width in pixels: " + this.getAverageWidth();
	}

}
