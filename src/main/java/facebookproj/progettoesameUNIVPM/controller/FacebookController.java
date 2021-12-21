package facebookproj.progettoesameUNIVPM.controller;

import facebookproj.progettoesameUNIVPM.exceptions.FilterNotFoundException;
import facebookproj.progettoesameUNIVPM.exceptions.InvalidTokenException;
import facebookproj.progettoesameUNIVPM.exceptions.ResponseNotFoundException;
import facebookproj.progettoesameUNIVPM.filter.*;
import facebookproj.progettoesameUNIVPM.services.*;
import facebookproj.progettoesameUNIVPM.statistics.Statistics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.json.simple.parser.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * this determs the routes
 * and calls the services
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
@RestController
public class FacebookController {
	/**
	 * Instance of class FacebookServiceImpl Used to call the main methods
	 */
	FacebookDataServiceImpl service = new FacebookDataServiceImpl();

	/**
	 * Constructor. Used to call the JSONtoObject method on launch.
	 * 
	 * @throws FileNotFoundException
	 * @throws ResponseNotFoundException
	 * @throws MalformedURLException
	 * @throws IOException
	 */

	public FacebookController()
			throws FileNotFoundException, ResponseNotFoundException, MalformedURLException, IOException {
		service.JSONtoObject();
	}

	/**
	 * This route maintains the JSON updated
	 * 
	 * @return service.getJSONfromURL()
	 * @throws IOException
	 * @throws ParseException
	 * @throws InvalidTokenException
	 */
	@RequestMapping("/refresh")
	public ResponseEntity<Object> getNewData() throws IOException, ParseException, InvalidTokenException {
		service.getTokenFromFile();
		return new ResponseEntity<>(service.getJSONfromURL(), HttpStatus.OK);

	}

	/*
	 * @RequestMapping("/photos") public ResponseEntity<Object> getAllPhotos() {
	 * return new ResponseEntity<>(service.getPhotoArray(), HttpStatus.OK); Legacy code. 
	 * }
	 */
	/**
	 * Return the photos array filtered under client request
	 * 
	 * @param filter
	 * @return filtered photos
	 * @throws FileNotFoundException
	 * @throws ResponseNotFoundException
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws FilterNotFoundException
	 */
	@RequestMapping("/photos")
	public ResponseEntity<Object> getCaptionedPhotos(
			@RequestParam(name = "filter", defaultValue = "none") String filter)
			throws FileNotFoundException, ResponseNotFoundException, MalformedURLException, IOException {
		service.JSONtoObject();
		switch (filter) {
		case "horizontal":
			return new ResponseEntity<>(new Filter_Orientation(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "vertical":
			return new ResponseEntity<>(new Filter_Orientation(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "square":
			return new ResponseEntity<>(new Filter_Orientation(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "small":
			return new ResponseEntity<>(new Filter_Dimension(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "large":
			return new ResponseEntity<>(new Filter_Dimension(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "captioned":
			// System.out.println("case " + filter);
			return new ResponseEntity<>(new Filter_Caption(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "uncaptioned":
			// System.out.println("case " + filter);
			return new ResponseEntity<>(new Filter_Caption(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "none":
			return new ResponseEntity<>(service.getPhotosNoCaption(), HttpStatus.OK);
		default: 
			throw new FilterNotFoundException();
		}
	}

	/**
	 * Used to get statistics about the current photos array
	 * 
	 * @return a string with the stats
	 */

	@RequestMapping("/stats")
	public ResponseEntity<Object> getStats() {
		return new ResponseEntity<>(new Statistics(service.getPhotos()).toString(), HttpStatus.OK);
	}

}
