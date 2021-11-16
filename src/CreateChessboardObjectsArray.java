import java.util.HashMap;
import java.util.Map;

public class CreateChessboardObjectsArray {
    static Square[][] getChessboard(String[][] figs) {

        int size = 8;
        Square[][] chessBoard = new Square[size][size];
        Map<String, String> chessmen = new HashMap<String, String>() {
            {
                put("p", "pawn");
                put("r", "rook");
                put("n", "knight");
                put("b", "bishop");
                put("q", "queen");
                put("k", "king");
                put("o", "empty");
            }
        };

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String color = "w";
                if (checkInput(figs[i][j])) {
                    if (Character.isUpperCase(figs[i][j].charAt(0))) {
                        color = "b";
                    }
//                    chessBoard[i][j].piece = chessmen.get(figs[i][j].toLowerCase());
//                    chessBoard[i][j].pieceColor = color;
                    chessBoard[i][j] = new Square(chessmen.get(figs[i][j].toLowerCase()), color);

                } else {
                    System.out.println(figs[i][j] + " -> NOPE");
                }
            }
        }
        return chessBoard;


    }

    static boolean checkInput(String toCheck) {
        String model = "p r n b q k o";
        return model.contains(toCheck.toLowerCase());
    }
}


//        System.out.println(Character.isUpperCase('r')); // false
//        System.out.println(Character.isUpperCase('R')); // true
//
//        System.out.println(chessmen.get("p")); // pawn
