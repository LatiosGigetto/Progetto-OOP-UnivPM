/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.model;

public class Facebook_Obj {
    private String id; 
    /**
     * Constructor.
     * @param id
     */
    public Facebook_Obj(String id) { 
        this.id = id;
    }
    /**
     * 
     * @return returns the object's ID.
     */
    public String getId() { 
        return id;
    }
    /**
     * Sets the param ID
     */
    public void setId(String id) { 
        this.id = id;
    }
    /**
     * @return a String representation of the object.
     */
    public String toString() { 
        return "Facebook_Obj: id=" + id;
    }

}
	

