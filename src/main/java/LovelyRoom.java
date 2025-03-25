import java.util.Scanner;
class LovelyRoom implements Room {

    public void describe() {
        System.out.println("You enter a bright, cute room filled with flowers and candles.");
    }

    public boolean challenge() {
        System.out.println("A fairy appears! She asks: What color do you get when you mix red and white?");
        System.out.println("1) Green  2) Pink  3) Orange");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice == 2;
    }
}