//Create a N x N matrix and fill this with number based on the series shown below.  
//There is a formula to generate these numbers, which you should find out and apply to generate the series 
//and store in the matrix. In the matrix below N is 20. 
//However N can be any value. Use appropriate formula to generate the matrix irrespective of the value of N.

import java.util.Scanner;

public class MatrixAssesment {
 
	 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // User input- Order of Matrix
        System.out.print("Enter the order number of matrix: ");
        int n = sc.nextInt();
   
        System.out.print("\n0");
        
        // Printing header row
        for(int a = 1;a <= n; a++) {
        	System.out.format("%8d",a);
        }
        System.out.println("\n");
        
        // Call the matrix method
        Matrix(n);
    }
 
	 public static void Matrix(int n) {
 		int num=1;
 		
 		// Calling inner method to generate first number in each row
 		generateRows(num,n);
	 
 	}
 	
	 private static void generateRows(int num, int n) {
			
		 for(int i = 0; i < n; i++) {
			 
			 // Declare the variables
			 int firstNumber=2, secondNumber=3, next=0;
	        	num = num + (i*i);
	        	
	        		// Call the Method to generate numbers
	        		generateColumn(firstNumber,secondNumber,next,num,n,i);
	        		System.out.println("\n");
		}
		 
	 }
        	
      private static void generateColumn(int firstNumber, int secondNumber, int next, int num, int n, int i) {
    	  
    	  int number = 0;
		
    	  for(int j = 0; j < n; j++) {
    		  
    		  	// Print the first number in each rows
            	if(j==0) {
            		number = num;
                    System.out.format("%d%8d",(i+1),number);	
            	}
            	
            	// Print the second number in each rows	
            	else if(j == 1) {
              	  	number+=firstNumber;
                    System.out.format("%8d",number);	
                }
            	
            	// Print third number in each rows
                else if(j == 2) {
              	  number+=secondNumber;
                    System.out.format("%8d",number);	
                }
            	
            	// Print all other numbers upto limit
                else {
              	  next = firstNumber + secondNumber;
              	  firstNumber = secondNumber;
              	  secondNumber = next;
              	  number+=next;
                    System.out.format("%8d",number);	
                }
            }
      }
      
}
