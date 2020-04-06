package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i=0; i<data.length; i++) {
            int temp=data[i];
            int min = MinDiapason.findMin(data, i, data.length-1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            data[i]=data[index];
            data[index]=temp;
        }
        return data;
    }
}
