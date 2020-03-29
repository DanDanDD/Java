package thread.syn;

/**
 * @author: Dennis
 * @date: 2020/3/29 12:25
 */
// 多个线程互相抱着对方需要的资源，然后形成僵持

// 口红
class Lipstick{

}

//镜子
class Mirror{

}

class Makeup implements Runnable{
    //需要获取的资源只有一份，使用 static 来保证
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    @Override
    public void run() {

    }
}
public class DeadLock {
}
