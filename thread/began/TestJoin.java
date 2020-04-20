package thread.began;


/**
 * @author: Dennis
 * @date: 2020/3/26 15:53
 */
// 测试 join 方法  想象为插队
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程 vip 来了" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 启动线程
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        // 主线程
        for (int i = 0; i < 1000; i++) {
            if (i == 200) {
                thread.join();
                // 调用 join 阻塞其他进程
            }
            System.out.println("main" + i);
        }
    }
}
