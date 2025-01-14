public class l6_e4_biggest_element {
    public static void main(String[] args) {

        int[] arrayList = {21, 402, 82, 2, 1000};

        int biggestElement = arrayList[0];

        for(int i : arrayList){

            if(biggestElement < i){
                System.out.println("Comparing the biggest Element from Array: " + biggestElement + " current number " + i);
                biggestElement = i;
                    }
                }
            System.out.println("The biggest number from the array is: " + biggestElement);

        // note to self, this exercise is the same as the first one from lesson 4
        }
    }

