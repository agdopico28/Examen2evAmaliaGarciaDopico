import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Game {
    private static List<Movement> list = new ArrayList<>();
    private static String nameFile = "game.csv";

    @Override
    public String toString() {
        return "Game{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) throws IOException {
        Game game = new Game(nameFile);
        System.out.println(game);
    }
    public Game(String nameFile) throws IOException {
        this.nameFile = nameFile;
        readMovementsFromFile(nameFile);
    }

    public List<Movement> getList() {
        return list;
    }

    private static void readMovementsFromFile(String nameFile) throws IOException {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(nameFile));
            String line;
            in.readLine();
            while ((line = in.readLine()) != null) {
                String[] items = line.split(",");
                int row = Integer.parseInt(items[0]);
                int col = Integer.parseInt(items[1]);
                int row2 = Integer.parseInt(items[2]);
                int col2 = Integer.parseInt(items[3]);
                Position from = new Position(row,col);
                Position to = new Position(row2,col2);

                Movement movement = new Movement(from, to);
                list.add(movement);
            }

        }finally {
            if(in != null) {
                in.close();
            }
        }
    }
}
