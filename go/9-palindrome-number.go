func isPalindrome(x int) bool {

	number := strconv.Itoa(x) // convert int to string
	left := 0
	right := len(number) - 1

	for left < right {
		if number[left] != number[right] {
			return false
		}
		left++
		right--
	}
	return true
}