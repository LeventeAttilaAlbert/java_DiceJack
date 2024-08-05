import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick three numbers between 1 and 6!");
        int pickOne = scanner.nextInt();
        checkNumber16(pickOne);
        int pickTwo = scanner.nextInt();
        checkNumber16(pickTwo);
        int pickThree = scanner.nextInt();
        checkNumber16(pickThree);

        int playerChoice = pickOne + pickTwo + pickThree;

        System.out.println("The sum of your numbers is: " + playerChoice);

        System.out.println("Now roll the dice 3 times!");

        int diceOne = diceRoll();
        System.out.println(diceOne);
        int diceTwo = diceRoll();
        System.out.println(diceTwo);
        int diceThree = diceRoll();
        System.out.println(diceThree);
        int diceAll = diceOne + diceTwo + diceThree;

        System.out.println("The sum of the dice rolls are: " + diceAll);

        if (diceAll < playerChoice && playerChoice-diceAll < 3) {
            System.out.println("You WIN!");
        }
        else {
            System.out.println("You lose!");
        }

        

        scanner.close();
    }
    public static boolean checkNumber16(int pick) {
        boolean pickTrue = true;
        if (pick < 1 || pick > 6) {
            System.out.println("INVALID PICK!");
            System.exit(0);
        }
        else {
            
        }

        return pickTrue;
    }

    public static int diceRoll() {
        double randNum = Math.random();
        return Math.abs((int)(randNum*10)-3);
    }
}
