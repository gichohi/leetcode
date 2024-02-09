export const containsDuplicate = (nums: number[]): boolean => {
    let map = new Map<number, number>();
    for(let num of nums){
        if(map.has(num)){
            return true;
        } else {
            map.set(num, 1);
        }
    }
    return false;
};