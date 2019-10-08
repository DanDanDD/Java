package D2;

public class textString {
    public static void main(String[] args) {
        String str = new String ("hello");
        //new 开辟新的空间
        String str1 = "hello";
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
        //equals 和 ==
        //equals 比较字符串内容    ==对于引用类而言，比较两者指向的堆内存地址是否相同
        //使用equals进行比较时   将字符串常量写在equals前面，避免NullPointerException
        String str2=new String("hello");
        System.out.println(str1==str2);
        //采用构造方法实例化的String对象不会入池
        String str3=new String("hello").intern();
        System.out.println(str1==str3);
        //采用 intern（）方法手工入池
        String str4="123a4";
        panduan(str4);
        System.out.println(str1.charAt(2));
        // charAT(0)取得索引位置的字符，索引从2开始
    }
    public static void panduan(String str4){
        if (isAllNumber(str4)){
            System.out.println("全部由数字组成");
        }else {
            System.out.println("含有非数字字符");
        }
    }

    public static boolean isAllNumber(String str4){
        char[] data = str4.toCharArray();
        //toCharArray（）方法将字符串变为字符数组
        for (int i =0;i<data.length;i++){
            char c = data[i];
            if (c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }

}

