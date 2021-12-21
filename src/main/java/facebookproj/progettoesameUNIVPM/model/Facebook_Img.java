package facebookproj.progettoesameUNIVPM.model;

/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */

public class Facebook_Img extends Facebook_Obj {
    
    private int height; 
    
    private int width; 
    
    /**
     * Constructor.
     * @param id
     * @param height
     * @param width
     */
    public Facebook_Img(String id, int height, int width) {
        super(id);
        this.height = height;
        this.width = width;
    }
    /**
     * 
     * @return the height of the photo.
     */
    public int getHeight() { 
        return height;
    }
    /**
     * Sets the param Height.
     * @param height
     */
    public void setHeight(int height) { 
        this.height = height;
    }
    /**
     * @return the width of the photo.
     */
    public int getWidth() { 
        return width;
    }
    /**
     * Sets the param width.
     * @param width
     */
    public void setWidth(int width) { 
        this.width = width;
    }
    /**
     * @return a String representation of the photo.
     */
    public String toString() { 
        return "Facebook_Obj: id=" + getId() + ", is=  " + getHeight() + "x" + getWidth() ;
    }
}
