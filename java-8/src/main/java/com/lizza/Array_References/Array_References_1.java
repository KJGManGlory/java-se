package com.lizza.Array_References;

import java.util.Arrays;
import java.util.function.Function;

/**
 * 数组引用
 */
public class Array_References_1 {

    public static void main(String[] args){
        Function<Integer, Integer[]> function = Integer[]::new;
        System.out.println(function.apply(5).length);
    }
}
