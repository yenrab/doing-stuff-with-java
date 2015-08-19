import java.util.Scanner;
public class FirstFromUser {


	public static void buildACustomer(){
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("enter a customer's name\n");
    	int firstInt = systemInScanner.nextInt();
    	System.out.printf("enter another integer: ");
    	int secondInt = systemInScanner.nextInt();
	    int product = FirstFunction.multiply(firstInt, secondInt);
    	System.out.printf("%d * %d = %d\n",firstInt, secondInt, product);
	}
    public static void main(String[] args) throws Exception{
    }
}