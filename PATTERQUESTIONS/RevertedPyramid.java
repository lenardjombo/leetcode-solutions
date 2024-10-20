public class RevertedPyramid {
    public static void main(String[] args) {
        revertedTriangle(4);
    }
    static void revertedTriangle(int n){
        for(int row=0;row<=2*n;row++){ //1.Outer for loop for rows
            int totalColsInRows = row > n ? 2* n - row: row;
            for(int col = 0;col<=totalColsInRows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
