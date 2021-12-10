package facebookproj.progettoesameUNIVPM.Model;

public class Facebook_Img_Capture extends Facebook_Img{
	private String capture;
	public Facebook_Img_Capture(String id, int heigth, int width, String capture) {
		super(id, heigth, width);
		this.capture = capture;
	}
	public String getCapture() {
		return capture;
	}
	public void setCapture(String capture) {
		this.capture = capture;
	}
	
	

}
