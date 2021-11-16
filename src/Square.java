class Square {
    String piece; // "pawn", "rook", "knight", "bishop", "queen", "king", or "empty"
    String pieceColor; // "black", "white", or "empty"

    Square(String piece, String pieceColor) {
        this.piece = piece;
        if (this.piece.equals("empty")) {
            this.pieceColor = "e";
        } else {
            this.pieceColor = pieceColor;
        }
    }
}


/*
R N O Q K B O R
P P P O O P P P
O O O O B O O O
O O O O O O O O
O O O O P O O O
O O p O O n p O
p O O p p p b p
r O b q k O O r
black
 */

