package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class SkipTry {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9)
            .skip(4)  // 跳过前4个
            .forEach(e -> System.out.println(e));  // 输出的结果应该只有5,6,7,8,9
    }
}
