import { TreeNode } from "../TreeNode";

export const maxLevelSum = (root: TreeNode | null): number => {
    
    const levelSums: number[] = [];
    let maxLevelSum = 0;

    const dfs = (node: TreeNode, level: number) => {
        if(node == null){
            return;
        }
        if(level == levelSums.length){
            levelSums.push(0);
        }

        const val = levelSums[level] + node.val;
        maxLevelSum = Math.max(maxLevelSum, val);
        levelSums[level] += node.val;

        dfs(node.left!, level + 1);
        dfs(node.right!, level + 1);
    }

    dfs(root!, 0);

   return levelSums.indexOf(maxLevelSum) + 1; 
};


