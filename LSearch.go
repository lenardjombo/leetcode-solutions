package main

import (
	"fmt"
)

func main() {
	var array = []int{1,2,3,4,5,6,7,8,9,10}
	var target int = 9
	if len(array) != 0{ //Array  should not be empty
		var result int = linearSearch(array,target)
		fmt.Printf("Target found at : %v ",result)
	}
}


func linearSearch(array[] int,target int)int {
	var start int = 0
	var end int = len(array) - 1
	for index := start; index <= end ; index ++{
		if array[index] == target{
			return index
		}
	}
	return -1
}
