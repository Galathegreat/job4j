package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minMin = j;
                }
            }

                int temp = array[i];
                array[i] = min;
                array[minMin] = temp;
            }

        for (int i : array) {
            System.out.println(i);
        }
    }
}

