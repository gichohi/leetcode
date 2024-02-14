import { TreeNode } from "../TreeNode";

export const isBalanced = (root: TreeNode | null): boolean => {
    return dfs(root!) != -1;
};

const dfs = (node: TreeNode): number => {
    if(node == null){
        return 0;
    }

    const left = dfs(node.left!);
    const right = dfs(node.right!);

    if(left == -1 || right == -1 || Math.abs(left - right) > 1){
        return -1;
    }

    return 1 + Math.max(left, right);
}