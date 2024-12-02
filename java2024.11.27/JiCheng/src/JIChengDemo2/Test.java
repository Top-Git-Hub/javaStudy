package JIChengDemo2;

public class Test {
    public static void main(String[] args) {
        Huskies h= new Huskies();
        h.eat();
        h.special();
        h.Drink();
        System.out.println("------------------------");
        SharPei s= new SharPei();
        s.eat();
        s.special();
        s.Drink();
        System.out.println("------------------------");
        ChinesePastoralDog c= new ChinesePastoralDog();
        c.eat();
        c.special();
        c.Drink();
    }
}
class Dog{
    public void eat(){
        System.out.println("吃饭");
    }
    public void Drink(){
        System.out.println("喝水");
    }
    public void special(){
        System.out.println("看家");
    }
}

class Huskies extends Dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("吃狗粮");
    }
    @Override
    public void special(){
        super.special();
        System.out.println("拆家");
    }

    @Override
    public void Drink() {
        super.Drink();
    }
}

class SharPei extends Dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("吃狗粮");
        System.out.println("吃骨头");
    }
    @Override
    public void special(){
        super.special();
    }
    @Override
    public void Drink() {
        super.Drink();
    }
}

class ChinesePastoralDog extends Dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("吃剩饭");
    }
    @Override
    public void special(){
        super.special();
    }
    @Override
    public void Drink() {
        super.Drink();
    }
}
