package com.company.sample7;

public class pr7 {
    public static class EvensDoesNotExistsInMatrix extends RuntimeException {
        EvensDoesNotExistsInMatrix() {
            super();
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new EvensDoesNotExistsInMatrix();
        } catch (NullPointerException e) {
            System.out.println("1");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
