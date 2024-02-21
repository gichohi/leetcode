import { floodFill } from "../../src/floodFill/floodFill";

describe('testing fllod fill', () => {
    it('should return the right array', () => {
        const image = [[1,1,1],[1,1,0],[1,0,1]];
        const sr = 1;
        const sc = 1;
        const color = 2;
        const actual = floodFill(image, sr, sc, color);
        const expected = [[2,2,2],[2,2,0],[2,0,1]];
        expect(expected).toEqual(expected);
    });
});