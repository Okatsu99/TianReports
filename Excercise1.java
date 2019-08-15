package Assignment;
import java.io.IOException;

public class Excercise1 {

	public static void main(String[] args) throws IOException {
		if(args.length == 5){
			int arr[] = new int[args.length];
			
			for(int x = 0; x<args.length; x++)
			{
				arr[x]= Integer.parseInt(args[x]);
			}
			int count = args.length;
			//Display default data in array
			Display(arr,count);
			//Adding the Data of the array
			Summation(arr,count);
			//getting the Average of the data in the array
			Average(arr,count);
			//Sorting Process of the array
			Sort(arr,count);
			Display(arr,count);
		}
		

	}
	public static void Display(int arr[],int count) {
		System.out.println("List of Arrays:");
		for(int x =0; x<count;x++){ 
			System.out.println("Array["+x+"] : "+arr[x]);
			}
	}
	public static void Summation(int arr[], int count) {
		int sum= 0;
		
		for(int x = 0; x<count;x++){
			sum +=arr[x];
		}
		System.out.println("\nThe summation of all input numbers is "+ sum);
	}
	public static void Average(int arr[], int count) {
		int sum= 0;
		for(int x = 0; x<count;x++){
			sum +=arr[x];
		}
		float ave = (float)sum/count;
		
		System.out.println("\nThe average of all input numbers is "+ ave);
	}
	public static void Sort(int arr[],int count) {
        for (int i = 1; i < count; ++i) { 
            int temp = arr[i]; 
            int pos_min = i - 1; 

            while (pos_min >= 0 && arr[pos_min] > temp) { 
                arr[pos_min + 1] = arr[pos_min]; 
                pos_min = pos_min - 1; 
            } 
            arr[pos_min + 1] = temp; 
        } 
        
		System.out.println("\nSecond highest is "+ arr[3]);
		System.out.println("Second lowest is "+ arr[1]);
	}

}
