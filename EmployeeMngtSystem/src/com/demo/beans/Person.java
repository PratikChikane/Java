package com.demo.beans;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	static int scount,vcount,ccount;
	static {
		scount =0;
		vcount = 0;
		ccount = 0;
	}
    private String pid;
    private String pname;
    private Date bdate;
    
    public Person() {
    	System.out.println("in person default constructor");
    	
    	pid = generateId("s");
    	pname = null;
    	bdate = null;
    }
    public Person(String emptype,String pname,Date bdate) {
    	System.out.println("in person parametrized constructor");
    	pid = generateId(emptype);
    	this.pname = pname;
    	this.bdate = bdate;
    	
    }

	private String generateId(String emptype) {
		if(emptype.equals("s")) {
			scount++;
			
		return emptype+scount;
		
		}else if (emptype.equals("c")) {
			ccount++;
			return emptype+ccount;
		}else if(emptype.equals("v")) {
			vcount++;
			return emptype+vcount;
		}
		return null;
	}
	public static int getScount() {
		return scount;
	}
	public static void setScount(int scount) {
		Person.scount = scount;
	}
	public static int getVcount() {
		return vcount;
	}
	public static void setVcount(int vcount) {
		Person.vcount = vcount;
	}
	public static int getCcount() {
		return ccount;
	}
	public static void setCcount(int ccount) {
		Person.ccount = ccount;
	}
	public String getPid() {
		return pid;
	}
//	public void setPid(String pid) {
//		this.pid = pid;
//	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(bdate);
		return "Person [pid=" + pid + ", pname=" + pname + ", bdate=" + bdate + ", getPid()=" + getPid()
				+ ", getPname()=" + getPname() + ", getBdate()=" + getBdate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
