public class NumberTriangle {
    public static void main(String[] args) {
        numberedTriangle(5);
    }
    static void numberedTriangle(int n){
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
