import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class l5_e3_reverse_list {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};


        // array to string and then reverse string / this works but only for Strings
//        String arrayToString = Arrays.toString(numbers);
//
//        System.out.println(arrayToString);
//
//        String result = "";
//        for (int i = arrayToString.length()-1; i >= 0; i--)
//            result+=arrayToString.charAt(i);
//        System.out.println(result);


        // this works for reversing integers using a for loop
        // logic to follow is:
        // 1. define the length of the array
        // 2. set negative indexing, so the program starts counting from the last value of the array
        // 3. Have the program stop when i is >= 0
        // 4. decrement by -1 after each iteration


        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Numbers in reverse using For loop: " + numbers[i]);
        }

//        String result = " ";
//        for (int i = strNumbers.length()-1; i >= 0; i--)
//            result+=strNumbers.charAt(numbers);
//        System.out.println(result);
//        int i = 0;


//        for (int i = 0; i < numbers.length; i++){
//            System.out.println("Numbers in current order: " + numbers[i]);
//        }
//        for (int i = )


        // reversing strings

//        String str = "Hello";
//        String result = "";
//
//        for (int i = str.length()-1; i >= 0; i--)
//            result+=str.charAt(i);
//        System.out.println(result);


    }
}



