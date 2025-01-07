import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of side A: ");
        double sideA = Double.valueOf(scanner.nextLine());

        System.out.println("Enter size of side B: ");
        double sideB = Double.valueOf(scanner.nextLine());

        double area = (sideA * sideB) / 2;

        System.out.println("The area is: " + area);

    }
}
