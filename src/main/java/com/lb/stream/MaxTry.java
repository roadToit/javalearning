package com.lb.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class MaxTry {

    public static void main(String[] args) {
        Optional<Integer> integerOptional = Stream.of(0,9,8,4,5,6,-1)
            .max((e1, e2) -> e1.compareTo(e2));  // max 元素中最大的，需要传入比较器，也可能没有（流为Empty时）
        integerOptional.ifPresent(e -> System.out.println(e));
    }
}
