public class Main{
    public static void main(String[] args) {
        message();
    }
    public static void message(){
        System.out.println("Hello world");
        message1();
    }
    public static void message1(){
        System.out.println("Hello world 1");
        message2();
    }
    public static void message2(){
        System.out.println("Hello world 2");
        message3();
    }
    public static void message3(){
        System.out.println("Hello world 3");
    }
}
//Function calls within functions
