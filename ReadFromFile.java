import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class ReadFromFile {


    public static void main(String[] args) throws Exception{
        File userDataFile = new File("user.data");
        Scanner fileScanner = new Scanner(userDataFile);
        int firstNumber = ReadFromFile.readNumber(fileScanner);
        int secondNumber = ReadFromFile.readNumber(fileScanner);
        System.out.printf("%d * %d = %d\n",firstNumber,secondNumber,firstNumber * secondNumber);
        System.out.printf("%d + %d = %d\n",firstNumber,secondNumber,firstNumber + secondNumber);
        System.out.printf("%d - %d = %d\n",firstNumber,secondNumber,firstNumber - secondNumber);
    }

    public static int readNumber(Scanner fileScanner) throws Exception{
        int aNumber = fileScanner.nextInt();
        return aNumber;
    }
}