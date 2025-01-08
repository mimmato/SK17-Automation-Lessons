package lesson4;

import java.util.Scanner;

public class vacationOption3Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of vacation you would like to: Beach or Mountain");
        String vacType = scanner.next().toLowerCase();

        switch (vacType) {
            case "beach":
//                System.out.println("");
                System.out.println("Enter your budget for a vacation to the beach:");
                int beachBudget = scanner.nextInt();

                if (beachBudget <= 50){
                    System.out.println("Your destination is Bulgaria.");
                } else{
                    System.out.println("Your destination is outside Bulgaria.");
                }
                break;
            case "mountain":
                System.out.println("Enter your budget for a vacation to the beach:");
                int mountainBudget = scanner.nextInt();

                if (mountainBudget <= 30){
                    System.out.println("Your destination is Bulgaria.");
                } else{
                    System.out.println("Your destination is outside Bulgaria.");
                }                break;



//            System.out.println("Enter your budget amount: ");
//            int budgetAmount = scanner.nextInt();
//
//            if (vacType == "beach" && budgetAmount <= 50){
//                System.out.println("Your destination is Bulgaria.");
//            }
//            else if (vacType == "beach" && budgetAmount > 50){
//                System.out.println("Your destination is outside Bulgaria.");
//            }
//            else if (vacType == "mountain" && budgetAmount <= 30){
//                System.out.println("Your destination is Bulgaria.");
//            }
//            else if (vacType == "mountain" && budgetAmount > 30){
//                System.out.println("Your destination is outside Bulgaria.");
//            }



            default:
                System.out.println("There is no information about this type of vacation.");
//                return; // to stop the execution if none of the switch cases are met
//                  break;
        }
        }



    }

