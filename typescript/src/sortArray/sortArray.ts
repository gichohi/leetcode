export const sortArray = (nums: number[]): number[] => {
    return mergeSort(nums);
};

const mergeSort = (nums: number[]): number[] => {
    if(nums.length == 1){
        return nums;
    }
    const mid = Math.floor(nums.length/2);
    const leftArray = nums.slice(0, mid);
    const rightArray = nums.slice(mid, nums.length);

    const left = mergeSort(leftArray);
    const right = mergeSort(rightArray);
    return merge(left, right);
}

const merge = (leftArray: number[], rightArray: number[]): number[] => {
    const length = leftArray.length + rightArray.length;
    let left = 0;
    let right = 0;
    const nums: number[] = []; 
    let i = 0;

    while(left < leftArray.length && right < rightArray.length){
        if(leftArray[left] < rightArray[right]){
            nums[i] = leftArray[left];
            left++;
        } else {
            nums[i] = rightArray[right];
            right++;
        }
        i++;
    }

    while(left < leftArray.length){
        nums[i] = leftArray[left];
        left++;
        i++;
    }

    while(right < rightArray.length){
        nums[i] = rightArray[right];
        right++;
        i++;
    }

    return nums;
}

const nums = [2,7,11,4,5,3,9,17,14];
console.log(sortArray(nums));