package com.lb.stream.functional;

import java.util.stream.Stream;

/**
 * 供应商生产接口
 *
 * 这里一直生产2这个数字，为了能停下来，使用limit
 *
 * @author lubin
 * @since 1.0
 */
public class SupplierTest {

    public static void main(String[] args) {
        Stream.generate(()->2)
            .limit(10)
            .forEach(System.out::println);
    }
}
