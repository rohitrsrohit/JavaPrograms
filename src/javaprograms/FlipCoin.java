package javaprograms;

import java.io.*;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) { 
		int a;
		 System.out.println("Enter the integer: ");
		  
	        // Create Scanner object
	        Scanner s = new Scanner(System.in);
	  
	        // Read the next integer from the screen
	        a = s.nextInt();
	        int headcount=0;
	        int tailcount=0;
	        
for (int i = 0; i < a; i++) {
	        	 
	if (Math.random() < 0.5){
	System.out.println("Heads");
	headcount++;
	}
	else{
	System.out.println("Tails");
	tailcount++;
	}
	
	}
System.out.println(headcount);
System.out.println(tailcount);
int headpercentage=((headcount/a)*100);
int tailpercentage=((tailcount/a)*100);
System.out.println(headpercentage);
System.out.println(tailpercentage);
	        	
}

}
