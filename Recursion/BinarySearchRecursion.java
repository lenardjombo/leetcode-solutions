public class BinarySearchRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(BSearch(arr, 0, arr.length-1,7));
    }
    public static int BSearch(int [] arr,int start,int end,int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2; //calculate the middle value
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return BSearch(arr, start, mid-1, target);
        }
        return BSearch(arr, mid+1, end, target);
    }
}
