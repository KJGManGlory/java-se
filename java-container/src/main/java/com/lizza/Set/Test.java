package com.lizza.Set;

/**
 * Java 值传递和引用传递
 */
public class Test {

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        System.out.println(a.funA());
        b.funB();
        System.out.println(a.funA());
        System.out.println(b.funB());
    }
}
