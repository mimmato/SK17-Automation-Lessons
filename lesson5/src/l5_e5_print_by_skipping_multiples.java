public class l5_e5_print_by_skipping_multiples {

    public static void main(String[] args) {

        int[] arrayList = {23, 55, 99, 3, 10, 9, 24, 18, 200};

//        for (int i : arrayList){
//            if (!(i % 3 == 0)){
//                System.out.println("These numbers are not multiples of 3: " + i);
//            }
//        }
//
//        for (int i = 0; i < arrayList.length; i++){
//            if (!(arrayList[i] % 3 == 0)){
//                System.out.println("These numbers are not multiples of 3: " + arrayList[i]);
//            }
//        }


//        int i = 0;
//        while (i < arrayList.length){
//            if(!(arrayList[i] % 3 == 0)){
//                System.out.println("These numbers are not multiples of 3: " + arrayList[i]);
//            }i++;
//            }

        int i = 0;

        do{
            if(!(arrayList[i] % 3 == 0)){
                System.out.println("These numbers are not multiples of 3: " + arrayList[i]);
            }i++;
            }while (i < arrayList.length);
        }
}

