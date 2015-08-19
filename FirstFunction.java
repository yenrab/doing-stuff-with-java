public class FirstFunction {

	public static int multiply(int firstNum, int secondNum){
 		return firstNum * secondNum;
 	}	

    public static void main(String[] args) {
	    int product = FirstFunction.multiply(3, 4);
    	System.out.printf("3 * 4 = %d\n",product);
    }
}