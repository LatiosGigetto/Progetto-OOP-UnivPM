/**
 * this class is an exception that it's called
 * when the response is not found
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.exceptions;
import java.io.IOException;
public class ResponseNotFound extends IOException {
	private static final long serialVersionUID = 1L; 
	/**
	 * costructor
	 */
	public ResponseNotFound() {
		super();
		System.out.println("The JSON response is not found");
	}

}
