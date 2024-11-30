import java.util.*;
public class Listing3_4 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        // constant
        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;

        // Enter weight
        System.out.print("enter weight: ");
        double weight = input.nextDouble();

        // Enter height
        System.out.print("enter height: ");
        double height = input.nextDouble();

        double weightInKilogram = weight * KILOGRAM_PER_POUND;
        double heightInMeter = height * METER_PER_INCH;

        //BMI calculation
        double bmi = weightInKilogram / (heightInMeter * heightInMeter);

        if (bmi < 18.5 )
            System.out.println(bmi + "underweight");
        else if (bmi < 25) {
            System.out.println(bmi + "normal weight");
        }
        else if (bmi < 30) {
            System.out.println(bmi + "normal weight");
        }
        else
            System.out.println(bmi + "obese");

    }
}
