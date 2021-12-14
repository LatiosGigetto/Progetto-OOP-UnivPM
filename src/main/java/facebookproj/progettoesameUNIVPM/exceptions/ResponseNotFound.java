/*
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.exceptions;
import java.io.IOException;
public class ResponseNotFound extends IOException {
	private static final long serialVersionUID = 1; // exception implements serializable interface
	public ResponseNotFound() {
		super();
		System.out.println("The JSON response is not found");
	}

}
