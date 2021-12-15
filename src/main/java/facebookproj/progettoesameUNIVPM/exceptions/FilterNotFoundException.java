/**
 * this class is an exception that it's called
 * when the user try to use a filter that doesn't exist
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.exceptions;

import java.io.IOException;

public class FilterNotFoundException extends IOException {
	/**
	 * Constructor
	 */
	public FilterNotFoundException() {
		super("Filter not found.");
	}
}
