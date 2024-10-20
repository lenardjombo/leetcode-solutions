class Pyramid2{
    public static void main(String args[]){
        int sp=20;
        for(int i=1;i<=5;i++){
            for(int k=1;k<=sp;k++){
                    System.out.print(" ");
                }
                sp--;
                for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
            System.out.println();
            }
    }
}