package com.lb.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class MinTry {

    public static void main(String[] args) {
        Optional<Integer> integerOptional = Stream.of(0,9,8,4,5,6,-1)
            .min((e1, e2) -> e1.compareTo(e2));  // min 自小的一个，传入比较器，也可能没有（如果数据流为空）
        integerOptional.ifPresent(e -> System.out.println(e));
    }
}
