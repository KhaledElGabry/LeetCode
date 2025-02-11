func searchInsert(nums []int, target int) int {

	// validation
	if nums == nil || len(nums) < 1 || len(nums) > 10_000 {
		panic("Invalid array input")
	}
	if target < -10_000 || target > 10_000 {
		panic("Invalid target value")
	}

	var low int = 0
	var high int = len(nums) - 1

	for low <= high {
		var mid int = (low + high) / 2 // calculate the midpoint

		if nums[mid] == target {
			return mid
		} else if nums[mid] < target {
			low = mid + 1 // move low after mid
		} else {
			high = mid - 1 // move high before mid
		}
	}

	return low // low will always be where target should be inserted
}