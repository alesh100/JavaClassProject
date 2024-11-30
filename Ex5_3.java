public class Ex5_3 {
    public static void main (String [] args) {
        final double KILOGRAM_TO_POUND = 2.2;
        System.out.println("Kilogram        Pounds");
        for(int kilogram = 1; kilogram <= 199; kilogram++){
            double pound = kilogram * KILOGRAM_TO_POUND;
            System.out.printf("%-15d%6.1f\n", kilogram, pound);
        }
    }
}
