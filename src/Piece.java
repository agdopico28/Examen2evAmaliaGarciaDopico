public class Piece {
    private int color;
    private int type;

    public static final String [][] FICHAS = {{"♙", "♖", "♘","♗", "♕","♔"},{"♟", "♜", "♞","♝", "♛","♚"}};

    public static void main(String[] args) {
        Piece piece = new Piece(1,2);
        System.out.println(piece);
    }


    public Piece(int color, int type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        /*String s = "";
        for (int i = 0; i < FICHAS.length; i++) {
            for (int j = 0; j < FICHAS[i].length; j++) {
                if (i == 0) {
                    s += FICHAS[i][j];
                }
            }
        }
        for (int i = 0; i < FICHAS.length; i++) {
            for (int j = 0; j < FICHAS[i].length; j++) {
                if (i == 1) {
                    s += FICHAS[i][j];
                }
            }
        }

        return s;*/
        String s = " ";
        if(color == 0){
            switch (type) {
                case 0:
                    s +=  FICHAS[0][0];
                    break;
                case 1:
                    s += FICHAS[0][1];
                    break;
                case 2:
                    s += FICHAS[0][2];
                    break;
                case 3:
                    s +=  FICHAS[0][3];
                    break;
                case 4:
                    s += FICHAS[0][4];
                    break;
                case 5:
                    s += FICHAS[0][5];
                    break;
            }

        }else {
            switch (type) {
                case 0:
                    s +=  FICHAS[1][0];
                    break;
                case 1:
                    s += FICHAS[1][1];
                    break;
                case 2:
                    s += FICHAS[1][2];
                    break;
                case 3:
                    s +=  FICHAS[1][3];
                    break;
                case 4:
                    s += FICHAS[1][4];
                    break;
                case 5:
                    s += FICHAS[1][5];
                    break;
            }
        }
        return s;
    }
}
