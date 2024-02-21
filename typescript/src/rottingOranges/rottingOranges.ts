export const orangesRotting = (grid: number[][]): number => {
    const ROWS = grid.length;
    const COLS = grid[0].length;

    const queue = [];
    let minutes = 0;
    let fresh = 0;

    // increment fresh if orange is fresh
    // add to queue if orange is rotten

    for (let r = 0; r < ROWS; r++) {
        for (let c = 0; c < COLS; c++) {
            if (grid[r][c] == 2) {
                queue.push([r, c]);
            } else if (grid[r][c] == 1) {
                fresh++;
            }
        }
    }

    const directions = [[0, 1], [0, -1], [1, 0], [-1, 0]];

    /*
        While the queue is not empty, pop an orange from the queue, 
        then check its adjacent cells (up, down, left, right).
        If any adjacent cell contains a fresh orange, 
        change it to rotten and enqueue its position into the queue. 
        Keep track of the minutes.
    */

    while (queue.length != 0 && fresh > 0) {
        for (let i = 0; i < queue.length; i++) {
            const pair: number[] = queue.pop()!;
            let r = pair![0];
            let c = pair![1];
            for (let direction of directions) {
                let dr = direction[0];
                let dc = direction[1];
                let nr = r + dr;
                let nc = c + dc;
                if (nr >= 0 && nr < ROWS && nc >= 0 && nc < COLS) {
                    grid[nr][nc] == 2;
                    queue.push([nr, nc]);
                }
            }

        }
        if (queue.length > 0) {
            minutes++;
        }
    }

    if (fresh == 0) {
        return minutes;
    } else {
        return -1;
    }

};