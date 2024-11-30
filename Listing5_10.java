public class Listing5_10 {
    public static void main (String [] args) {
        double fee;
        int year = 0;
        for(fee = 10000; fee < 20000; year++ ){
            fee *= 1.07;
        }
        System.out.println(fee + " " + year);
    }
}
