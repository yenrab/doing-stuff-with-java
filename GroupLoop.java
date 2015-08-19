public class GroupLoop {


    public static void main(String[] args) throws Exception{
    	checkDoublesGroup();
    }

    public static void checkDoublesGroup() throws Exception{
        double[] numbers = {0.25, 11.003, -2.14, 0.14, 20001.3, -.000001, -10.0};
        for (int i = 0; i < 7; i++){
            double aNumber = numbers[i];
            if((aNumber > 0 && aNumber < 1)
                        || (aNumber < 0 && aNumber > -1)){
                System.out.printf("%f is only fractional\n", aNumber);
            }
            else{
                System.out.printf("%f has a whole number component.\n", aNumber);
            }
        }
    }
}