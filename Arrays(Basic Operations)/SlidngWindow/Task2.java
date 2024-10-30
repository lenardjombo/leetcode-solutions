package SlidngWindow;

public class Task2 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;
        int result = MaxSumSubArrayOfFixedSize(arr, k);
        System.out.println("Output : "+result);
    }
    public static int MaxSumSubArrayOfFixedSize(int arr[],int k){
        if(arr == null || arr.length < k){
            return -1;
        }
        int maxsum = arr[0] * arr[1] * arr[2];
        //Traverse throught the array while sliding the window
       for(int i=0;i < arr.length;i++){
        int currentsum = arr[i] * arr[i+1] * arr[i+2];
        if(currentsum > maxsum){
            maxsum = currentsum;
            return maxsum;
        }
       }
        return -1;
    }
}
