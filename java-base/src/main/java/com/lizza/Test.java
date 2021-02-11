package com.lizza;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-01-30
 */
public class Test {

    public static void main(String[] args){
        BigDecimal b = BigDecimal.ZERO;
        System.out.println(b.doubleValue());
        System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }
}
