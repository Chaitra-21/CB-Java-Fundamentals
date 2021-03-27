package problems;

import java.util.Scanner;

public class TripletSum {

	static Scanner sc= new Scanner(System.in);
	
    public static void main (String args[]) {
    	int [] res=input();
    	int target=sc.nextInt();
    	tripleSum(res,target);
    }
	public static int[] input(){
		int N=sc.nextInt();
		int [] arr= new int[N];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		return arr;
	}
		
	public static void tripleSum(int[] arr, int target) {
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					
					sum=arr[i]+arr[j]+arr[k];
					if(sum==target) {
						System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
					}
				}
			}
		}
	}
}
