import java.util.Arrays;
import java.util.Scanner;

public class ArrayService {
	
	//to accept data from user
	public static void acceptData(int[] arr) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter Data: ");
			arr[i] = sc.nextInt();
		}
	}
	
	//to display data of array
	
	public static void displayData(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
		}
	}
	
	
	// to make addition of Array elements
	public static int addData(int[] arr) {
		int sum =0;
		for(int i =0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	
	
	// to find maximum form array
	public static int findMax(int[] arr) {
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	//to find minimum from array
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	//to find the index of a number
	public static int searchByValue(int []arr,int f) {

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==f) {
				return i;
			}
		}
		return -1;	
	}
	
	//to find all occurrences of a number
	public static int[] findAllOccurences(int[] arr, int num) {
		int temp[]= new int[arr.length];
		for(int i=0;i<temp.length;i++) {
			temp[i]=-1;
		}
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				temp[count]= i;
				count++;
			}
		}
		if(count>0) {
			return temp;
		}
		return null;
	}
	
	
	//to find Nth Max
	
	public static int findNthMax(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int pos=findMaxpos(arr,i);
			//swap(i,pos)
			int temp=arr[i]; ///[7,5,3,2,2]
			arr[i]=arr[pos];
			arr[pos]=temp;
			//displayData(arr);
		}
		return arr[n-1];
	}
	private static int findMaxpos(int[] arr, int start) {
		int pos=start;
		int max=arr[pos];
		for(int i=start+1;i<arr.length;i++) {
			if(max<arr[i]) {
				pos=i;
				max=arr[i];
			}
		}
		return pos;
	}
	
	//to find Nth Minimum
	public static int findNthMin(int[] arr, int n) {
		for(int i=0;i<n;i++) {
		
			int pos=findMinPos(arr,i);
			//swap(i,pos)
			int temp=arr[i]; ///[7,5,3,2,2]
			arr[i]=arr[pos];
			arr[pos]=temp;
			
		}
		return arr[n-1];
	}
	public static int findMinPos(int[] arr, int start) {
		int pos=start;
		int min=arr[pos];
		for(int i=start+1;i<arr.length;i++) {
			if(min>arr[i]) {
				pos=i;
				min=arr[i];
			}
		}
		return pos;
	}
	

	
	
}