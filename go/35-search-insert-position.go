func searchInsert(nums []int, target int) int {

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