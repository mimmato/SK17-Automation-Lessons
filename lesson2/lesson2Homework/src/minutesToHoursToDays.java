import java.util.Scanner;

public class minutesToHoursToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //6. Write a simple program to convert minutes into years and days.
        System.out.println("Enter the number of seconds you would like to convert: ");
//        long seconds = Long.valueOf(scanner.nextLine());
        long seconds = scanner.nextLong();

//        double seconds = Double.valueOf(scanner.nextLine());


        long sumOfSecondsInYears = seconds / (60 * 60 * 24 * 365);
//        double sumOfSeconds = seconds / (60 * 60 * 24 * 365);

        long sumOfSecondsInDays = seconds / (60 * 60 * 24);

//        System.out.println("The number of days in " + seconds + " seconds " + " is: " + sumOfSecondsInDays);
        System.out.println("There are " + sumOfSecondsInDays + " days " + "and " + sumOfSecondsInYears + " years " + "in " + seconds + " seconds.");

//        System.out.println("The number of years in " + seconds + " seconds " + " is: " + sumOfSecondsInYears);
//          System.out.printf("Here is the number of years you would have in " + seconds + " seconds: " + " " + sumOfSeconds);


        }
    }