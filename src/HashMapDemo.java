import java.util.*;
public class HashMapDemo { //这个输出也是乱序的
    public static void main(String[] args) {   //Map为 (Key,Value)
        HashMap map = new HashMap();
        map.put("S001","Jack");
        map.put("S002","Frank");
        map.put("S003","Annie");
        map.put("S004", "William");
        map.put("S005", "Rachel");

        System.out.println(map);

        System.out.println(map.get("S003"));  //可以获得 Key为 "S003"的 Value

        //获得Map接口的键的集合，在获得键的集合的迭代器
        Iterator it = map.keySet().iterator();   //HashMap只能使用迭代器进行遍历
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
