import java.util.*;

public class Reverse{

public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number:");
int n= sc.nextInt();
System.out.println("Reverse of"+n+"is:");

int rev =0;


while(n>0){
int digit = n%10;
rev = rev*10+digit;
n =n/10;
}
System.out.println(rev);
sc.close();
}
}