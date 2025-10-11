import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VehicleService {
	static Vehicle[] vArr;
	   static int cnt;
	   static {
		   vArr=new Vehicle[100];
		   vArr[0]=new Vehicle(1,"Shyam", "2 Wheeler",new Date());
		   vArr[2]=new Vehicle(2,"Ram", "4 Wheeler",new Date());
		   vArr[1]=new Vehicle(3,"John", "4 Wheeler",new Date());
		   
		   cnt=3;
	   }
	public static boolean addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int vid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String oname=sc.nextLine();
		System.out.println("enter marks1");
		String vtype=sc.nextLine();
		System.out.println("enter birth date(dd/mm/yyyy)");
		String pdate=sc.next();
		//conver string to java date
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date purchased=null;
		try {
			purchased=sdf.parse(pdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Vehicle v=new Vehicle(vid,oname,vtype, purchased);
		if(cnt==vArr.length) {
			return false;
		}else {
			vArr[cnt]=v;
			cnt++;
			return true;
		}
		
	}
	public static void displayAll() {
		/*for(Student s:studarr) {
			if(s==null)
				break;
			else
				System.out.println(s);
		}*/
		for(int i=0;i<cnt;i++) {
			System.out.println(vArr[i]);
		}
		
		
	}
}
