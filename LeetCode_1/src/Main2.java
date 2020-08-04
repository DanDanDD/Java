import java.util.*;

/**
 * @author: Dennis
 * @date: 2020/7/31 14:26
 */

public class Main2 {

    public String PrintMinNumber(Integer [] s) {
        if(s==null){
            return null;
        }

        String s1="";
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(s));
//        for(int i=0;i<s.length;i++){
//             list.add(s[i]);
//        }

        Collections.sort(list,new Comparator<Integer>(){//数组里的数两两组合比较，按照比较值更得的顺序升序排序
            @Override
            public int compare(Integer str1, Integer str2){
                String s1=str1+""+str2;
                String s2=str2+""+str1;
                return s1.compareTo(s2);//变成-s1.compareTo(s2)就是降序排序了
            }
        });
        for(int j:list){
            System.out.println("输出为:"+j);
            s1 += j;
        }
        return s1;
    }

    public static void main(String[] args) {

        Integer [] list={3,32,321};
        Main2 demo=new Main2();
        System.out.println(demo.PrintMinNumber(list));
    }

}
