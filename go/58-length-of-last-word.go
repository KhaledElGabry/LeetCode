func lengthOfLastWord(s string) int {

    s = strings.TrimSpace(s) // remove leading and trailing spaces
    length := 0

    // iterate from the end of the string
    for i := len(s) - 1; i >= 0; i-- {
        if s[i] == ' ' {
            break
        }
        length++
    }

    return length
}