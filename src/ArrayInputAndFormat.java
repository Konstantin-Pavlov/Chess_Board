import java.util.Scanner;

/*
вспомогательный класс для ввода сырого текста типа
O O O O K O O O
P P O O O P P P
O O O O O O O O
O O O O P O O O
O O O O p O O O
O O O O O O O O
p p p O O p p p
O O O O k O O O

и превращения его в пригодный для создания тестовых массивов
в классе ChessboardTestArrays:

{"O", "O", "O", "O", "K", "O", "O", "O"},
{"P", "P", "O", "O", "O", "P", "P", "P"},
{"O", "O", "O", "O", "O", "O", "O", "O"},
{"O", "O", "O", "O", "P", "O", "O", "O"},
{"O", "O", "O", "O", "p", "O", "O", "O"},
{"O", "O", "O", "O", "O", "O", "O", "O"},
{"p", "p", "p", "O", "O", "p", "p", "p"},
{"O", "O", "O", "O", "k", "O", "O", "O"},

Не удаляется на случай новых тестов

* */

public class ArrayInputAndFormat {
    static int size = 8;
    static String[][] figs = new String[size][size];

    static void chessboardInput() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String figure = scanner.next();
                figs[i][j] = figure;
            }
        }
        scanner.close();
    }

    // for example:  R N O Q K B O R -> "R", "N", "O", "Q", "K", "B", "O", "R"
    static void toArrayFormat() {
        for (int i = 0; i < size; i++) {
            System.out.print("{");
            for (int j = 0; j < size; j++) {
                System.out.print(j == size - 1 ? "\"" + figs[i][j] + "\"},\n" : "\"" + figs[i][j] + "\", ");
            }
        }

    }
}
