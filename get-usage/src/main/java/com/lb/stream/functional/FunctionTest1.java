package com.lb.stream.functional;

import java.util.stream.Stream;

/**
 * 功能
 * 1.转换，将字符串转换成长度
 *
 * @author lubin
 * @since 1.0
 */
public class FunctionTest1 {

    public static void main(String[] args) {
        Stream.of("hello", "FunctionalInterface")
            .map(String::length)
            .forEach(System.out::println);
    }
}
