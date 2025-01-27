package main

import (
	"fmt"
)



func main() {
	wordString := "Hll"
	//check if wordString is not empty
	if len(wordString) != 0{
		var output int = numberOfVowels(wordString)
		fmt.Printf("Number of vowels : %v ",output)
	}
}
func numberOfVowels(wordString string) int {
	var counter int = 0
	var vowels = "aeiou"
	charVowels := []rune(vowels)
	charString := []rune(wordString)
	//iterate through the string of characters
	for i := 0;i < len(wordString);i++ {
		for j := 0;j < len(vowels);j++{
			if charString[i] == charVowels[j]{
				counter ++
			}
		}
	}
	return counter
}
