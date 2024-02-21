import { solve } from "../../src/sorroundedRegion/sorroundedRegion";

describe('test sorrounded regions function', () => {
    it('shoud return new array', () => {
        const board = [["X", "X", "X", "X"], ["X", "O", "O", "X"], ["X", "X", "O", "X"], ["X", "O", "X", "X"]];
        const expected = [['X', 'X', 'X', 'X'], ['X', 'X', 'X', 'X'], ['X', 'X', 'X', 'X'], ['X', 'O', 'X', 'X']];
        const actual = solve(board);
        expect(expected).toEqual(actual);
    });
});