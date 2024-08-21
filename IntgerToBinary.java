import java.util.Scanner;
public class IntegerToBinary {
    public static void main(String args[]) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to be converted to string: ");
        num = scanner.nextInt();
        String binaryString = Integer.toBinaryString(num);
        System.out.print( binaryString);
    }
}
