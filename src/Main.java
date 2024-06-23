
import java.util.Scanner;

public class Main {
    private static final char[][] board = new char[3][3]; // Игровое поле
    private static char currentPlayer = 'X'; // Текущий игрок ('X' или 'O')

    public static void main(String[] args) {
        initializeBoard(); // Инициализация игрового поля
        boolean gameOn = true; // Флаг для управления циклом игры

        while (gameOn) {
            printBoard(); // Вывод игрового поля
            makeMove(); // Ход текущего игрока
            if (checkWinner(currentPlayer)) { // Проверка на победителя
                printBoard();
                System.out.println(currentPlayer + " wins!");
                gameOn = false; // Конец игры
            } else if (isBoardFull()) { // Проверка на ничью
                printBoard();
                System.out.println("It's a draw!");
                gameOn = false; // Конец игры
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Смена игрока
        }
    }

    private static void initializeBoard() {
        // Инициализация игрового поля пустыми символами
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard() {
        // Вывод игрового поля в консоль
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void makeMove() {
        // Ход текущего игрока
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Player " + currentPlayer + ", enter your move (row[1-3] column[1-3]): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer; // Выполняем ход
                validInput = true;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static boolean checkWinner(char player) {
        // Проверка на победу игрока player
        for (int i = 0; i < 3; i++) {
            // Проверка строк и столбцов
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Строка совпадает
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Столбец совпадает
            }
        }
        // Проверка диагоналей
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Главная диагональ совпадает
        }
        return board[0][2] == player && board[1][1] == player && board[2][0] == player; // Побочная диагональ совпадает
// Нет победителя
    }

    private static boolean isBoardFull() {
        // Проверка на заполненность игрового поля
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Есть пустая ячейка
                }
            }
        }
        return true; // Игровое поле заполнено
    }
}
