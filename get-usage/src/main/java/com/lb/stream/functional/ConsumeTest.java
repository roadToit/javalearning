package com.lb.stream.functional;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class ConsumeTest {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6)
            .forEach(System.out::println);
    }
}
