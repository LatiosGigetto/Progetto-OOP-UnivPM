package facebookproj.progettoesameUNIVPM.exceptions;

public class InvalidTokenException extends Exception {
	/**
	 * Constructor
	 */
	public InvalidTokenException() {
		super("Invalid or missing token.");
	}
}
