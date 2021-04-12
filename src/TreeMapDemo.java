import java.util.*;
public class TreeMapDemo {    //这个是有序的，按照自然顺序进行排序
    public static void main(String[] args) {  //只要含有tree，都可以进行排序
        TreeMap map = new TreeMap();          //不允许有 null键
        map.put("S001", "Jack");              //TreeMap要求 key值的类型相同
        map.put("S002", "Frank");
        map.put("S003", "Annie");
        map.put("S004", "William");
        map.put("S005", "Rachel");


        System.out.println(map);

        System.out.println(map.get("S003"));  //通过键值获得value，这一点和 HashMap一样

        //通过键值移除值
        map.remove("S002");
        //获得Map接口的键的集合，在获得键的集合的迭代器
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){ //还有下一个键吗
            //获得下一个键
//            Object o = it.next();
//            String key = (String)o;
//            Object o2 = map.get(key);   //留意这个地方，是取得 当前Map下 key对应的 value值
//            String value = (String)o2;

            String key = (String)it.next();
            String value = (String)map.get(key);   //get里面就填写 value就可以了
            System.out.println(key+"<==>"+value);
        }
    }
}
