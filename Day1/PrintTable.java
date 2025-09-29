class PrintTable{
public static void printTable(int n){
for(int i =1; i<=10; i++){
System.out.println(n+"*"+i+"="+(n*i));
}
}
public static void main(String[] args){
if(args.length<0){
System.out.println("Error: Please Enter minimum 1 parameter");
}
else{
printTable(Integer.parseInt(args[0]));
}
}
}