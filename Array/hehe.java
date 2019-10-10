package Day1;

public class hehe {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue+1);
        System.out.println(minValue-1);
        Integer a = 10;
        Integer b = 10;
        System.out.println(a==b);

        Integer c = 128;
        Integer d = 128;
        System.out.println(c==d);

        int e = 128;
        int f = 10;
        System.out.println(e==c);
        System.out.println(f==a);

        Integer g = new Integer(10);
        Integer h = new Integer(10);
        System.out.println(g==h);

    }
}