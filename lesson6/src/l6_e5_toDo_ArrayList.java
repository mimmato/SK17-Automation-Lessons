import java.util.ArrayList;
import java.util.Scanner;

public class l6_e5_toDo_ArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println("This is your to-do list!");

        System.out.println("Please add a new task: ");
        String addTask = scanner.nextLine();
        arrayList.add(addTask);

        while(true){

            System.out.println("Do you want to add more tasks? yes/no");
            String choice = scanner.nextLine();

            if(choice.equals("no")){
                break;
            } else {
                System.out.println("Please enter your new task: ");
                String newTask = scanner.nextLine();
                arrayList.add(newTask);
            }
        }

        System.out.println("Here are the items in the ArrayList: " + arrayList);

        while (true){
            System.out.println("Do you wish to modify the previous task?");
            String modify = scanner.nextLine();

            if(modify.equals("no")){
                break;
            } else {
                System.out.println("Please type in the changes to the previous task or type in completed: ");
                String newTaskModified = scanner.nextLine();
                arrayList.set(0, newTaskModified);
            }
        }

        System.out.println("Here are the items in the ArrayList: " + arrayList);

        while (true){
            System.out.println("Do you wish to remove the previous task?");
            String remove = scanner.nextLine();

            if(remove.equals("no")){
                break;
            } else {
                System.out.println("Please type in the index of the task you want to remove: ");
                String taskToRemove = scanner.nextLine();
                arrayList.remove(0);
            }
        }
        while(true){
            System.out.println("Do you wish to remove all completed tasks? yes/no");
                String removeCompleted = scanner.nextLine();
                    if(removeCompleted.equals("no")){
                        break;
                    } else {
                        arrayList.removeIf(removedTasks -> removedTasks.toLowerCase().contains("completed"));
                    }
            System.out.println("Here are the items in the ArrayList: " + arrayList);
        }



        System.out.println("Here are the items in the ArrayList: " + arrayList);


//        System.out.println("Do you want to add more tasks?");
//
//
//
//        System.out.println("Which item from the list do you want to see? (Enter its index)");
//
//
//        arrayList<Integer> = scanner.nextInt();
//
//        System.out.println("This is the task you added: " + arrayList.get(0));

    }
}
