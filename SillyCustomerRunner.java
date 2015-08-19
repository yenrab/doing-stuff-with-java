import java.util.Scanner;
public class SillyCustomerRunner {

	public static void buildACustomer(){
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("Enter the customer's name\n");
    	String aName = systemInScanner.nextLine();
    	System.out.printf("Enter %s's age\n", aName);
    	int anAge = systemInScanner.nextInt();
    	System.out.printf("How many years has %s been a customer?\n", aName);
    	double someYears = systemInScanner.nextDouble();

    	Customer aCustomer = new Customer();
    	aCustomer.name = aName;
    	aCustomer.age = anAge;
    	aCustomer.years = someYears;

    	System.out.printf("%s has been a customer for %f years and is %d years old\n",aCustomer.name, aCustomer.years, aCustomer.age);
	}
    public static void main(String[] args) throws Exception{
    	buildACustomer();
    }
}