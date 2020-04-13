package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[0][j] = j + 1;
                table[1][j] = j + 4;
                table[2][j] = j + 7;
                System.out.println(table[i][j] + " ");
            }
        }
    }
}
