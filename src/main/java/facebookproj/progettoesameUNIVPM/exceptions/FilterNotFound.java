/*
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.exceptions;
import java.io.IOException;

public class FilterNotFound extends IOException {
	private static final long serialVersionUID = 1; // exception implements serializable interface
	public FilterNotFound() {
		super();
		System.out.println("The following filter is not available");
	}
}
