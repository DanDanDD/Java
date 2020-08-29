import java.util.*;

/**
 * @author: Dennis
 * @date: 2020/8/8 14:58
 */

public class Main3 {
//    public String frequencySort (String s) {
//        // write code here
//        int N = s.length();
//        HashMap<Character,Integer> map = new HashMap<>();
//        char[] arr = s.toCharArray();
//        for (char c : arr){
//            if (map.containsKey(c)){
//                int i = map.get(c);
//                i++;
//                map.put(c,i);
//            }else {
//                map.put(c,1);
//            }
//        }
// 
//    }
public static void main(String[] args) {
    String s = "taeeaaa";
    HashMap<Character,Integer> map = new HashMap<>();
    char[] arr = s.toCharArray();
    for (char c : arr){
        if (map.containsKey(c)){
            int i = map.get(c);
            i++;
            map.put(c,i);
        }else {
            map.put(c,1);
        }
    }
    Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
    ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character, Integer>>();

    Collections.sort(list, new Comparator<HashMap.Entry<Character, Integer>>() {
        @Override
        public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
            if (o1.getValue() < o2.getValue()){
                return 1;
            }else if (o1.getValue() > o2.getValue()){
                return 0;
            }else {
                return -1;
            }
        }
    });

    for (int i = 0; i < list.size(); i++) {
        Map.Entry<Character, Integer> integerEntry = list.get(i);
        int N = integerEntry.getValue();
        for (int i1 = 1; i1 < N; i1++) {
            System.out.println(integerEntry.getKey());
        }
    }

}
}
