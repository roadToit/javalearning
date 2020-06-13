package com.lb.stream.functional;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * 操作员操作接口
 * 1.BinaryOperator 这里实现找优
 *
 * @author lubin
 * @since 1.0
 */
public class BinaryOperatorTest1 {

    public static void main(String[] args) {
        Stream.of(2,34,5,6,7,1)
            .reduce(BinaryOperator.maxBy(Comparator.comparingInt(Integer::intValue)))
            .ifPresent(System.out::println);
    }
}
