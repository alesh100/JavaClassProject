public class Listing5_15 {
    public static void main (String [] args) {
        final int NUMBER_OF_COUNT = 50;
        final int NUMBER_OF_COUNT_PER_LINE = 10;
        int count = 10;
        int number = 2;

        System.out.print("the first 50 prime number are \n");

        while(count < NUMBER_OF_COUNT){
            boolean isPrime = true;
            for(int divisor = 2; divisor <= number/ 2; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
                if (count % NUMBER_OF_COUNT_PER_LINE == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
}
