package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (index == 0){
                int temp = array[index];
                array [index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }
            if (index == 1){
                int temp = array[index];
                array [index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }
        }
        return array;
    }
}
