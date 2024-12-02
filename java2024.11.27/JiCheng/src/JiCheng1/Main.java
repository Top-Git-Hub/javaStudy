package JiCheng1;

public class Main {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.main();
        zi.main1();
    }
}
class Ye{
    String name = "Ye";
}
class Fu extends Ye {
    String name = "Fu";
    public void main1() {
        System.out.println(super.name);
    }
}
class Zi extends Fu {
    String name = "Zi";
    public void main() {
        String name = "showbiz";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}