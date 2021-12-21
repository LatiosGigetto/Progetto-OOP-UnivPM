package facebookproj.progettoesameUNIVPM.apllicationtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import facebookproj.progettoesameUNIVPM.exceptions.InvalidTokenException;
import facebookproj.progettoesameUNIVPM.exceptions.ResponseNotFoundException;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img;
import facebookproj.progettoesameUNIVPM.model.Facebook_Img_Caption;
import facebookproj.progettoesameUNIVPM.services.FacebookDataServiceImpl;
import facebookproj.progettoesameUNIVPM.statistics.Statistics;

class Test_Service {
	private FacebookDataServiceImpl service = new FacebookDataServiceImpl();
	private Statistics stats = new Statistics(new ArrayList<Facebook_Img>());
	private ArrayList<Facebook_Img> arr = new ArrayList<Facebook_Img>();
	@BeforeEach
	void setUp() throws Exception {

		service.setAccess_token("Test");
		service.setResponse(new File("Test"));
		service.setConfig(new File("Test"));
		Facebook_Img p1 = new Facebook_Img("Test", 1080, 1920);
		Facebook_Img p2 = new Facebook_Img_Caption("Test", 128, 128, "Test");
		arr.add(p1);
		arr.add(p2);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		assertThrows(FileNotFoundException.class, () -> service.getTokenFromFile());
	}

	@Test
	void test2() {
		service.setConfig(new File("test_config.txt"));
		assertThrows(InvalidTokenException.class, () -> service.getTokenFromFile());
	}

	@Test
	void test3() {
		assertThrows(ResponseNotFoundException.class, () -> service.JSONtoObject());
	}

	@Test
	void test4() {
		assertEquals(new JSONArray(), service.getPhotosNoCaption());
	}

	@Test
	void test5() {
		service.setPhotos(null);
		assertThrows(NullPointerException.class, () -> service.getPhotosNoCaption());
	}

	@Test
	void test6() {
		assertThrows(ArithmeticException.class, () -> stats.getAverageHeight());
	}

	@Test
	void test7() {
		assertThrows(ArithmeticException.class, () -> stats.getAverageWidth());
	}
	@Test
	void test8() {
		stats = new Statistics(arr);
		assertAll("Stats", () -> assertEquals(2 , stats.getAllPhotos()),
				() -> assertEquals(1, stats.getCaptionedPhotos()),
				() -> assertEquals(1, stats.getUncaptionedPhotos()),
				() -> assertEquals(1, stats.getHorizontalPhotos()),
				() -> assertEquals(0, stats.getVerticalPhotos()),
				() -> assertEquals(1, stats.getSquarePhotos()));
	}
}
