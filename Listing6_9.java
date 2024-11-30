public class Listing6_9 {
    public static void main (String [] args){
        System.out.println("the max number is " + max(2.5, 5.9, 3.88));
    }
    public static int max(int num1, int num2){
        if(num1 > num2)
            return  num1;
        else
            return num2;
    }
    public static double max(double num1, double num2){
        if(num1 > num2)
            return  num1;
        else
            return num2;
    }
    public static double max(double num1, double num2, double num3){
        if(num1 > num2 && num1 > num3)
            return  num1;
        else if (num2 > num3 && num2 > num1)
            return num2;
        else
            return num3;
    }
}
