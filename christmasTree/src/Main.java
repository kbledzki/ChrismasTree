import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How tall your tree should be? ");
        Scanner getHeightOfTree = new Scanner(System.in);
        int height = getHeightOfTree.nextInt();

        int top = 0;

        int mainLoopCounter = 0;
        for (int i = height + 1; i > 0; i--) {
            for (int q = 0; q < i; q++) {
                System.out.printf(" ");
                top++;
                if (q == i - 1) {
                    int numLoop = 0;
                    for (int w = 0; w < mainLoopCounter; w++) {
                        System.out.printf("*");
                        if (w >= 1) {
                            System.out.printf("*");
                        }
                        numLoop++;
                    }
                }
            }
            System.out.printf(" \n");
            mainLoopCounter++;
        }
        for (int i = 0; i < height; i++) {
            System.out.printf(" ");
        }
        System.out.printf("*\n");
        for (int i = 0; i < height; i++) {
            System.out.printf(" ");
        }
        System.out.printf("*");
    }
}