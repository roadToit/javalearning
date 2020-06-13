package com.lb.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符
 * 1.类型通配符一般是使用 ? 代替具体的类型参数。例如 List<?> 在逻辑上是 List<String>,List<Integer>
 *     等所有 List<具体实参类型>的父类。
 * 2.类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型。
 *
 * @author lubin
 * @since 1.0
 */
public class GenericTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(314);

        // 因为getData()方法的参数是List类型的，所以name，age，number都可以作为这个方法的实参，这就是通配符的作用
        getData(name);
        getData(age);
        getData(number);

        // getUperNumber(name); // 1
        getUperNumber(age); // 2
        getUperNumber(number); // 3

        // 在（// 1）处会出现错误，因为getUperNumber()方法中的参数已经限定了参数泛型上限为Number，所以泛型为
        // String是不在这个范围之内，所以会报错

        /**
         * 类型通配符下限通过形如 List<? super Number>来定义，表示类型只能接受Number及其三层父类类型，如 Object 类型的实例。
         */
    }

    public static void getData(List<?> data) {
        System.out.println("data: " + data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data: " + data.get(0));
    }
}
