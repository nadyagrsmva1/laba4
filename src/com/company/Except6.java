package com.company;

public class Except6 {
    public static void main(String[] args) {
        try {
            int I = args.length;
            System.out.println("размер массива= "+I);
            int h=10/I;
            args[I+I] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
