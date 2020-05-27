package com.lb.volatiledemo;

/**
 * 工作内存与方法区
 *
 * 这段测试代码想达到的效果：有两个线程：我线程、基友线程。【我线程】通过死循环阻塞在那里等待【基友线程】找到笔送过
 * 来，然后开始写字。【基友线程】等待一会就去送笔，找到了就送过去。两个线程的唯一关联就是静态属性【found】。类中的
 * 静态属性时基本数据类型，所以 Class 对象中存储的事 【found】的值而非引用，且 Class 对象是存放在方法区的。
 *
 * 如果静态属性【found】不加 volatile 修饰，那两个线程运行后的内存是这样的，即达不到我们想要的效果。为什么是这样呢？
 * 因为 JMM 的约束，线程不能直接操作主内存，只能操作工作内存。但是静态属性是放在主内存中的，所以线程在运行过程中需要
 * 从主内存中拷贝一份放到自己的虚拟机栈中。所以虽然【基友线程】修改了静态属性【found】的值，但是这个修改只有自己线程
 * 可见，所以达不到我们想要的结果。
 *
 * @author lubin
 * @since 1.0
 */
public class Test3 {

    public static boolean found = false;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("等基友送笔来...");

                while (!found) {}

                System.out.println("笔来了，开始写字...");
            }
        }, "我线程").start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("基友找到笔了，送过去...");

                found = true;
            }
        }, "基友线程").start();
    }
}
