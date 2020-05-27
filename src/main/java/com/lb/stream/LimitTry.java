package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class LimitTry {

    public static void main(String[] args) {
        LimitTry limitTry = new LimitTry();
        limitTry.limitTest();
    }

    private void limitTest() {
        Stream.of(1, 2, 3, 4, 5, 6)
            .limit(3)
            .forEach(e -> System.out.println(e));
    }
}
