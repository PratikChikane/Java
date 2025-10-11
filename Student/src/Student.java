import java.util.Date;


public class Student {
	private int id;
	private String name;
	private float m1;
	private float m2;
	private Date bdate;
	
	//Default Constructor
	
	public Student(){
		System.out.println("In Default Constructor");
		
		id =0;
		name = null;
		m1 = 0;
		m2 = 0;
		bdate = null;
	}
	
	//parameterized Constructor
	
	public Student(int id, String stuName, float m1, float m2, Date bdt) {
		this.id = id;
		name = stuName;
		this.m1= m1;
		this.m2= m2;
		bdate = bdt;
	}
	
	//Setter Method
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public void setDate(Date bdt) {
		this.bdate = bdt;
	}
	
	//Getter Methods
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getM1() {
		return m1;
	}
	public float getM2() {
		return m2;
	}
	public Date getBDate() {
		return bdate;
	}
	
	public String toString() {
		return ("id: "+id+" Name: "+name+" m1: "+m1+" m2: "+m2+" Birthdate: "+bdate);
	}
	
	

}
