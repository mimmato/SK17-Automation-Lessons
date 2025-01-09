public class l5_e2_divide_by_five {
    public static void main(String[] args) {

        // display only the numbers from the array which can be divided by 5
        // exit loop when a number greater than 150 is checked


        int[] i = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};


        for (int number : i) {
            if(number <= 150 && number % 5 == 0){
                System.out.println("The current number divisible by 5 is: " + number);

            }



//        for(int i=0; i < i.length; i++) {
//            System.out.println(numbers[i]);


//        while(int i < 150) {
//            System.out.println("This number is divisible by 5: " + i);
//            i++;
        }
    }
}


