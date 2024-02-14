import { isBalanced } from "../../src/balancedTree/balancedTree";
import { TreeNode } from "../../src/TreeNode";

describe('testing balanced tree', () => {
    it('should return true if tree is height balanced', () => {
        const root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        expect(isBalanced(root)).toEqual(true);
    });

    it('should return false if tree is not height balanced', () => {
        const root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        expect(isBalanced(root)).toEqual(false);
    });

});