package org.leecode.多线程.顺序打印;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @Author: abel
 * @Date: 2022/10/16 19:37
 * @Description: 阻塞队列
 */
class FooBlockingQueue {

    BlockingQueue<String> blockingQueue12,blockingQueue23;

    public FooBlockingQueue() {
        //同步队列,没有容量，进去一个元素，必须等待取出来以后，才能再往里面放一个元素
        blockingQueue12 = new SynchronousQueue<>();
        blockingQueue23 = new SynchronousQueue<>();
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        blockingQueue12.put("stop");
    }

    public void second(Runnable printSecond) throws InterruptedException {
        blockingQueue12.take();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        blockingQueue23.put("stop");
    }

    public void third(Runnable printThird) throws InterruptedException {
        blockingQueue23.take();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
