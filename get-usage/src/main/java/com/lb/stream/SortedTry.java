package com.lb.stream;

import java.util.stream.Stream;

/**
 * @author lubin
 * @since 1.0
 */
public class SortedTry {

    public static void main(String[] args) {
        PeekTry.User w = new PeekTry.User("w", 10);
        PeekTry.User x = new PeekTry.User("x", 11);
        PeekTry.User y = new PeekTry.User("y", 12);

        Stream.of(2,1,3,6,4,9,6,8,0)
            .sorted((o1, o2) -> o2.compareTo(o1))  // 自定义比较器
            .forEach(e -> System.out.println(e));

        Stream.of(w, x, y)
            .sorted((e1, e2) -> e1.getAge()>e2.getAge()?1:e1.getAge()==e2.getAge()?0:-1)
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
