package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > third && first < second) {
            result = second;
        }
        if (second > first && second <= third) {
            result = third;
        }
        return result;
    }
}
