import java.util.Random;
import java.util.Scanner;
class ScaryRoom implements Room {
    private Random random = new Random();

    public void describe() {
        System.out.println("You enter a dark, scary room. Shadows move mysteriously.");
    }

    public boolean challenge() {
        System.out.println("A ghost appears! Solve this riddle to escape: What has keys but can't open locks?");
        System.out.println("1) A piano  2) A door  3) A treasure chest");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice == 1;
    }
}