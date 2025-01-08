package lesson4;

import java.util.Scanner;

public class l4_e7_temp_conversion {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your preferred temperature scale: ");
        String scale = scanner.next().toLowerCase();

        switch (scale){
            case "celsius":
                System.out.println("this is celsius");

                System.out.println("Please enter temperature in Celsius: ");
                float degreesC = scanner.nextFloat();
//                double celsiusToFahrenheit = degrees * 1.8 + 32;
                System.out.println("The temperature in Fahrenheit is " + ((degreesC * 1.8) + 32));

            break;
            case "fahrenheit":
                System.out.println("this is fahrenheit");
                System.out.println("Please enter temperature in Fahrenheit: ");
                float degreesF = scanner.nextFloat();
//                double celsiusToFahrenheit = degrees * 1.8 + 32;
                System.out.println("The temperature in Celsius is " + (degreesF - 32) * 5/9);
            break;
            default:
                System.out.println("Please verify your input!");
        }
    }
}
