package com.lb.stream.functional;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

/**
 * 2.操作员
 * 这里实现累加功能
 *
 * @author lubin
 * @since 1.0
 */
public class BinaryOperatorTest2 {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (e1, e2) -> e1 + e2;  // 定义求和二元操作
        IntStream.of(2,4,5,6,7,1)
            .reduce(intBinaryOperator)
            .ifPresent(System.out::println);
    }
}
