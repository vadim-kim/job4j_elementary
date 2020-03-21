package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition1=first>second;
        int OneOutOfTwo=condition1 ? first : second;
        boolean condition2=OneOutOfTwo>third;
        int result = condition2 ? OneOutOfTwo : third;
        return result;
    }
}
