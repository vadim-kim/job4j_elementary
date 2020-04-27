package ru.job4j.array;

public class ExamTaskOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean result = true;
        for (int index = 1; index < array.length; index++) {
            if (array[index] < array[index - 1]) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован по возрастанию");
        }
    }
}
