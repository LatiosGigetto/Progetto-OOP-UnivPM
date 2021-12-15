/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.controller;

import facebookproj.progettoesameUNIVPM.exceptions.ResponseNotFound;
import facebookproj.progettoesameUNIVPM.filter.*;
import facebookproj.progettoesameUNIVPM.services.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.json.simple.parser.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FacebookController {

	FacebookDataServiceImpl service = new FacebookDataServiceImpl();

	@RequestMapping("/refresh")
	public ResponseEntity<Object> getNewData() throws IOException, ParseException {
		return new ResponseEntity<>(service.getJSONfromURL(), HttpStatus.OK);

	}

	@RequestMapping("/photos")
	public ResponseEntity<Object> getAllPhotos() {
		return new ResponseEntity<>(service.getPhotoArray(), HttpStatus.OK);
	}

	@RequestMapping("/filter")
	public ResponseEntity<Object> getCaptionedPhotos(
			@RequestParam(name = "filter", defaultValue = "none") String filter) throws FileNotFoundException, ResponseNotFound, MalformedURLException, IOException {
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
			System.out.println("case " + filter);
			return new ResponseEntity<>(new Filter_Caption(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "uncaptioned":
			System.out.println("case " + filter);
			return new ResponseEntity<>(new Filter_Caption(service.getPhotos()).getFilter(filter), HttpStatus.OK);
		case "none":
			return new ResponseEntity<>(service.getPhotoArray(), HttpStatus.OK);
		}
		return new ResponseEntity<>(service.getPhotoArray(), HttpStatus.OK);
	}

	/*
	 * @RequestMapping("/stats") public ResponseEntity<Object> getStats() { // TODO
	 * add method to get statistics return new ResponseEntity<>(); }
	 */
}
