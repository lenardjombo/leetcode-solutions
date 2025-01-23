package main

import (
	"fmt"
)

func main() {
	var array = []int{1,2,3,4,5,6,7,8,9,10}
	var target int = 11
	result := binarySearch(array,target)
	if result != -1{
		fmt.Printf("The target : %v is at index :  %v",target,result)
	}else{
		fmt.Println("Target not found")
	}
	
}
func binarySearch(array[] int,target int)int{
	var start,end,mid int
	start = 0
	end = len(array) - 1
	for start <= end{
		mid = start + (end - start)/2
		if(array[mid] == target){
			return mid
		}else if(array[mid] < target){
			start = mid + 1
		}else{
			end = mid - 1
		}
	}
	return -1 //Target not found
}


