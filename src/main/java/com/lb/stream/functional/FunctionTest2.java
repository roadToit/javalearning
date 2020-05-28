package com.lb.stream.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 功能
 * 2.运算
 *
 * @author lubin
 * @since 1.0
 */
public class FunctionTest2 {

    public static void main(String[] args) {
        Function<Integer, Integer> square = integer -> integer * integer;  // 定义平方运算

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.stream()
            .map(square.andThen(square)) // 四次方
            .forEach(System.out::println);

        System.out.println("------");

        list.stream()
            .map(square.compose(e -> e-1)) // 减1再平方
            .forEach(System.out::println);

        System.out.println("------");

        list.stream()
            .map(square.andThen(square.compose(e -> e/2))) //先平方然后除2再平方
            .forEach(System.out::println);
    }
}
