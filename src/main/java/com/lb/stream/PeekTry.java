package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class PeekTry {

    public static void main(String[] args) {
        User w = new User("w", 10);
        User x = new User("x", 11);
        User y = new User("y", 12);

        // peek 挑选，将元素挑选出来，可以理解为提前消费
        Stream.of(w, x, y)
            .peek(e -> {e.setName(e.getAge() + e.getName());})  // 重新设置名字 变成 年龄+名字
            .forEach(e -> System.out.println(e));
    }

    static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }
}
