import java.util.*;
class Student{
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
public class VectorDemo {

    public static void main(String[] args) {
        //实例化三个学生对象
        Student s1 = new Student("Jack",21);
        Student s2 = new Student("Annie",20);
        Student s3 = new Student("Frank",22);

        Vector list = new Vector();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(null);   //Vector可以添加 null


        System.out.println(list);
        System.out.println("*************************");
        for(int i = 0;i < list.size(); i++){   //普通for循环
            System.out.println(list.get(i));
        }

        System.out.println("*************************");
        //增强 for循环，也成为 foreach循环
        for(Object o : list){  //因为没有使用泛型，所以取出的都为 Object类型
            Student s = (Student)o;   //因为是Object类型，所以需要进行强制类型转换
            //list是Vector类型的, 而 o是Object类型的，当然不能.出什么东西
            System.out.println(s);
        }
    }
}
