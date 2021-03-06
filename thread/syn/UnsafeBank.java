package thread.syn;

/**
 * @author: Dennis
 * @date: 2020/3/27 16:27
 */
// 账户
class Account {
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

// 银行取款
class Drawing extends Thread {
    Account account; // 账户
    int drawingMoney; // 取了多少钱
    int nowMoney; // 现在手里有多少钱

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;

    }

    // 取钱
    @Override
    public void run() {
        /*
        synchronized 默认锁的是 this
        *****锁的对象是变化的量，需要增删查改的量 *****
         */
        synchronized (account) {
            // 判断有没有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "钱不够了,取不了");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 卡内余额 = 余额 - 你取的钱
            account.money = account.money - drawingMoney;
            // 你手里的钱
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account.name + "余额为：" + account.money);
            System.out.println(this.getName() + "手里的钱" + nowMoney);
        }

    }
}

public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(100, "总钱数");
        Drawing you = new Drawing(account, 50, "you");
        Drawing yourfrinend = new Drawing(account, 100, "youfriend");

        you.start();
        yourfrinend.start();
    }
}
