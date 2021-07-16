package com.lizza.Map.HashMap;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-07-15
 */
public class Map_4 {

    public static void main(String[] args){
        Map<String, Integer> map = Maps.newHashMap();
        map.put("a", 1);
        map.put("b", 1);
        for (int i = 0; i < 5; i++) {
            map.compute("b", (k, v) -> map.get(k));
        }
        System.out.println(map);
    }
}
