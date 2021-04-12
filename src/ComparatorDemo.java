import java.util.*;
class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//按照名字排序
class NameComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.name.compareTo(p2.name);
    }
}

//按照年龄排序
class AgeComp implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.age-p2.age;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Jack",20);
        Person p2=new Person("Frank",18);
        Person p3=new Person("Annie",23);

        ArrayList list = new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //NameComp nc = new NameComp();
        AgeComp nc = new AgeComp();  //实例化比较器
        Collections.sort(list,nc);
        //还是自动调用compare方法，前面的参数是数组实例化的对象
        //后面的参数是迭代器实例化的对象

        System.out.println(list);
    }
}
