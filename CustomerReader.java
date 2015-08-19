import java.util.Scanner;
import java.io.File;
public class CustomerReader {
    static Customer[] customers = new Customer[5];
	public static void readCustomers() throws Exception{
        File customersFile = new File("customer.data");
        Scanner customerScanner = new Scanner(customersFile);
        for(int i = 0; i < 5; i++){
        	int anAge = customerScanner.nextInt();
        	double someYears = customerScanner.nextDouble();
            String aName = customerScanner.nextLine();

        	Customer aCustomer = new Customer();
        	aCustomer.name = aName;
        	aCustomer.age = anAge;
        	aCustomer.years = someYears;

            customers[i] = aCustomer;
        }
	}
    public static void displayCustomers() throws Exception{
        for(int i = 0; i < 5; i++){
            Customer aCustomerToPrint = customers[i];
            System.out.printf("%s has been a customer for %f years and is %d years old\n",aCustomerToPrint.name, aCustomerToPrint.years, aCustomerToPrint.age);
        }
    }
    public static void main(String[] args) throws Exception{
    	readCustomers();
        displayCustomers();
    }
}