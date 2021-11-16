public class Main {
    public static void main(String[] args) {

//      //   на случай ввода новых тестовых массивов
//      ArrayInputAndFormat.chessboardInput();
//      ArrayInputAndFormat.toArrayFormat();

        int size = 8;
        String[][] figs1 = ChessboardTestArrays.test1();
        String[][] figs2 = ChessboardTestArrays.test2();
        String[][] figs3 = ChessboardTestArrays.test3();
        Square[][] chessBoard1 = CreateChessboardObjectsArray.getChessboard(figs1);
        Square[][] chessBoard2 = CreateChessboardObjectsArray.getChessboard(figs2);
        Square[][] chessBoard3 = CreateChessboardObjectsArray.getChessboard(figs3);

        printChessBoard(chessBoard1, size);
        printChessBoard(chessBoard2, size);
        printChessBoard(chessBoard3, size);

        System.out.println(countPieces(chessBoard1, "w")); // 16
        System.out.println(countPieces(chessBoard2, "b")); // 14
        System.out.println(countPieces(chessBoard3, "b")); // 7

    }


    static int countPieces(Square[][] board, String color) {
        int pieces = 0;
//        String sentence = "pawn rook knight bishop queen king";
        for (Square[] squares : board) {
            for (Square square : squares) {
                if (square.pieceColor.equals(color))
                    pieces++;

                //System.out.print(board[i][j].piece + " ");
            }
            //System.out.println();
        }
        return pieces;
    }


    static void printChessBoard(Square[][] chessBoard, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (chessBoard[i][j] != null) {
                    System.out.print(chessBoard[i][j].piece + "(" + chessBoard[i][j].pieceColor + ") ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
