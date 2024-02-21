const lengthOfLongestSubstring = (s: string): number => {
    const map = new Map<string, number>();
    let left = 0;
    let right = 0;
    let longest = 0;
    const strs = s.split("");
    while (right < s.length) {
        // if s[right] is not in map, increment window size
        if (!map.has(strs[right])) {
            longest = Math.max(longest, right - left + 1);
        } else {
            // if s[right] is not in the current window
            // increase the window size
            if (map.get(strs[right])! < left) {
                longest = Math.max(longest, right - left + 1);
            } else {
                // if s[right] is in current window, move the left pointer
                left = map.get(strs[right])! + 1;
            }

        }
        map.set(s[right], right);
        right++;
    }
    return longest;

};

console.log(lengthOfLongestSubstring("aabaabcbb"));