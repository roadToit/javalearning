package com.lb.stream.functional;

import java.util.stream.IntStream;

/**
 * 谓词断言接口
 *
 * 筛选出大于0最小的两个数
 *
 * @author lubin
 * @since 1.0
 */
public class PredicateTest {

    public static void main(String[] args) {
        IntStream.of(200, 45, 89, 10, -200, 78, 94)
            .filter(e -> e > 0)    // 过滤小于0的数
            .sorted()              // 自然顺序排序
            .limit(2)              // 提取前2个
            .forEach(System.out::println);
    }
}
