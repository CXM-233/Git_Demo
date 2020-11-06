package demo.javademo.demo01.test;

public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.abx(3, 4));
        t.login();
    }

    public void login() {
        System.out.println("login");
    }

    public int abx(int a, int b) {
        return a + b;
    }

}
