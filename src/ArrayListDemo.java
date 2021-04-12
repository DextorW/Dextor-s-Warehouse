import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        //必须先实例化ArrayList对象
        ArrayList list = new ArrayList();
        list.add("Jack");       //使用add进行添加
        list.add("Frank");
        list.add("Annie");
        list.add("William");
        list.add("Rachel");
        //添加重复元素
        list.add("Annie");
        //list.add(0,"Tom");  //这个是用索引进行添加元素
        //添加 null值
        list.add(null);

        System.out.println(list);
        //移除Annie
        //list.remove("Annie"); //此处优先删除第一个Annie
        list.remove(2);   //留意此处，这个地方删除的是Annie，因为ArrayList是从0号位置开始记录的

        System.out.println("****************************");
        for(int i = 0; i<list.size(); i++){  //普通 for循环  查看 list的大小是使用 size()
            System.out.println(list.get(i));
        }

        System.out.println("****************************");
        //增强 for循环，也成为 foreach循环
        for(Object o : list){  //因为没有使用泛型，所以取出的都为 Object类型
            String s = (String)o;   //因为是Object类型，所以需要进行强制类型转换
            System.out.println(s);
        }
        System.out.println("****************************");
        System.out.println(list.get(2));  //在之前的第20行进行删除后，之前的索引向前进
    }
}
