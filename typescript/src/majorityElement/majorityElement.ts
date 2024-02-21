const majorityElement = (nums: number[]): number => {
    let votes = 0;
    let candidate = 0;
    for(let num of nums){
        if(votes == 0){
            candidate = num;
        }
        if(num == candidate){
            votes++;
        } else {
            votes--;
        }
    }
    return candidate;
};

const nums = [2,2,1,1,1,2,2];
console.log(majorityElement(nums));
