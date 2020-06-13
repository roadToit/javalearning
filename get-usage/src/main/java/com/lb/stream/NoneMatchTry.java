package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class NoneMatchTry {

    public static void main(String[] args) {
        boolean result = Stream.of("aa", "bb", "cc", "aa")
            .noneMatch(e -> e.equals("aa"));  // 这里的作用是判断数据流中一个都没有与aa相等的元素，
                                                // 但是流中存在aa，所以最终结果应该是false
        System.out.println(result);

//        allMatch 和 anyMatch 一个是全匹配，一个是任意匹配 和 noneMatch 类似
    }
}
