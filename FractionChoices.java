public class FractionChoices {


    public static void main(String[] args) throws Exception{
    	checkDoubles();
    }

    public static void checkDoubles() throws Exception{
        double aNumber = 0.25;
        if(aNumber > 0 && aNumber < 1){
            System.out.printf("%f is only fractional.\n.", aNumber);
        }
        else if(aNumber < 0 && aNumber > -1){
            System.out.printf("%f is only fractional\n", aNumber);
        }
        else{
            System.out.printf("%f has a whole number component.\n", aNumber);
        }
    }
}