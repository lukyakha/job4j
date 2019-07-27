package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(175);
        System.out.println("The perfect weight of a man of 175 cm is " + man + " kg");
        double woman = womanWeight(175);
        System.out.println("The perfect weight of a woman of 175 cm is " + woman + " kg");
    }
}
