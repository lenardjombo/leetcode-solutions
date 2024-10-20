public class Pyramid {
    public static void main(String[] args) {
        
        pyramid(5);//Number of rows for the pyramid
    }
    static void pyramid(int n){
        for(int row = 1; row <= n;row++){ //Oter for loop for rows
            for(int sp = row;sp < n;sp++){//Print spaces before stars
                System.out.print(" ");
            }
            for(int col = 1; col <= (2*row - 1);col++){
                System.out.print("*");
            }
            System.out.println();//Move to the next line after printing the row
        }
    }
}
