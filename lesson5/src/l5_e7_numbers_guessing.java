import java.util.Random;
import java.util.Scanner;

public class l5_e7_numbers_guessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number between 1 and 100: ");
        int randomNumberUser = scanner.nextInt();

        int lowestNumber = 1;
        int highestNumber = 100;

        int randomNumber = (int) (Math.random() * ((highestNumber - lowestNumber) + 1) + lowestNumber);

//        for(int i = 0; i<100; i++){
//            System.out.println("The randomly generated number is: " + randomNumber);
//
//            if (randomNumberUser == randomNumber){
//                System.out.println("You guessed the number: " + randomNumberUser);
//                break;
//            } else if (randomNumberUser < randomNumber){
//                System.out.println("That's wrong, try a HIGHER value between 1 and 100: ");
//                randomNumberUser = scanner.nextInt();
//
//            } else {
//                System.out.println("That's wrong, try a LOWER value between 1 and 100: ");
//                randomNumberUser = scanner.nextInt();
//            }
//        }

        // testing with while loop since the FOR loops limits us to the number of attempts/iterations

        while (!(randomNumber == randomNumberUser)) {
            System.out.println("The randomly generated number is: " + randomNumber);
            if (randomNumberUser < randomNumber) {
                System.out.println("That's wrong, try a HIGHER value between 1 and 100: ");
                randomNumberUser = scanner.nextInt();
            } else {
                System.out.println("That's wrong, try a LOWER value between 1 and 100: ");
                randomNumberUser = scanner.nextInt();
            }
        }
        System.out.println("That's correct, the number is: " + randomNumberUser);
    }
}

