// Given an array of integers arr,
//the task is to find and return the maximum sum of the smallest and second smallest element among all possible subarrays of size greater than one. 
//If it is not possible, then return -1.
// link (https://www.geeksforgeeks.org/problem-of-the-day?utm_source=gfgpractice&utm_medium=events_page&utm_campaign=events_series_problem_of_the_day)
class Solution{
  public int pairWithMaxSum(int arr[]){
    //Return -1 if the arrays length is less than two
    if(arr.length < 2){
      retun -1;
    }
    //inititalize maxSum to -1
    int maxsum = -1;
    //Traverse through the array
    for(int n = 0;arr.length;n++){
      int currentsum = arr[n] + arr[n+1];
      //Update maxsum if currentsum is greater than maxsum
      if(currentsum > maxsum){
        maxsum = currentsum;
        return maxsum;
      }
    }
    return maxsum;
  }
}
