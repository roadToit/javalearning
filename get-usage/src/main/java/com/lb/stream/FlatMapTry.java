package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class FlatMapTry {

    public static void main(String[] args) {
        FlatMapTry flatMapTry = new FlatMapTry();
        flatMapTry.flatMapTest();
    }

    private void flatMapTest() {
        Stream.of("a-b-c-d", "e-f-i-g-h")
            .flatMap(e -> Stream.of(e.split("-")))
            .forEach(e -> System.out.println(e));
    }
}
