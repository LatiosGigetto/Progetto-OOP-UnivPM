/*
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.model;

public class Facebook_Img_Caption extends Facebook_Img{
	private String caption;
	public Facebook_Img_Caption(String id, int heigth, int width, String caption) {
		super(id, heigth, width);
		this.caption = caption;
	}
	
	public Facebook_Img_Caption(String id, int heigth, int width) {
		super(id, heigth, width);
	}
	
	public String getCaption() { //@return caption
		return caption;
	}
	public void setCaption(String caption) { //set the @param
		this.caption = caption;
	}
	public String toString() { //@return a String
		return "Facebook_Obj: id=" + getId() + ", is=  " + getHeight() + "x" + getWidth() + "and It has a caption= " + getCaption();
	}
	
	
	
	

}
