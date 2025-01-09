public class l5_e2_divide_by_five {
    public static void main(String[] args) {

        // display only the numbers from the array which can be divided by 5
        // exit loop when a number greater than 150 is checked


        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        // working for each loop
//        for (int number : numbers) {
//            if (number <= 150 && number % 5 == 0) {
//                System.out.println("The current number divisible by 5 is: " + number);
//
//            }


        // working for loop
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
//                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
//
//            }


//        int num = 145;
//        while (num <= 150) {
//            num++;
//            System.out.println(num);
//            num++;
//        }



        // working while loop
//        int i = 0;
//
//        while (i < numbers.length) {
//            if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
//                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
//            }
//            i++;
//        }


        // working do while loop
        int i = 0;
        do {
            if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
            }            i++;
        }
        while(i < numbers.length);

            }
        }


