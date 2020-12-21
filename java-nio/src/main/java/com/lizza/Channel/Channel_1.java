package com.lizza.Channel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Channel的基础示例
 */
public class Channel_1 {

    public static void main(String[] args) throws Exception {
    	RandomAccessFile file = new RandomAccessFile("demo.txt", "rw");
        FileChannel channel = file.getChannel();
        // 创建一块 64 个字节的 Buffer
        ByteBuffer buffer = ByteBuffer.allocate(64);
        // 将数据读入 buffer
        while (channel.read(buffer) != -1) {
            // 翻转 buffer, 准备从 buffer 中读出数据
            buffer.flip();
            while (buffer.hasRemaining())
                // 每次读出一个字节
                System.out.print((char) buffer.get());
            // 清空这块 buffer, 为下一次写入做准备
            buffer.clear();
        }
        file.close();
    }
}
