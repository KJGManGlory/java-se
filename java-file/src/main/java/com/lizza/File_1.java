package com.lizza;

import cn.hutool.core.util.StrUtil;

import java.io.*;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-22
 */
public class File_1 {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/lizza/Desktop/20210319.log");
        FileInputStream is = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String str;
        while(StrUtil.isNotBlank(str = reader.readLine())) {
            if (StrUtil.contains(str, "uid=")) {
                System.out.println("(create_time = '" + str.substring(1, 20) + "' and api = '/sec/card/use' and uid = '" + str.substring(str.indexOf("uid=") + 5, str.indexOf("gid=") - 3) + "') or");
            }
        }
        is.close();
        reader.close();
    }
}
