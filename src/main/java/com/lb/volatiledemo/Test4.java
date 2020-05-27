package com.lb.volatiledemo;

/**
 * 工作内存与堆内存
 *
 * 这段测试代码想要达到的效果与上面类似，去呗只是这次两个线程唯一的关联是普通属性（上面是静态属性）。类的普通属性
 * 是与对象关联在一起的，而对象的实体是存放在堆区的。
 *
 * 若果普通属性【found】不加volatile修饰，那两个线程运行后的内存是这样的，即达不到我们想要的结果。为什么是这样呢？
 * 因为 JMM 的约束，线程不能直接操作主内存，只能操作工作内存。但是属性是放在主内存中的，所以线程在运行过程中需要从
 * 主内存中拷贝一份放到自己的虚拟机栈中。所以虽然【基友线程】修改了普通属性【found】的值，但是这个修改只有自己可见，所以
 * 达不到我们想要的结果。
 *
 * @author lubin
 * @since 1.0
 */
public class Test4 {
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
