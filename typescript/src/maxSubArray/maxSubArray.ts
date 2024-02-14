export const maxSubArray = (nums: number[]): number => {
    let currSum = 0;
    let total = Number.MIN_SAFE_INTEGER;
    for (let i = 0; i < nums.length; i++) {
        currSum += nums[i];
        total = Math.max(total, currSum);
        if (currSum < 0) {
            currSum = 0;
        }
    }
    return total;
}; 