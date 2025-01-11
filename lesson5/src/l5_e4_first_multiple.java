public class l5_e4_first_multiple {
    public static void main(String[] args) {

        int[] arrayList = {17, 23, 10, 20, 30, 40, 50};

        // for each loop
//        for (int number : arrayList){
//            if(number % 5 == 0){
//                System.out.println("This number is the first multiple of 5: " + number);
//                break;
//            }
//        }

        // for loop
//        for (int i = 0; i < arrayList.length; i++) {
//            if (arrayList[i] % 5 == 0) {
//                System.out.println("This number is the first multiple of 5: " + arrayList[i]);
//                break;
//            }
//        }

        // while loop
//        int i = 0;
//
//        while (i < arrayList.length){
//            if (arrayList[i] % 5 == 0){
//                System.out.println("This number is the first multiple of 5: " + arrayList[i]);
//                break;
//            }
//            i++;
//        }

        // do while

        int i = 0;

        do {
            if (arrayList[i] % 5 == 0) {
                System.out.println("This number is the first multiple of 5: " + arrayList[i]);
                break;
            }
            i++;
        } while (i < arrayList.length);
    }
}

