import java.util.Date;

public class Vehicle {
	private int vid;
	private String oname;
	private String vtype;
	private Date purchased;
	
	public Vehicle() {
		vid=0;
		oname=null;
		vtype = null;
		purchased=null;
	}
	
	public Vehicle(int id,String name,String type,Date pDate ) {
		vid = id;
		oname = name;
        vtype = type;
        purchased=pDate;
	}
	
	public void setId(int id) {
		vid=id;
	}
	public void setName(String name) {
		oname=name;
	}
	public void setType(String type) {
		vtype=type;
	}
	public void setPDate(Date d) {
		purchased = d;
	}
	
	public int getId() {
		return vid;
	}
	public String getName() {
		return oname;
	}
    public String getType() {
    	return vtype;
    }
    public Date getPDate() {
    	return purchased;
    }
    
    public String toString() {
    	return ("id: "+vid+" Owner Name: "+oname+" Vehicle Type: "+vtype+" Date Of Purchased: "+purchased);
    }
    
    
}
