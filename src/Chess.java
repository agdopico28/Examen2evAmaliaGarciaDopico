import java.io.IOException;
import java.util.Scanner;

public class Chess {
    private static String nameFile = "game.csv";
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: ReverseFile <filename>");
            System.exit(1);
        }
        Board b = new Board();
        Game g = new Game(nameFile);
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Press enter to continue");
            String answer = in.nextLine();
            if (g.getList() != null) {
                System.out.println(b);
            }
        }


    }



}
