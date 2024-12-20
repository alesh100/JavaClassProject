import java.util.*;
public class Weather {
    public static void main (String [] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double [][][] data = new double [NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner input = new Scanner(System.in);
        for(int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++){
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();

            data[day - 1][hour -1][0] = temperature;
            data[day - 1][hour -1][1] = humidity;

        }
        // find the average daily temperature and humidity
        for(int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyTempTotal = 0;
            double dailyHumidityTotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTempTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }


            //display result
            System.out.println("Day " + i + "'s average temperature is " + dailyTempTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + i + "'s average temperature is " + dailyHumidityTotal / NUMBER_OF_HOURS);

        }
    }
}
