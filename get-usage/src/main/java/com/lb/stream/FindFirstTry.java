package com.lb.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class FindFirstTry {

    public static void main(String[] args) {
        Optional<String> stringOptional = Stream.of("apple", "banana", "orange", "watermelon", "grape")
            .findFirst(); // findFirst获取流中的第一个元素
        stringOptional.ifPresent(e -> System.out.println(e));
    }
}
