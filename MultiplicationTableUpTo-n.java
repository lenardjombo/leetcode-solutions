
import java.util.Scanner;
class MultiplicationTableUpToN {
    public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number :");
    n = scanner.nextInt();
    for(int i = 1; i<=10; i++)
    System.out.println(n + " * "+ i + " = "+(n * i));
    }
}
