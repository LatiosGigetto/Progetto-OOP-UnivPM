/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.model;

public class Facebook_Img extends Facebook_Obj {
	private int height; //pixel
	private int width; //pixel
	public Facebook_Img(String id, int heigth, int width) { //costructor
		super(id);
		this.height = heigth;
		this.width = width;
	}
	/**
	 * this method return the param Height
	 * @return height
	 */
	public int getHeight() { 
		return height;
	}
	/**
	 * this method set the param Height
	 * @param height
	 */
	public void setHeight(int height) { 
		this.height = height;
	}
	/**
	 * this method return the param width
	 * @return width
	 */
	public int getWidth() { 
		return width;
	}
	/**
	 * this method set the param width
	 * @param width
	 */
	public void setWidth(int width) { 
		this.width = width;
	}
	/**
	 * this method gives back a string
	 */
	public String toString() { 
		return "Facebook_Obj: id=" + getId() + ", is=  " + getHeight() + "x" + getWidth() ;
	}
	

}
