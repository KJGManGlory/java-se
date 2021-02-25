package com.lizza.Collectors;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-02-25
 */
public class Collector_toMap {

    public static void main(String[] args){
        Arrays.stream(Season.values()).forEach(System.out::println);
        HashMap<String, Integer> map = Arrays.stream(Season.values())
                .collect(Collectors.toMap(Season::getName, Season::getValue, (e1, e2) -> e1, Maps::newHashMap));
        System.out.println(map);
    }
}
