public class FiboFormulae{
    public static void main(String[] args) {
        for(int i =0;i < 11;i++){
            System.out.println(fiboformulae(i));
        }
    }
    public static int fiboformulae(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n));
    }
}
