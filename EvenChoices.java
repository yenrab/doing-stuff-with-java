public class EvenChoices {


    public static void main(String[] args) throws Exception{
    	checkInts();
    }

    public static void checkInts() throws Exception{
        int aNumber = 5;
        int remainder = 5 % 2;
        if(aNumber ==0){
            System.out.printf("0 is neither even nor odd.\n");
        }
        else if(remainder == 0){
            System.out.printf("%d is even\n", aNumber);
        }
        else{
            System.out.printf("%d is odd.\n", aNumber);
        }
    }
}