import java.util.*;
public class TreeSetDemo {
    //TreeSet是Set的一种变体，可以实现按照自然顺序排序。在添加元素时会自动将其插入到已经有序的元素序列中。
    //只有这一点是 TreeSet中独特的，其他的都差不多
    public static void main(String args[]){
        TreeSet set = new TreeSet();
        set.add("Jack");
        set.add("Frank");
        set.add("Annie");
        set.add("William");
        set.add("Rachel");

        System.out.println(set);
    }
}
