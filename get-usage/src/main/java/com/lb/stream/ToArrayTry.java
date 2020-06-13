package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class ToArrayTry {

    public static void main(String[] args) {
        Object[] objects = Stream.of(0, 2, 6, 5, 4, 9, 8, -1)
            .toArray();  // toArray 转成数组，可以提供自定义数组生成器
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
