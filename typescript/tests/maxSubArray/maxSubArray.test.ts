import { maxSubArray } from "../../src/maxSubArray/maxSubArray";

describe('testing max sub array',() => {
    it('should return max array sum', () => {
        const nums1 = [-2,1,-3,4,-1,2,1,-5,4];
        const nums2 = [5,4,-1,7,8];
        expect(maxSubArray(nums1)).toEqual(6);
        expect(maxSubArray(nums2)).toEqual(23);
    });
});