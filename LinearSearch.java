import java.util.Scanner;

public class LinearSearch {
    public static void main(String [] args){
        int[] list = {1, 4, 7, 8, 9,0};
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("enter the number you want search: ");
        int number = input.nextInt();
        System.out.println("the number is at index " + linearSearch(list, number));
    }
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i])
                return i;
        }
        return  -1;
    }
}
