package facebookproj.progettoesameUNIVPM.Model;

public class Facebook_Img extends Facebook_Obj {
	private int height;
	private int width;
	public Facebook_Img(String id, int heigth, int width) {
		super(id);
		this.height = heigth;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	

}
