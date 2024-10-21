public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibo(4));
    }
    public static int Fibo(int n){
        //base condition
        if(n < 2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);//This approach cannot calculate the 50th fibonacci number due to stack overflow errors
        //A fibonacce can be used instead,the formulae approach is a more optimised approach
    } 
}
