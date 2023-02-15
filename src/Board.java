import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Position,Piece> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Board board= new Board();
        System.out.println(board);
    }
    public Board() throws IOException {
        readMapFormFile();
    }

    public Map<Position, Piece> getMap() {
        return map;
    }

    public static Map<Position, Piece> readMapFormFile() throws IOException {
        Map<Position,Piece> mapRead = new HashMap<>();
        BufferedReader in = null;

        try{
            in = new BufferedReader(new FileReader("initialpos.csv"));
            String line;
            line = in.readLine();
            while ((line = in.readLine()) != null) {
                String[] items = line.split(",");
                int row = Integer.parseInt(items[0]);
                int col  = Integer.parseInt(items[1]);
                int color = Integer.parseInt(items[2]);
                int type = Integer.parseInt(items[3]);

                Position position = new Position(row,col);
                Piece piece= new Piece(color,type);

                mapRead.put(position,piece);
            }
            return mapRead;

        }finally {
            if(in!= null) {
                in.close();
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        Map<Position,Piece> map = new HashMap<>();
        for(int row = 0; row <= 8; row++){
            for (int col = 0; col <= 8; col++) {
                Position position = new Position(row,col);
                if( map.get(position) == null){
                    s += ".  ";
                }else{
                    s += map.get(position) + " ";
                }

            }
            s += "\n";
        }
        return s;
    }

}
