public class l5_e2_divide_by_five {
    public static void main(String[] args) {

        // display only the numbers from the array which can be divided by 5
        // exit loop when a number greater than 150 is checked
// use break; in this exercise

        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        // working For Each loop without break;
//        for (int number : numbers) {
//            if (number <= 150 && number % 5 == 0) {
//                System.out.println("The current number divisible by 5 is: " + number);
//
//            }

//         working For Each loop with break; between conditions
//        for (int number : numbers) {
//            if (number == 150) {
//                System.out.println("The last number divisible by 5 as per the condition is: " + number);
//                break;
//            }
//            if (number % 5 == 0) {
//                System.out.println("Print if divided by 5: " + number);
//
//            }
//        }

        // working For loop
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
//                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
//
//            }


        // working For loop with break;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 150) {
//                System.out.println("The last number divisible by 5 as per the condition is: " + numbers[i]);
//                break;
//            }
//            if (numbers[i] % 5 == 0) {
//                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
//            }


        // working while loop
//        int i = 0;
//
//        while (i < numbers.length) {
//            if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
//                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
//            }
//            i++;
//        }

        // working while loop with break;
//        int i = 0;
//
//        while (i < numbers.length) {
//            if (numbers[i] % 5 == 0) {
//                System.out.println("The following numbers are less than 150 and divisible by 5: " + numbers[i]);
//            }
//            if (numbers[i] == 150) {
//                System.out.println("This is the last number divisible by 5: " + numbers[i]);
//                break;
//            }
//            i++;
//        }


            // working do while loop
//            int i = 0;
//            do {
//                if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
//                    System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
//                }
//                i++;
//            }
//            while (i < numbers.length);
//
//        }
//    }

        // working do while loop with break;
            int i = 0;
            do {
                if (numbers[i] % 5 == 0) {
                    System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
                }
                if (numbers[i] == 150) {
                    System.out.println(" ");
                    break;
                }
                i++;
            }
            while (i < numbers.length);

        }
    }








