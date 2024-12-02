import java.util.ArrayList;

//集合
//集合存储数据类型的特点
//集合可以直接储存引用数据类型，如果要储存基本数据类型，需要先将其转化成包装类
//集合长度可变，会根据存储的元素数量变化长度

//成员方法
//1.add()方法
//boolean add(E e):添加元素,返回值表示是否添加成功
//2.remove()方法
// boolean remove(E e):删除指定元素,返回值表示是否删除成功
//E remove(int index):删除指定索引的元素,返回被删除元素
//3.set()方法
//E set(int index,E element):修改指定索引位置的元素,返回原来的元素
//4.get()方法
//E get(int index):获取指定索引位置的元素,返回值就是对应位置的元素
//5.size()方法
//int size():获取集合中元素的个数,返回值是集合中元素的个数
public class Main {
    public static void main(String[] args) {
        //1.创建集合对象

        //此时我们创建的是ArrayList的对象,而ArrayList是java已经写好的一个类
        //这个类在底层做了一些处理
        //打印对象不是地址值,而是集合中存储数据内容
        //在展示的时候会拿[]把所有的数据进行包裹
        ArrayList<String> list = new ArrayList<>();//在第一个尖括号内加入引用数据类型
        System.out.println(list);//[ ]

        //2.添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);//[hello, world, java]
        //list.add("1").add("2").add("3");不能直接链式编程
        //3.删除元素
        boolean hello = list.remove("hello");
        boolean hello1 = list.remove("hellv");
        System.out.println(list);//[world, java]
        System.out.println(hello);//true
        System.out.println(hello1);//false
        String remove = list.remove(1);
        System.out.println(remove);//java,返回被删除的元素
        System.out.println(list);//[world]
        //4.修改元素
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("java");
        String set = list1.set(1, "javaee");
        System.out.println(set);//world,返回被修改的元素
        System.out.println(list1);//[hello, javaee, java]

        //5.获取元素
        String s = list1.get(1);
        System.out.println(s);//javaee

        //6.获取集合长度
        int size = list1.size();
        System.out.println(size);//3
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+" ");//hello  javaee  java
        }

    }
}