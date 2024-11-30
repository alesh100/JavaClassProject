public class Listing6_5 {
    public static void main (String [] args){
        int num1 = 3;
        int num2 = 5;
        System.out.println("the value of num1 and num2 is " + num1 + " and " +
                num2);
        swap(num1, num2);
        System.out.println("the value of num1 and num2 is " + num1 + " and " +
                num2);
    }

    //swap
    public static void swap(int n1, int n2){
        System.out.println("\tInside the swap method");
        System.out.println("\t\t the before value of n1 and n2 is " + n1 +
                 " and " + n2 );

        //swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\t the after value of n1 and n2 is " + n1 +
                " and " + n2 );
    }
}
