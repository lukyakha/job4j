package ru.job4j.condition;

public class SqArea {
    public static double square(float p, float k) {
        return k * Math.pow(p/(2*(1 + k)),2) ;
    }

    public static void main(String[] args) {
        double result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        double result3 = square(17, 3);
        System.out.println(" p = 17, k = 3, s = 13.546875, real = " + result3);
    }
}
