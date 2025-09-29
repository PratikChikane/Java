import java.util.Scanner;

class Factorial{
 public static int factorial(int n){
if(n<=0 || n==1){
return n;
}
else{
int f=1;
for(int i=1;i<=n;i++){
 f= f*i;
}
return f;
}
}
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number:");
int n = sc.nextInt();

int ans = factorial(n);
System.out.println("Factorial is"+ans);
}
}
