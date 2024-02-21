import { orangesRotting } from "../../src/rottingOranges/rottingOranges";

describe('test orangesRotting function', () => {
    it('should calculate the number of minutes to rot all oranges', () => {
        const grid = [[2, 1, 1], [1, 1, 0], [0, 1, 1]];
        const expected = 4;
        const actual = orangesRotting(grid);
        expect(expected).toEqual(actual);
    });

    it('should retrun -1 if all the oranges canot become rotten', () => {
        const grid = [[2, 1, 1], [0, 1, 1], [1, 0, 1]];
        const expected = -1;
        const actual = orangesRotting(grid);
        expect(expected).toEqual(actual);
    });
});