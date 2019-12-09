package abstractAndInterface;

/**
 * @author: Dennis
 * @date: 2019/12/4 10:54
 */

class Animal{
    protected String name;


}
interface Ifly{
    void fly();
}
interface Irun{
    void run();
}
class Dog extends Animal implements Ifly{
    @Override
    public void fly() {

    }
}
public class demo {

}
