/**
 * This class is an exception that it's called
 * when the response is not found
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.exceptions;

import java.io.IOException;

public class ResponseNotFoundException extends IOException {
	/**
	 * Constructor
	 */
	public ResponseNotFoundException() {
		super("File response.json not found.");
	}

}