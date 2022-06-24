import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Humans player = new Humans();
            Goblins goblin = new Goblins();
            Scanner playerInput=new Scanner(System.in);
        Object [][] gameBoard={
                {"\uD83D\uDD1A","\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDFEA","\uD83E\uDDF0","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA"},
                {"\uD83D\uDFEA","\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA"},
                {"\uD83D\uDFEA","\uD83D\uDC79","\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDC79","\uD83D\uDC79"},
                {"\uD83D\uDFEA","\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA"},
                {"\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA"},
                {"\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDC79","\uD83D\uDFEA"},
                {"\uD83D\uDD11","\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDC79","\uD83D\uDFEA","\uD83D\uDFEA"},
                {"\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83D\uDFEA","\uD83E\uDDDD"}
        };

        boolean running = true;
        while(running) {
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[i].length; j++) {
                    System.out.print(gameBoard[i][j] + "\t");
                }
                System.out.println("\n");
            }
            String input = playerInput.nextLine().toLowerCase();
            int[] oldCords = player.getCords();
            int[] newCords = new int[2];
            if (input.startsWith("n")) {
                newCords[0] = oldCords[0] - 1;
                newCords[1] = oldCords[1];
                player.setCords(newCords);
                Object temp = gameBoard[newCords[0]][newCords[1]];
                gameBoard[newCords[0]][newCords[1]] = "\uD83E\uDDDD";
                gameBoard[oldCords[0]][oldCords[1]] = "\uD83D\uDFEA";
            } else if (input.startsWith("s")) {
                newCords[0] = oldCords[0] + 1;
                newCords[1] = oldCords[1];
                player.setCords(newCords);
                Object temp = gameBoard[newCords[0]][newCords[1]];
                gameBoard[newCords[0]][newCords[1]] = "\uD83E\uDDDD";
                gameBoard[oldCords[0]][oldCords[1]] = "\uD83D\uDFEA";
            } else if (input.startsWith("e")) {
                newCords[0] = oldCords[0];
                newCords[1] = oldCords[1] + 1;
                player.setCords(newCords);
                Object temp = gameBoard[newCords[0]][newCords[1]];
                gameBoard[newCords[0]][newCords[1]] = "\uD83E\uDDDD";
                gameBoard[oldCords[0]][oldCords[1]] = "\uD83D\uDFEA";
            } else if (input.startsWith("w")) {
                newCords[0] = oldCords[0];
                newCords[1] = oldCords[1] - 1;
                player.setCords(newCords);
                Object temp = gameBoard[newCords[0]][newCords[1]];
                gameBoard[newCords[0]][newCords[1]] = "\uD83E\uDDDD";
                gameBoard[oldCords[0]][oldCords[1]] = "\uD83D\uDFEA";
            }
            System.out.println(Arrays.toString(newCords));
        }


    }
}
