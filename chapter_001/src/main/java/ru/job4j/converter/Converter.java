package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро.
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллары.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(300);

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 300; // переназначение переменных
        expected = 5;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("300 rubles are 5. Test result : " + passed);

        // System.out.println("140 rubles are " + euro + " euro.");
        // System.out.println("300 rubles are " + dollar + " dollar.");
    }
}
