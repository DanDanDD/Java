package D2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Goods {
    private String name;
    private int maxSize;
    private int currentSize;
    private Lock lock = new ReentrantLock();
    private Condition producerQueue = lock.newCondition();
    //消费者等待队列
    private Condition consumerQueue = lock.newCondition();

    public Goods(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setGoods(String name) {
        try {
            lock.lock();
            //此时商品数量已经达到最大值，生产者需要阻塞
            while (currentSize == maxSize) {
                System.out.println(Thread.currentThread().getName() + "商品数量已达到最大值，生产者等待");
                producerQueue.await();
            }
            this.name = name;
            currentSize++;
            System.out.println(Thread.currentThread().getName() + "生产商品" + toString());
            //唤醒消费者
            consumerQueue.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
//消费者方法
public void getGoods(){
    try{
        lock.lock();
        //当前商品数量为0,消费者等待
        while (currentSize==0){
            System.out.println(Thread.currentThread().getName()+"商品为空，消费者等待");
            consumerQueue.await();
        }
        currentSize--;
        System.out.println(Thread.currentThread().getName()+"消费"+toString());
        //唤醒生产者线程
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
        lock.unlock();
    }
}

}

class Producer implements Runnable{
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
                this.goods.setGoods("BMW 730Li");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                this.goods.getGoods();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ConditionCPJ {
    public static void main(String[] args) {
        List<Thread> list= new ArrayList<>();
        Goods goods = new Goods(10);
        Producer producer= new Producer(goods);
        Consumer consumer= new Consumer(goods);
        //产生五个生产者线程
        for (int i = 0;i<5;i++){
            list.add(new Thread(producer,"生产者"+(i+1)));
        }
        //产生10个消费者
        for (int i = 0;i<10;i++){
            list.add(new Thread(consumer,"消费者"+(i+1)));
        }
        for (Thread thread :list){
            thread.start();
        }

    }
}