public class FirstLastPosition {
    public static void main(String[] args) {
        int [] nums = {3,4,5,6,7,7,7,7,8,9,10,11};
        int target = 7;
        int [] result = searchRange(nums, target);
        System.out.println("First Occurrence: "+result[0]);
        System.out.println("Last Occurrence: "+result[1]);

    } 
    static int[] searchRange(int [] nums,int target){
        int [] result = new int[2];
        result [0] = FirstPosition(nums,target);
        result [1] = LastPosition(nums,target);
        return result;
    }
    //Function to find the first position of the element
    private static int FirstPosition(int [] arr,int target){
        int firstPosition = -1;
        int start = 0;
        int end = arr.length - 1;
        //Loop through the array
        while(start <= end){
            int mid = start + ((end - start)>>1);
            if(arr[mid] == target){
                firstPosition = mid;//record the position
                end = mid - 1;//continue searching in the left side
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return firstPosition;
    }
    //Function to find the last position of the target element
    private static int LastPosition(int [] arr, int target){
        int lastPosition = -1;
        int start = 0;
        int end = arr.length - 1;
        //Iterate through the array
        while(start <= end){
            //calculate the position of the middle element through each iteration
            int mid = start + ((end - start)>>1);
            if(arr[mid] == target){
                lastPosition = mid;//record the position
                start = mid +1;//continue searching in the right side
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return lastPosition;
    }
}