package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class ForEachOrderedTry {

    public static void main(String[] args) {
        // forEach 其实以前就已经见过了，对每个数据遍历迭代

        // forEachOrdered 适用于并行流的情况下进行迭代，能保证迭代的有序性
        // 此处通过并行的方式输出数字
        Stream.of(0, 2, 6, 5, 4, 9, 8, -1)
            .parallel()
            .forEachOrdered(e -> {
                System.out.println(Thread.currentThread().getName() + ": " + e);
            });
    }
}
