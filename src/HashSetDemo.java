import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Jack");      //使用add进行添加
        set.add("Frank");
        set.add("Annie");
        set.add("William");
        set.add("Rachel");

        System.out.println(set);   //输出时是没有顺序的，需要重写 hashcode进行排序
        //添加相同元素
        set.add("Annie");         //增加相同的元素并不会报错
        set.add(null);            //只能添加一个 null,与不能添加相同的元素是一样的原理

        set.remove("Frank");   //只能通过元素来移除，因为没有了索引


        System.out.println(set);  //删除了Frank，可以通过这个进行输出
        System.out.println("******************");
        //增强 for循环, foreach循环
        for(Object o : set){    //使用 o遍历set
            String s = (String)o;   //将set的值赋给 Object的o 并将 o进行强制类型转换
            System.out.println(s);
        }

        System.out.println("***********************");
        //通过迭代器,遍历出来的也是没有顺序的
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
