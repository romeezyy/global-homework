package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class XandO {
    public static Character[][] field = new Character[3][3];

    public static void main(String[] args) {
        int counter = 1;
        while (true) {
            System.out.println("Хотите ли вы начать новую игру?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("Да")) {
                printField();
                while (true) {
                    if (!getUserData("Первый игрок") || !getUserData("Второй игрок")) {
                        break;
                    }
                    counter++;
                    if (counter == 10) {
                        System.out.println("Игра окончена.");
                        break;
                    }
                }
            } else if (answer.equals("Нет")) {
                break;
            }
            else System.out.println("Введите Да или Нет.");
        }
    }

    private static void printField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = '—';
            }
        }
        print2dArr(field);
    }

    private static void print2dArr(Character[][] arr) {
        System.out.println("|———|———|———|");
        for (Character[] num : arr) {
            System.out.println(Arrays.toString(num).replace("[", "| ")
                    .replace("]", " |").replace(",", " |"));
            System.out.println("|———|———|———|");
        }
    }
    private static boolean getUserData(String player){
        System.out.println(player + ", введите 2 значения (x,y): ");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt() - 1;
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt() - 1;
        if ( x < 0 || x > 3 || y < 0 || y > 3 || field[x][y].equals('O') || field[x][y].equals('X')){
            System.out.println("Вы ввели неправильное значение. Повторите ввод.");
            getUserData(player);
            return true;
        }
        if (player.equals("Первый игрок")){
            field[x][y] = 'X';
            print2dArr(field);
        } else if (player.equals("Второй игрок")) {
            field[x][y] = 'O';
            print2dArr(field);

        }
        else {
            System.out.println("Ошибка");
        }
        return checkWinCondition();
    }
    private static boolean checkWinCondition(){
        int xDiagCounter = 0;
        int oDIagCounter = 0;
        int xSideDiagCounter = 0;
        int oSideDiagCounter = 0;
        for (int i = 0; i < field.length; i++) {
            if(field[i][i] == 'X') xDiagCounter++;
            else if (field[i][i] == 'O') oDIagCounter++;
            if (field[i][field.length - 1 - i] == 'X') xSideDiagCounter++;
            else if (field[i][field.length - 1 - i] == 'O') oSideDiagCounter++;
            if(xDiagCounter == 3 || xSideDiagCounter == 3) {
                System.out.println("Выиграл первый игрок.");
                return false;
            }
            else if (oDIagCounter == 3 || oSideDiagCounter == 3) {
                System.out.println("Выиграл второй игрок.");
                return false;
            }
            int yxCounter = 0;
            int yoCounter = 0;
            int xCounter = 0;
            int oCounter = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].equals('X')) xCounter++;
                else if (field[i][j].equals('O')) oCounter++;
                if (field[j][i].equals('X')) yxCounter++;
                else if (field[j][i].equals('O')) yoCounter++;
                if (xCounter == 3 || yxCounter == 3) {
                    System.out.println("Выиграл первый игрок.");
                    return false;
                }
                else if (oCounter == 3 || yoCounter == 3) {
                    System.out.println("Выиграл второй игрок.");
                    return false;
                }
            }
        }
        return true;
    }

}
