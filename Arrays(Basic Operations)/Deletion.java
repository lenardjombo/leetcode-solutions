package ArrayAndStrings.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int pos = 2;
        int newarr[] = delete(arr, pos);
        for(int n:newarr){
            System.out.print(n+" ");
        }
    }
    public static int [] delete(int arr[],int pos){
        // check if an array is out of bounds
        if(pos >= arr.length || pos < 0){
            System.out.println("Array Out of Bounds");
            return arr;
        }
        // create a new array of lenght-1
        int newarr[] = new int[arr.length-1];

        //copy the elements upto specified position
        for(int i=0;i < pos;i++){
            newarr[i] = arr[i];
        }

        //Shift the remaining elements to the left
        for(int i=pos;i<arr.length-1;i++){
            newarr[i] = arr[i+1];
        }
        return newarr;
    }
}
