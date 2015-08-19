public class GroupBad {


    public static void main(String[] args) throws Exception{
    	crashIt();
    }
    public static void crashIt() throws Exception{
        double[] numbers = {0.25, 11.003, -2.14, 0.14, 20001.3, -.000001, -10.0};
        numbers[7] = 45.9;
    }
}