package thread.syn;

/**
 * @author: Dennis
 * @date: 2020/3/29 12:25
 */
// 多个线程互相抱着对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "灰姑娘");
        Makeup g2 = new Makeup(1, "白雪公主");

        new Thread(g1).start();
        new Thread(g2).start();
    }
}

// 口红
class Lipstick {
}

//镜子
class Mirror {

}

class Makeup implements Runnable {
    //需要获取的资源只有一份，使用 static 来保证
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String girlName;

    Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        // 化妆
        makeup();
    }

    // 化妆，互相持有对方的锁，拿到对方的资源
    private void makeup() {
        if (choice == 0) {
            synchronized (lipstick) {
                //  获得口红的锁
                System.out.println(this.girlName + "获得口红的锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (mirror) {
                System.out.println(this.girlName + "获得镜子的锁");
            }
        } else {
            synchronized (mirror) {
                //  获得口红的锁
                System.out.println(this.girlName + "获得镜子的锁");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lipstick) {
                System.out.println(this.girlName + "获得口红的锁");
            }
        }
    }
}

