/**
 * this class is an exception that it's called
 * when the token used is invalid
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.exceptions;

public class InvalidTokenException extends Exception {
	/**
	 * Constructor
	 */
	public InvalidTokenException() {
		super("Invalid or missing token.");
	}
}
