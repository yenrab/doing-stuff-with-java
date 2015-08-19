import java.util.Scanner;
public class DivideLoop {


    public static void main(String[] args) throws Exception{
    	divideInts();
    }
    public static void divideInts() throws Exception{
    	Scanner systemInScanner = new Scanner(System.in);
        System.out.printf("enter an integer\n");
        int dividend = systemInScanner.nextInt();
 	  	System.out.printf("What integer would you like to divide %d by?\n", dividend);
        int divisor = systemInScanner.nextInt();
        while(divisor != 0){
			int quotient = dividend/divisor;
			System.out.printf("%d / %d = %d\n", dividend, divisor, quotient);
			System.out.printf("enter an integer\n");
        	dividend = systemInScanner.nextInt();
 	  		System.out.printf("What integer would you like to divide %d by?\n", dividend);
        	divisor = systemInScanner.nextInt();
		}
		System.out.printf("Oops. There’s a problem. You can't divide by zero.\n");
    }
}