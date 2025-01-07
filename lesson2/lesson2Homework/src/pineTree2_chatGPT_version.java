import java.util.Scanner;

public class pineTree2_chatGPT_version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the height of the tree
        System.out.print("Enter the height of the pine tree: ");
        int height = scanner.nextInt();

        // Generate the tree
        for (int i = 1; i <= height; i++) {
            printLayer(i, height);
        }

        // Print the trunk
        printTrunk(height);
    }

    // Method to print a single layer of the tree
    private static void printLayer(int layer, int totalHeight) {
        int spaces = totalHeight - layer;
        int stars = 2 * layer - 1;

        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Method to print the trunk of the tree
    private static void printTrunk(int height) {
        int trunkWidth = height % 2 == 0 ? 2 : 1; // Ensure trunk width is odd
        int spaces = (2 * height - 1 - trunkWidth) / 2;

        for (int i = 0; i < height / 3; i++) { // Trunk height is 1/3 of tree height
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < trunkWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}