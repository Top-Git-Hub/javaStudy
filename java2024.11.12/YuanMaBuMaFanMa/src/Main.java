public class Main {
    public static void main(String[] args) {
        byte a=10;//byte类型10的二进制表现形式为00001010
        int b=a;//int为三个字节在00001010前补零所以为0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(b);
        int c=300;//0000 0000 0000 0000 0000 0001 0010 1100
        byte d=(byte)c;//强制转换因为byte是一个字节所以去掉三个字节
        System.out.println(d);//00101100
        int e=200;//0000 0000 0000 0000 0000 0000 1100 1000
        byte f=(byte)e;//11001000,此时为补码形式
        System.out.println(f);//-56
    }
}