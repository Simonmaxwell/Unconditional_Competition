import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Map<String, String> judgeyJudgerson = new HashMap<>();
        judgeyJudgerson.put("r1", "Rock versus rock: Draw!");
        judgeyJudgerson.put("r2", "Rock versus paper: Loss!");
        judgeyJudgerson.put("r3", "Rock versus scissors: Victory!");
        judgeyJudgerson.put("p1", "Paper versus rock: Victory!");
        judgeyJudgerson.put("p2", "Paper versus paper: Draw!");
        judgeyJudgerson.put("p3", "Paper versus scissors: Loss!");
        judgeyJudgerson.put("s1", "Scissors versus rock: Loss!");
        judgeyJudgerson.put("s2", "Scissors versus paper: Victory!");
        judgeyJudgerson.put("s3", "Scissors versus scissors: Draw!");

        Scanner checkMyHands = new Scanner(System.in);

        String continueYN;

        do {
            System.out.println("Go ahead, make my day. R/P/S?:");

            String playerHand = checkMyHands.next();

            Random oneToThree = new Random();
            int computerHand = oneToThree.nextInt(3) + 1;

            String hands = playerHand + computerHand;
            String result = judgeyJudgerson.get(hands);

            System.out.println(result);
            System.out.println("Feeling lucky, punk? y/n:");

            continueYN = checkMyHands.next();
        }while( continueYN.equalsIgnoreCase("y"));

    }
}