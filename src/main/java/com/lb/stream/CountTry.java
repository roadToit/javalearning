package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class CountTry {

    public static void main(String[] args) {
        long count = Stream.of("apple", "banana", "orange", "watermelon", "grape")
            .count();
        System.out.println(count);
    }
}
