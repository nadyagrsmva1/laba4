package com.company.my_sample;

import javax.management.RuntimeErrorException;

public class harder {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("0");
                throw new RuntimeErrorException(new Error());
            } catch (RuntimeErrorException e) {
                System.out.println("1");
                throw new NullPointerException();
            } catch (NullPointerException e) {
                System.out.println("2");
            }
        } catch (RuntimeErrorException e) {
            System.out.println("3");
        } catch (NullPointerException e) {
            System.out.println("4");
        }
        System.out.println("5");
    }
}
