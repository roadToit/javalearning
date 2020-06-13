package com.lb.volatiledemo;

/**
 * 借助 volatile 关键字证明我的结论：工作内存 = 虚拟机栈 + 方法区（元空间） + 堆区。
 *
 *
 * 如果静态属性【found】加 volatile 修饰，就可以达到我们想要的效果。为什么可以达到呢？因为 volatile 的关系，
 * 【我线程】每次使用这个静态属性时，底层会去主内存 read-load 一下以保证数据是最新的。【基友线程】修改这个静态
 * 属性时，底层会执行 store-write 操作，将修改的值同步到主内存中。因为两个线程都会一直与主线程的数据保持同步，
 * 所以能达到效果。
 *
 * 从而证明 线程工作内存包含方法区。
 *
 * @author lubin
 * @since 1.0
 */
public class Test3Volatile {

    public volatile static boolean found = false;

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
