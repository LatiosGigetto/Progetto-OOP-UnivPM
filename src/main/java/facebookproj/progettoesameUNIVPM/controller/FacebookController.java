/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.controller;

import facebookproj.progettoesameUNIVPM.services.*;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

	
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
	
	
	/*
	@RequestMapping("/photos/{filter}")
	public ResponseEntity<Object> getCaptionedPhotos() {	// TODO add method to get photos
		return new ResponseEntity<>();
	}
	

	@RequestMapping("/nonCaptionedPhotos")
	public ResponseEntity<Object> getNonCaptionedPhotos() {	// TODO add method to get photos
		return new ResponseEntity<>();
	}
	
	
	@RequestMapping("/horizontalPhotos")
	public ResponseEntity<Object> getHorizontalPhotos() {	// TODO add method to get photos
		return new ResponseEntity<>();
	}


	@RequestMapping("/verticalPhotos")
	public ResponseEntity<Object> getVerticalPhotos() {	// TODO add method to get photos
		return new ResponseEntity<>();
	}
	
	
	@RequestMapping("/squarePhotos")
	public ResponseEntity<Object> getSquarePhotos() {	// TODO add method to get photos
		return new ResponseEntity<>();
	}

	
	@RequestMapping("/stats")
	public ResponseEntity<Object> getStats() {			// TODO add method to get statistics
		return new ResponseEntity<>();
	}
	
	*/
}

	