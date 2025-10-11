import java.util.Scanner;

public class TestService {
	static Test[] tarr;
	static int cnt;
	
	static {
		tarr = new Test[20];
		Question[] quesList = new Question[20];
		
		String[] options1 = {"Encapsulation", "Inheritance", "Polymorphism", "Abstraction"};
        Question q1 = new Question(1, options1, "Encapsulation", 5);

        String[] options2 = {"Class", "Object", "Method", "Constructor"};
        Question q2 = new Question(2, options2, "Object", 5);
        tarr[0] = new Test();
        
	}
	

}
