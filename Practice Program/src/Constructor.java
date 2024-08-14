public class Constructor {
    public Constructor() {
    }

    public static void main(String[] args) {
        A a=new A(4);
    }
}
class A{
    private final int c;

    public A(int b){
        this.c=b;
    }
}