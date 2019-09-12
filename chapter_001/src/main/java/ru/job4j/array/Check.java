package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0;  i < data.length; i++) {
            for (int a = i+1; a < data.length; a++) {
                if (data[i] != data[a])
                    result = false;
            }
        }
        return result;
    }
}