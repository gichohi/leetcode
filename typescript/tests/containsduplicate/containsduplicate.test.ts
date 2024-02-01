import { containsDuplicate } from "../../src/containsDuplicate/containsduplicate";

describe('testing duplicate', () => {
    it('should true if array contains duplicate and false otherwise', () => {
        const nums1 = [1,2,3,1];
        const nums2 = [1,2,3];
        expect(containsDuplicate(nums1)).toEqual(true);
        expect(containsDuplicate(nums2)).toEqual(false);
    });
});