import { sortArray } from "../../src/sortArray/sortArray";

describe('testing sort', () => {
    it('should return sorted array', () => {
        const nums = [2,7,11,4,5,3,9,17,14];
        const expected = [2,3,4,5,7,9,11,14,17];
        const actual = sortArray(nums);
        expect(expected).toEqual(actual);
    });
});