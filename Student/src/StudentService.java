import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentService {
	static Student[] studArr;
	static int cnt;
	
	static {
		studArr = new Student[100];
		studArr[0]=new Student(12,"Rajan",98,97,new Date(2000-11-11));
		studArr[1]=new Student(13,"Atharva",98,97,new Date(1997-11-11));
		studArr[2]=new Student(12,"Ashu",98,97,new Date(1997-11-11));
		cnt = 3;
	}
	
	public static boolean addNewStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int sid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String sname = sc.nextLine();
		System.out.println("enter marks1");
		float m1=sc.nextFloat();
		System.out.println("enter marks2");
		float m2=sc.nextFloat();
		System.out.println("enter birth date(dd/mm/yyyy)");
		String dt=sc.next();
		
		//convert the string to java date
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date bdt = null;
		try {
			bdt=sdf.parse(dt); 
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Student s=new Student(sid,sname,m1,m2,bdt);
		if(cnt==studArr.length) {
			return false;
		}else {
			studArr[cnt]=s;
			cnt++;
			return true;
		}
		
	}
	
	public static void displayAll() {
		for(int i=0; i<cnt; i++) {
			System.out.println(studArr[i]);
		}
	}
	}
	
