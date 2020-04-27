package ru.job4j.array;

public class ExamTaskTwo {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2};
        int[] arrayTwo = {3, 1};
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    System.out.println(arrayOne[i]);
                }
            }
        }
    }
}
