import java.util.Scanner;

public class BinarySearch {
    public static void main(String [] args){
        int[] setNumber = { 1, 5, 70 ,4, 6, 4, 3,3};
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("enter the number you want search: ");
        int number = input.nextInt();
        System.out.println("the number is at index " + binarySearch(setNumber, number));

    }

    public static  int binarySearch(int [] list, int key){
        int low = 0;
        int high = list.length - 1;

        while(high >= low){
            int mid = (high + low) /2;

            if (key > list[mid])
                low += 1;
            else if (key == list[mid])
                return mid;
            else
                high -= 1;

        }
        return  -1;
    }
}
