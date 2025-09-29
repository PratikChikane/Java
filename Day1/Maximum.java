import java.util.*;

class Maximum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 Numbers:");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();

if(n1>n2 && n1>n3){
System.out.println("N1 is the greatest");
}
else if(n2>n1 && n2>n3){
System.out.println("N2 is the Greatest");
}
else if(n1==n2 && n1==n3){
System.out.println(" Numbers are Equal");
} else{
System.out.println("N3 is the Greatest");
}
}
}