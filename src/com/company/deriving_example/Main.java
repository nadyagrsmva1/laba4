package com.company.deriving_example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    protected static class base {
        void fn() {
            System.out.println("base");
        }
        void fn2()  {
            System.out.println("base.fn2");
        }
    }
    protected static class derived1 extends base {
        void fn()  {
            System.out.println("der1");
        }
        void foo() {
            System.out.println("der1.foo");
        }
    }
    protected static class derived3 extends derived1 {
        void foo() {
            System.out.println("der3.foo");
        }
    }
    protected static class derived2 extends base {
        void fn() {
            try {
                String str = "Hello";
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                writer.write(str);

                writer.close();
            }
            catch (IOException err) {
                System.out.println("file write error");
            }
        }
        void fn2() {
            System.out.println("der2.fn2");
        }
        void foo() {
            System.out.println("der2.foo");
        }
    }

    public static void main(String[] args) {
        ArrayList<base> list = new ArrayList<>();
        list.add(new derived1());
        list.add(new derived3());
        list.add(new derived2());
        list.add(new derived1());
        list.add(new base());

        for (base element : list) {
            element.fn();
            element.fn2();
            if (element instanceof derived1)
                ((derived1) element).foo();
            System.out.println("");
        }
    }
}
