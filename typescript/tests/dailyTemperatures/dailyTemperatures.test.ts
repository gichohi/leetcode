import { dailyTemperatures } from "../../src/dailyTemperatures/dailyTemperatures";

describe('testing daily temperatures', () => {
    it('should return an array of numbers', () => {
        const temps = [73, 74, 75, 71, 69, 72, 76, 73];
        const expected = [1,1,4,2,1,1,0,0];
        const actual = dailyTemperatures(temps);
        expect(expected).toEqual(actual);
    });
});