import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(12,"Rajan",98,97,new Date(2022,11,23));
		//s1.display();
		
		System.out.println(s1);
		Student s2=new Student(13,"Revati",98,97,new Date(2019,11,25));
		
		System.out.println(s2);
		
		s1.setId(10);
		System.out.println("id: "+s1.getId());

	}

}
