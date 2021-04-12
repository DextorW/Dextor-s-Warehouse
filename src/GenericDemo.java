import java.util.*;
public class GenericDemo {
    public static void main(String[] args) {
        //实例化ArrayList对象
        ArrayList<String> list = new ArrayList<String>();   //泛型类
        list.add("Jack");
        list.add("Frank");
        list.add("Annie");
        list.add("William");
        list.add("Rachel");
        //添加重复元素
        list.add("Annie");
        list.add(0, "Tom");

        System.out.println(list);
        //移除Annie，移除最前面的Annie
        //list.remove("Annie");
        list.remove(2);

        System.out.println("*********************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("*********************");
        //增强for循环,foreach循环
        for(Object o:list){
            String s=(String)o;
            System.out.println(s);
        }
        System.out.println("*********************");
        System.out.println(list.get(2));
    }
}
