/**
 * @author: Dennis
 * @date: 2020/7/18 18:14
 */

// 内部类可以访问所在类的属性（包括私有属性）
public class Test {
    private int number = 100;
    public class Inner{
        private int number = 200;
        public void print(){
            int number = 300;
            System.out.println(number);
            System.out.println(this.number);
            System.out.println(Inner.this.number);
            System.out.println(Test.this.number);
        }
    }

    public static void main(String[] args) {
        // 内部类创建自身对象需要先创建所在类的对象
        Test t = new Test();
        Test.Inner inner = t.new Inner(); // 创建内部类的两个步骤
        inner.print();
    }
}
