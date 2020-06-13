package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class ReduceTry {

    public static void main(String[] args) {
        // reduce 是一个规约操作，所有的元素规约成一个，比如对所有元素求和，乘啊等。
        // 这里实现了一个加法，指定了初始化的值
        int sum = Stream.of(0, 9, 8, 4, 5, 6, -1)
            .reduce(0, (e1,e2) -> e1+e2);
        System.out.println(sum);
    }
}
