package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = x2 - x1;
        double rs2 = y2 - y1;
        double rs3 = Math.pow(rs1, 2);
        double rs4 = Math.pow(rs2, 2);
        double rs5 = rs3 + rs4;
        double rs6 = Math.sqrt(rs5);
        return rs6;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

