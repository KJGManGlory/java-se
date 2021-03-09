package com.lizza.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-09
 */
public class Map_1 {

    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>(){{
            put("k1", "v1");
            put("k2", "v2");
            put("k3", "v3");
        }};
        System.out.println(map.getOrDefault("k3", ""));
        System.out.println(map.getOrDefault("k4", ""));
        System.out.println(map.getOrDefault("k3", "").contains("v3"));
        System.out.println(map.getOrDefault("k4", "").contains("v4"));
    }

}
