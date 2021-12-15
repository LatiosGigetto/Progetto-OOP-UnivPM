/**
 * this class is an exception that it's called
 * when the user try to use a filter that doesn't exist
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.exceptions;
import java.io.IOException;

public class FilterNotFound extends IOException {
	private static final long serialVersionUID = 1L; 
	/**
	 * costructor
	 */
	public FilterNotFound() { 
		super();
		System.out.println("The following filter is not available");
	}
}
