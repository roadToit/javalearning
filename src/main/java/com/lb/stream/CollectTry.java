package com.lb.stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class CollectTry {

    public static void main(String[] args) {
//        Stream.of("apple", "banana", "orange", "watermelon", "grape")
//            .collect(Collectors.toSet())  // Set容器
//            .forEach(e -> System.out.println(e));

        Set<String> stringSet = Stream.of("apple", "banana", "orange", "watermelon", "grape")
            .collect(Collectors.toSet());  // 收集的结果就是Set
        stringSet.forEach(e -> System.out.println(e));  // set的语法糖forEach
    }
}
