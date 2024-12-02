package YiChangDemo7;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
        if(age<18||age>30){
            throw new AgeOutOfBoundsException("年龄不符合要求");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age<18||age>30){
            throw new AgeOutOfBoundsException("年龄不符合要求");
        }
    }
}
