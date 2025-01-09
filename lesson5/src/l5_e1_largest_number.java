public class l5_e1_largest_number {
    public static void main(String[] args) {


// for each loop

        int[] numbers = {112, 15, 32, 42, 55, 75, 122, 132, 200, 150, 180};

        int biggestNumber = numbers[0];

        for(int number : numbers) {
//            System.out.println("Current biggest number is: " + biggestNumber);
//            System.out.println("Current number is " + number);
            if (biggestNumber < number){
                System.out.println("Comparing the biggest number: " + biggestNumber + " to the current number: " + number);
//                break;
//                  return;
                biggestNumber = number;
            }
        }
        System.out.println("The biggest number from the array is: " + biggestNumber);

        }
    }
