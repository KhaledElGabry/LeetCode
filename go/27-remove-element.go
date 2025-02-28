func removeElement(nums []int, val int) int {
    k := 0 // count non-val elements
    for i := 0; i < len(nums); i++ {
        if nums[i] != val {
            nums[k] = nums[i]
            k++
        }
    }
    return k
}