package ArrayAndStrings.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int pos = 5;
        int target = 6;
        int newarr[] = insert(arr, pos, target);
        for(int n:newarr){
            System.out.println(n);
        }
    }
    public static int [] insert(int arr[],int pos,int target){
        //create a new array of one additional element
        int newarr[] = new int[arr.length+1];

        //Copy the elements upto the insertion position
        for(int i=0;i < pos;i++){
                newarr[i] = arr[i];
            }

        //insert the target element at the specified position
        newarr[pos] = target;

        //copy the remaining elements
        for(int i=pos;i < arr.length;i++){
            newarr[i+1] = arr[i];
        }
        return newarr;
    }
}
