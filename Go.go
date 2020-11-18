package main

import (
	"fmt"
)

func main() {
	var a, d, i, c int
	var b [10000]int
	c = 0
	d = 0
	fmt.Scan(&a)
	if a < 10000 {
		for i = 0; i < a; i++ {
			fmt.Scan(&b[i])
		}
	}
	for i = 0; i < a; i++ {
		if b[i] >= 10 && b[i] <= 20 {
			c = c + 1
		} else {
			d++
		}
	}
	fmt.Printf("%d in\n", c)
	fmt.Printf("%d out\n", d)
}
