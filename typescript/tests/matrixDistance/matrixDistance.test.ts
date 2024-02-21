import { updateMatrix } from "../../src/matrixDistance/matrixDistance";

describe('testing matrix distance from 0', () => {
    it('should return updated matrix', () => {
        const mat1 =  [
            [0,0,0],
            [0,1,0],
            [0,0,0]
        ];

        const mat2 = [
            [0,0,0],
            [0,1,0],
            [1,1,1]
        ];

        const expected1 =  [
            [0,0,0],
            [0,1,0],
            [0,0,0]
        ];


        const expected2 = [
            [0,0,0],
            [0,1,0],
            [1,2,1]
        ];

        expect(updateMatrix(mat1)).toEqual(expected1);
        expect(updateMatrix(mat2)).toEqual(expected2);

    });
});