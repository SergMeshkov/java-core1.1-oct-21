package ru.geekbrains.java_core1.lesson4;


import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static int SizeX = 3;
    public static int SizeY = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map = new char[SizeX][SizeY];
    public static void iniMap() {
        for (int i = 0; i < SizeX; i++) {
            for (int j = 0; j < SizeY; j++) {
                map[i][j] = '*';
            }
        }
    }
    public static void printMap() {
        System.out.println("0 1 2 3");
        for (int i = 0; i < SizeX; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < SizeY; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        iniMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SizeX || y < 0 || y >= SizeY) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static Random rand = new Random();
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SizeX);
            y = rand.nextInt(SizeY);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static boolean checkWin(char symbol) {
        int diag1, diag2, hor, ver;
        for (int i = 0; i < SizeX; i++) {
            hor = 0; ver = 0;
            for (int j = 0; j < SizeY; j++) {
                if (map[i][j] == symbol) {
                    hor++;
                }
                if (map[j][i] == symbol) {
                    ver++;
                }
            }
            if (hor == SizeX|| ver == SizeY) {
                return true; //проверка по горизонтали и вертикали
            }
        }
        diag1 = 0; diag2 = 0;
        for (int i = 0; i < SizeY; i++) {
            if (map[i][i] == symbol) {
                diag1++;
            }
            if (map[i][SizeX - i - 1] == symbol) {
                diag2++;
            }
        }
        if (diag1 == SizeX || diag2 == SizeY) {
            return true; //проверка по диагоналям
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SizeX; i++) {
            for (int j = 0; j < SizeY; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;

    }

}



