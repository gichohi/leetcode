
export const updateMatrix = (mat: number[][]): number[][] => {
    const m = mat.length;
    const n = mat[0].length;

    const queue = [];

    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (mat[i][j] == 0) {
                queue.push([i, j]);
            } else {
                mat[i][j] = -1;
            }
        }
    }

    const directions = [[0, 1], [0, -1], [1, 0], [-1, 0]];

    while (!(queue.length == 0)) {
        const pair: number[]| undefined = queue.shift();
        const x: number = pair![0];
        const y: number = pair![1];
        
        for (let i = 0; i < directions.length; i++) {
            let dX = x + directions[i][0];
            let dY = y + directions[i][1];
            if (dX >= 0 && dX < m && dY >= 0 && dY < n && mat[dX][dY] == -1) {
                mat[dX][dY] = mat[x][y] + 1;
                queue.push([dX, dY]);
            }
        }

    }

    return mat;

};