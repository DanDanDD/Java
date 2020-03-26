package thread;

/**
 * @author: Dennis
 * @date: 2020/3/25 16:21
 */

public class Thread_Rabbit implements Runnable {
    //胜利者
    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            //模拟兔子睡觉
            if (Thread.currentThread().getName().equals("兔子") && i%20==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //判断比赛是否结束
             boolean flag = gomeOver(i);
             if (flag){
                 break;
             }

            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    //判断是否完成比赛
    private boolean gomeOver(int steps){
        //判断是否有胜利者
        if (winner != null){
            return true;
        }
        if (steps >= 100){
            winner = Thread.currentThread().getName();
            System.out.println("胜利者是" + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Thread_Rabbit thread_rabbit = new Thread_Rabbit();
        new Thread(thread_rabbit,"兔子").start();
        new Thread(thread_rabbit,"乌龟").start();

    }

}
