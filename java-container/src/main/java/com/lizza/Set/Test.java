package com.lizza.Set;

import java.util.Set;

/**
 * Java 值传递和引用传递
 */
public class Test {

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        Set<String> tmp = a.funA();
        System.out.println(tmp);
        tmp.add("asdasd");
        System.out.println(tmp);
//        System.out.println(b.funB());
    }
}
