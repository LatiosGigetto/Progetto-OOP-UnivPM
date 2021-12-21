package facebookproj.progettoesameUNIVPM.model;

/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */

public class Facebook_Img_Caption extends Facebook_Img{
    private String caption;
    /**
     * Constructor-
     * @param id
     * @param heigth
     * @param width
     * @param caption
     */
    public Facebook_Img_Caption(String id, int heigth, int width, String caption) { 
        super(id, heigth, width);
        this.caption = caption;
    }
    /**
     * Constructor without the caption.
     * @param id
     * @param heigth
     * @param width
     */
    public Facebook_Img_Caption(String id, int heigth, int width) {
        super(id, heigth, width);
    }
    /**
     * @return the caption of the photo.
     */
    public String getCaption() { 
        return caption;
    }
    /**
     * Sets the param caption.
     * @param caption
     */
    public void setCaption(String caption) { 
        this.caption = caption;
    }
    /**
     * @return a String representation of the captioned photo.
     */
    public String toString() { 
        return "Facebook_Obj: id=" + getId() + ", is=  " + getHeight() + "x" + getWidth() + "and It has a caption= " + getCaption();
    }
}
