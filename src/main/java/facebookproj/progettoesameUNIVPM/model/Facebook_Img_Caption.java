/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.model;

public class Facebook_Img_Caption extends Facebook_Img{
	private String caption;
	public Facebook_Img_Caption(String id, int heigth, int width, String caption) { //costructor
		super(id, heigth, width);
		this.caption = caption;
	}
	
	public Facebook_Img_Caption(String id, int heigth, int width) {
		super(id, heigth, width);
	}
	/**
	 * this method return the caption
	 * @return caption
	 */
	public String getCaption() { 
		return caption;
	}
	/**
	 * this method set the param caption
	 * @param caption
	 */
	public void setCaption(String caption) { 
		this.caption = caption;
	}
	/**
	 * this method gives back a string
	 */
	public String toString() { 
		return "Facebook_Obj: id=" + getId() + ", is=  " + getHeight() + "x" + getWidth() + "and It has a caption= " + getCaption();
	}
	
	
	
	

}
