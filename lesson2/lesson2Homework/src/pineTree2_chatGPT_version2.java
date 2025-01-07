import java.util.Scanner;

public class pineTree2_chatGPT_version2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pine tree: ");
        int height = scanner.nextInt();

        printTree(height, 1);
        printTrunk(height, height / 3);
    }

    private static void printTree(int height, int layer) {
        if (layer > height) return;
        System.out.println(" ".repeat(height - layer) + "*".repeat(2 * layer - 1));
        printTree(height, layer + 1);
    }

    private static void printTrunk(int height, int trunkHeight) {
        if (trunkHeight <= 0) return;
        int trunkWidth = height % 2 == 0 ? 2 : 1;
        System.out.println(" ".repeat((2 * height - 1 - trunkWidth) / 2) + "*".repeat(trunkWidth));
        printTrunk(height, trunkHeight - 1);
    }
}