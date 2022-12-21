package basic;

public class functionexample {
    int x;
    int y;
}
class test{
    public static void main(String[] args) {
        functionexample f = new functionexample();
        f.x=10;
        f.y=20;
        fun(f);
        System.out.println(f.x+" "+ f.y);
    }

    private static void fun(functionexample f) {
        f.x =50;
        f.y =60;
    }
}
