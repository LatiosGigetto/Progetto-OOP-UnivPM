/*
 * @author Francesco R. Parisi
 * @author Alessandro Rossini
 * 
 */
package facebookproj.progettoesameUNIVPM.model;

public class Facebook_Obj {
	private String id; // basic @param for identification
	public Facebook_Obj(String id) { //costructor
		this.id = id;
	}
	public String getId() { //@return id
		return id;
	}
	public void setId(String id) { //set the @param
		this.id = id;
	}
	public String toString() { //@return a String
		return "Facebook_Obj: id=" + id;
	}
	
}
