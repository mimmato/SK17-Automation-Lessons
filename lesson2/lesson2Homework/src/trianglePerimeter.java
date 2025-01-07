import java.util.Scanner;

public class trianglePerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of side A: ");
        double sideA = Double.valueOf(scanner.nextLine());

        System.out.println("Enter size of side B: ");
        double sideB = Double.valueOf(scanner.nextLine());

        System.out.println("Enter size of side C: ");
        double sideC = Double.valueOf(scanner.nextLine());

        double sum = sideA + sideB + sideC;

        System.out.println("The perimeter is: " + sum);

    }
}
