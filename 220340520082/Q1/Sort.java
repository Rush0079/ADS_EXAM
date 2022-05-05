import java.util.*;

public class Sort{
	public static void ins(int [] arr){
		int length = arr.length;
		int el = arr[length-1];
		for(int i=length-2;i>=0;i--){
			if(arr[i]>el){
				arr[i+1] = arr[i];
				printArray(arr);
			}
			else{
				arr[i+1] = el;
				printArray(arr);
				break;
			}
			if((i==0)&&(arr[i]>el)){
				arr[i] = el;
				printArray(arr);
			}
			}
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[]arr = new int[s];
		for(int i=0;i<s;i++){
			arr[i] = sc.nextInt();
		}
		ins(arr);
		sc.close();
		
	}
	public static void printArray(int[] arr){
		for(int n : arr){
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
