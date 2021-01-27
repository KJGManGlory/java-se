package com.lizza.Set;

import com.google.common.collect.Sets;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-01-27
 */
public class Guava_Set {

    public static void main(String[] args){
        long now = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Set<String> set = new HashSet<>();
        }
        System.out.println((System.currentTimeMillis() - now));
    }
}
