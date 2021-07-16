package com.lizza.Map.HashMap;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-07-15
 */
public class Map_5 {

    public static void main(String[] args){
        Map<String, Integer> map = Maps.newConcurrentMap();
        AtomicInteger count = new AtomicInteger(0);
        String key = "a";
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                count.getAndAdd(1);
                map.put(key, count.get());
            }, "name").start();
        }
        System.out.println(map);
    }
}
