import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
public class CustomerCreatorAndWriter {
    static Customer[] customers = new Customer[5];
	public static void buildCustomers() throws Exception{
        for(int i = 0; i < 5; i++){
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

            customers[i] = aCustomer;
        }
	}
    public static void saveCustomers() throws Exception{
        File customersFile = new File("customer.data");
        PrintWriter customerWriter = new PrintWriter(customersFile);
        for(int i = 0; i < 5; i++){
            Customer aCustomerToPrint = customers[i];
            customerWriter.printf("%d %f %s\n",aCustomerToPrint.age, aCustomerToPrint.years, aCustomerToPrint.name);
            customerWriter.flush();
        }
    }
    public static void main(String[] args) throws Exception{
    	buildCustomers();
        saveCustomers();
    }
}