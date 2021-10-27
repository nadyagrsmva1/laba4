package com.company;

public class Except7 {
    public static void m(int x) throws ArithmeticException  {
        int h=10/x;
    }
    public static void main(String[] args) {
        try {
            int I = args.length;
            System.out.println("размер массива= "+I);
            m(I);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
