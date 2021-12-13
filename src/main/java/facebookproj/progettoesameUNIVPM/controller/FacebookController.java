package facebookproj.progettoesameUNIVPM.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

	
@RestController
public class FacebookController {
	
	@RequestMapping("/refresh")
	public ResponseEntity<Object> getNewData() {     		// TODO add method to get JSON file.
		return new ResponseEntity<>();
		
	}
	
	
	@RequestMapping("/allPhotos")
	public ResponseEntity<Object> getAllPhotos() {     		// TODO add method to get photos
		return new ResponseEntity<>();
	}
	
	
	@RequestMapping("/captionedPhotos")
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
	
	
}

	