package ArrayAndStrings.Arrays;

public class Traversal {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        traverse(arr);
    }
    public static void traverse(int arr[]){
        //Traverse through the array
        for(int n:arr){
            if((n&1) == 0){
                System.out.println(n+" = Even");
            }else{
                System.out.println(n+" = Odd");
            }
        }
    }
}
/*Write a java Program that takes an integer array as input and traverses through the arrayto print each element on a new line
 * Additionally,if an element is even,print "Even" next to it,and if its odd,print "Odd" next to it
*/