import java.util.*;
class Teacher implements Comparable{

    String name;
    int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {  //按照姓名排序或者年纪排序
        Teacher t = (Teacher)o;
//        return this.name.compareTo(t.name);   //这个是按照姓名进行排序
        return this.age-t.age;  //按照年龄从小到大排序
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Jack",20);
        Teacher t2 = new Teacher("Frank",18);
        Teacher t3 = new Teacher("Annie",23);

        ArrayList list = new ArrayList();
        list.add(t1);
        list.add(t2);
        list.add(t3);

        Collections.sort(list);     //自动调用上面的 compareTo方法
        System.out.println(list);   //自动调用上面的 toString方法
    }
}
