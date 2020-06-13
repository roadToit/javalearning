package com.lb.generic;

/**
 * 有界的类型参数：
 * 可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围。例如，一个操作数字的方法可能只希望接受
 * Number或者Number子类的实例。这就是有界参数类型的目的。
 * 要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。
 *
 * 下面的例子演示了"extends"如何使用在一般意义上的意思"extends"（类）或者"implements"（接口）。该例子中的
 * 泛型方法返回三个可比较对象的最大值。
 *
 * @author lubin
 * @since 1.0
 */
public class MaximumTest {

    // 比较三个值并返回最大值
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // 假设x是初试最大值
        if (y.compareTo(max) > 0) {
            max = y; // y更大
        }
        if (z.compareTo(max) > 0) {
            max = z; // 现在z 更大
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n", 3, 4, 5, maximum(3, 4, 5));

        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
    }
}
