public class InvertedTraingle {
    public static void main(String[] args) {
        invertedTriangle(5);
    }
    static void invertedTriangle(int n){
        for(int row = 5;row >= 1;row--){
            for(int col=1;col<= row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
