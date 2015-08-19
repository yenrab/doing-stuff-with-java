import java.util.Scanner;
import java.io.PrintWriter;
public class WriteToFile {


    public static void main(String[] args) throws Exception{
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("enter an integer: ");
    	int firstInt = systemInScanner.nextInt();
    	System.out.printf("enter another integer: ");
    	int secondInt = systemInScanner.nextInt();
	    WriteToFile.saveNumbers(firstInt,secondInt);
    }

    public static void saveNumbers(int aNumber, int anotherNumber) throws Exception{
    	PrintWriter fileWriter = new PrintWriter("user.data");
    	fileWriter.printf("%d %d",aNumber,anotherNumber);
        fileWriter.flush();
    }
}