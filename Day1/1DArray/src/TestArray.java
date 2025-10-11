
import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		//accepting array data
		ArrayService.acceptData(arr);
		
//		//displaying array data
		ArrayService.displayData(arr);
		
		//adding the values in the array
		System.out.println("Sum of array is: "+ArrayService.addData(arr));
		
//		//finding max value from array
//		System.out.println("The Maximum number is:"+ArrayService.findMax(arr));
//		
//		//finding min value from array
//		System.out.println("The Minimum number is: "+ArrayService.findMin(arr));
//		
//		//search the value by index
//		System.out.println("Enter Value: ");
//		int f = sc.nextInt();
//		int pos = ArrayService.searchByValue(arr, f);
//		
//		if(pos!=-1) {
//			System.out.println("Value found at position: " +pos);
//		}
//		else {
//			System.out.println("Value not found");
//		}
//		
//		//finding all repeated occurences at particular indexes from array
//		int arrayPos =sc.nextInt();
//		int[] occurrences = ArrayService.findAllOccurences(arr, arrayPos);
//		if(occurrences != null) {
//		    System.out.println("Occurrences at: " + Arrays.toString(occurrences));
//		} else {
//		    System.out.println("Number not found.");
//		}
//		
//		//finding nth maximum value from array
//		int nthMax = sc.nextInt();
//		System.out.println("Nth Maximum number is: "+ArrayService.findNthMax(arr, nthMax));
//		
//		
//		//finding nth minimum value from array
//		int nthMin = sc.nextInt();
//		System.out.println("Nth Maximum number is: "+ArrayService.findNthMin(arr, nthMin));
		
		
//		int choice;
//        do {
//            System.out.println("\n===== Array Operations Menu =====");
//            System.out.println("1. Display Array");
//            System.out.println("2. Add All Elements");
//            System.out.println("3. Find Maximum");
//            System.out.println("4. Find Minimum");
//            System.out.println("5. Search by Value");
//            System.out.println("6. Find All Occurrences");
//            System.out.println("7. Find Nth Maximum");
//            System.out.println("8. Find Nth Minimum");
//            System.out.println("9. Check Prime or not");
//            System.out.println("10. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//            
//            switch (choice) {
//            case 1:
//                ArrayService.displayData(arr);
//                break;
//            case 2:
//                System.out.println("Sum of array is: " + ArrayService.addData(arr));
//                break;
//            case 3:
//                System.out.println("The Maximum number is: " + ArrayService.findMax(arr));
//                break;
//            case 4:
//                System.out.println("The Minimum number is: " + ArrayService.findMin(arr));
//                break;
//            case 5:
//                System.out.print("Enter Value to Search: ");
//                int value = sc.nextInt();
//                int pos = ArrayService.searchByValue(arr, value);
//                if (pos != -1) {
//                    System.out.println("Value found at position: " + pos);
//                } else {
//                    System.out.println("Value not found");
//                }
//                break;
//            case 6:
//                System.out.print("Enter value to find all occurrences: ");
//                int target = sc.nextInt();
//                int[] occurrences = ArrayService.findAllOccurences(arr, target);
//                if (occurrences != null && occurrences.length > 0) {
//                    System.out.println("Occurrences at indexes: " + Arrays.toString(occurrences));
//                } else {
//                    System.out.println("Number not found.");
//                }
//                break;
//            case 7:
//                System.out.print("Enter N for Nth Maximum: ");
//                int nthMax = sc.nextInt();
//                System.out.println("Nth Maximum number is: " + ArrayService.findNthMax(arr, nthMax));
//                break;
//            case 8:
//                System.out.print("Enter N for Nth Minimum: ");
//                int nthMin = sc.nextInt();
//                System.out.println("Nth Minimum number is: " + ArrayService.findNthMin(arr, nthMin));
//                break;
//            case 9:
//                System.out.println("Prime or NotPrime: "+ArrayService.primeNumber(arr));
//                break;
//            case 10:
//            	System.out.println("Exited...");
//            default:
//                System.out.println("Invalid choice! Please enter a number between 1-9.");
//        }
//
//    } while (choice != 10);
//		
		sc.close();

	}
	

}
