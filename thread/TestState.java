package thread;

/**
 * @author: Dennis
 * @date: 2020/3/26 16:20
 */
// 观察线程状态
public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("---------");
        });
        // 观察状态
        Thread.State state = thread.getState();;
        System.out.println(state);

        // 观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state);

        while (state != Thread.State.TERMINATED){
            Thread.sleep(100);
            state = thread.getState();  // 更新线程状态
            System.out.println(state);
        }
        // thread.start;
        // 死亡之后的线程不能再启动

    }
}
