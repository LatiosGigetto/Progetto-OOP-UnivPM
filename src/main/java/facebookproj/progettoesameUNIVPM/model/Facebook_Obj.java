/**
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.model;

public class Facebook_Obj {
    /**
     * @param basic param for identification
     */
    private String id; 
    /**
     * costructor
     * @param id
     */
    public Facebook_Obj(String id) { 
        this.id = id;
    }
    /**
     * this method return the id
     * @return id
     */
    public String getId() { 
        return id;
    }
    /**
     * this method set the param id
     * @param id
     */
    public void setId(String id) { 
        this.id = id;
    }
    /**
     * this method gives back a string 
     */
    public String toString() { 
        return "Facebook_Obj: id=" + id;
    }

}
	

