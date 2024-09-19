package LinearSearchAlgorithm;
//https://leetcode.com/problems/richest-customer-wealth/submissions/1395875963/
public class RichCustomerWealth {
    public static void main(String[] args) {
        int [][] customers = {{1,2,3},
                              {4,5,6},
                              {7,8,9}};
        int mostWealthy = findMax(customers);
        System.out.println(mostWealthy);
    }
    public static int findMax(int [][] arr){
        int max = arr[0][0]; 
        for(int person = 0;person < arr.length; person++){
            int sum = 0;
            for(int account = 0;account < arr[person].length; account++){
                sum += arr[person][account];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
