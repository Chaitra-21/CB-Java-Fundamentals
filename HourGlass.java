//incomplete
package problems;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int nst=2*n+1;
		int nsp=0;
		int row=1;
		int val=n;	
	
		while(row<=2*n+1) {
			int temp=val;
	
			//work
			for(int csp=1;csp<=nsp;csp++)
				System.out.print("  ");
			
			 for(int i=0;i<nst;i++){
	                if(i==nst/2){
	                        System.out.print(temp+" ");
	                        temp=temp+1;
	                }else{
	                        System.out.print(temp+" ");
	                    if(i<nst/2){
	                            temp=temp-1;
	                    }else {
	                            temp=temp+1;
	                    }
	                }
	            }
			 //update
			System.out.println();
			if(row<n+1)
			{
				nst=nst-2;
				nsp++;
				val=val-1;
			}
			else
			{
				nst=nst+2;
				nsp--;
				val=val+1;
			}
			row++;
		
		
		}
		sc.close();
	}

}
