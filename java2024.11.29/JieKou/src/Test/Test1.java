package Test;

import java.util.ArrayList;
import java.util.Scanner;

public  class Test1 {
    public static void main(String[] args) {
        String s="story";
        s="ss";
        s=s+100;
        String t=s+"hello";
        System.out.println(s);
        System.out.println(t);
        int l=t.length;
        ArrayList<Pet> list = Mini();
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).getBlood() > list.get(j + 1).getBlood()) {
                    int temp = list.get(j).getBlood();
                    list.get(j).setBlood(list.get(j + 1).getBlood());
                    list.get(j + 1).setBlood(temp);
                    String name = list.get(j).getName();
                    list.get(j).setName(list.get(j + 1).getName());
                    list.get(j + 1).setName(name);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getBlood());
        }
    }


public static ArrayList<Pet> Mini() {
    ArrayList<Pet> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
        Pet p = new Pet();
        System.out.println("请输入第" + (i + 1) + "只宠物的名字：");
        String name = sc.next();
        System.out.println("请输入第" + (i + 1) + "只宠物的血量：");
        int blood = sc.nextInt();
        p.setBlood(blood);
        p.setName(name);
        list.add(p);
    }
    return list;
}
}

