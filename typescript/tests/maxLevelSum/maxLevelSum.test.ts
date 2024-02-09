import { maxLevelSum } from "../../src/maxLevelSum/maxLevelSum";
import { TreeNode } from "../../src/maxLevelSum/TreeNode";

describe('testing max level sum', () => {
    it('should return 2', () => {
        const root = new TreeNode(2);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);

        const expected = 2;
        const actual = maxLevelSum(root);
        expect(expected).toEqual(actual);
    });
});