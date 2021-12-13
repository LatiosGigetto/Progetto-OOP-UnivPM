/*
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.model;

public class Facebook_Img extends Facebook_Obj {
	private int height;
	private int width;
	public Facebook_Img(String id, int heigth, int width) {
		super(id);
		this.height = heigth;
		this.width = width;
	}
	public int getHeight() { //@return Heigth
		return height;
	}
	public void setHeight(int height) { //set the @param
		this.height = height;
	}
	public int getWidth() { //@return Width
		return width;
	}
	public void setWidth(int width) { //set the @param
		this.width = width;
	}
	public String toString() { //@return a String
		return "Facebook_Obj: id=" + getId() + ", is=  " + getHeight() + "x" + getWidth() ;
	}
	

}
