package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class MapTry {

    public static void main(String[] args) {
        MapTry mapTry = new MapTry();
        mapTry.testMap();
        mapTry.testMapToDouble();
    }


    private void testMap() {
        // 使用lambda表达式
        Stream.of("apple", "banana", "orange", "watermelon", "grape")
            .map(e -> e.length())  // 转成单词的长度 int
            .forEach(e -> System.out.println(e)); // 输出

        // 使用函数引用
        Stream.of("apple", "banana", "orange", "watermelon", "grape")
            .map(String::length)
            .forEach(System.out::println);
    }

    private void testMapToInt() {
        Stream.of("apple", "banana", "orange", "watermelon", "grape")
            .mapToInt(e -> e.length())
            .forEach(e -> System.out.println(e));
    }

    private void testMapToLong() {
        Stream.of("apple", "banana", "orange", "watermelon", "grape")
            .mapToLong(e -> e.length())
            .forEach(e -> System.out.println(e));
    }

    private void testMapToDouble() {
        Stream.of("apple", "banana", "orange", "watermelon", "grape")
            .mapToDouble(e -> e.length())
            .forEach(e -> System.out.println(e));
    }
}
