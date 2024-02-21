export const solve = (board: string[][]): string[][] => {

    const ROWS = board.length;
    const COLS = board[0].length;
    
    const bfs = (row: number, col: number): void => {
        const queue = [];
        queue.push([row, col]);
        // Mark starting cell as safe
        board[row][col] = "S";
        
        const directions = [[0, 1], [0, -1], [1, 0], [-1, 0]];

        while(queue.length > 0){
            let pair: number[] = queue.pop()!;
            let r = pair[0];
            let c = pair[1];
            for(let direction of directions){
                let dr = direction[0];
                let dc = direction[1];
                let nr = r + dr;
                let nc = c + dc;
                if(nr >= 0 && nr < ROWS && nc >= 0 && nc < COLS && board[nr][nc] == "O"){
                    board[nr][nc] = "S";
                    queue.push([nr, nc]);
                }
            }

        }
    }
    
    // Mark "O"s on the border as "S"
    for(let r=0;r<ROWS;r++){
        for(let c=0;c<COLS;c++){
            if((r == 0 || r == ROWS - 1 || c == 0 || c == COLS - 1) && board[r][c] == "O"){
               bfs(r, c);
            }
        }
    }

    // Change the remaining 'O's (unsafe) to 'X's and restore 'S' to 'O'
    for(let r=0;r<ROWS;r++){
        for(let c=0;c<COLS;c++){
            if(board[r][c] == "O"){
                board[r][c] = "X";
            } else if(board[r][c] == "S"){
                board[r][c] = "O";
            }
        }
    }

    return board;

};