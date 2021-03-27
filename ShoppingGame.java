package problems;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc= new Scanner(System.in);
		int limit=sc.nextInt();
		String [] arr= new String[limit];
		for(int i=0;i<limit;i++) {
			int a=1;
			int suma=0;
			int sumh=0;
			int m=sc.nextInt();
			int n=sc.nextInt();
			while(true) {
				
			suma+=a++;
			if(suma>m) {
				arr[i]="Harshit";
				break;
			}
			sumh+=a++;
			if(sumh>n) {
				arr[i]="Aayush";
				break;
			}
			}
	
		}
		for(int i=0;i<limit;i++) {
			System.out.println(arr[i]);
		}
	sc.close();
	}

}
