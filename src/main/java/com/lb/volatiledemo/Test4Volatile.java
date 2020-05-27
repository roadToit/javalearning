package com.lb.volatiledemo;

/**
 *  如果普通属性【found】加 volatile 修饰，就可以达到我们想要的效果。为什么能达到？因为 volatile 的关系，【我线程】
 *  每次使用这个普通属性时，底层会去主内存 read-load 一下以保证数据是最新的。【基友线程】修改这个普通属性时，底层会
 *  执行 store-write 操作，将修改的值同步到主内存中。因为两个线程都会一直与主线程的数据保持同步，所以能达到效果。
 *
 *  从而证明 线程工作内存包含堆区。
 *
 * @author lubin
 * @since 1.0
 */
public class Test4Volatile {

    public volatile boolean found = false;

    public static void main(String[] args) {
        final Test4 demo = new Test4();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("等基友送笔来...");

                while (!demo.found){}

                System.out.println("笔来了，开始写字...");
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("基友找到笔了，送过去...");

                demo.found = true;
            }
        }).start();
    }
}
