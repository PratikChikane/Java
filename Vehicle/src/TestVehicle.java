import java.util.Date;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1=new Vehicle(1,"Shyam", "2 Wheeler",new Date());
		
		Vehicle v3=new Vehicle(3,"John", "4 Wheeler",new Date());
		//s1.display();
		
		System.out.println(v1);
		
		Vehicle v2=new Vehicle(2,"Ram", "4 Wheeler",new Date());
		//s2.display();
		System.out.println(v2);  //calls toString method
		v1.setId(10);
		//s1.display();
        System.out.println("id: "+v1.getId());

	}

}
