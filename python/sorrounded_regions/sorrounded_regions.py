from collections import deque
from typing import List


class Solution:
    def solve(self, board: List[List[str]]) -> List[List[str]]:

        ROWS, COLS = len(board), len(board[0])

        def bfs(row, col):
            queue = deque([(row, col)])
            # mark starting cell as safe
            board[row][col] = 'S'

            while queue:
                r, c = queue.popleft()
                directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < ROWS and 0 <= nc < COLS and board[nr][nc] == 'O':
                        # mark cells as safe and add it to the queue
                        board[nr][nc] = 'S'
                        queue.append((nr, nc))

        # mark 'O's on the border as safe
        for i in range(ROWS):
            for j in range(COLS):
                if (i == 0 or i == ROWS - 1 or j == 0 or j == COLS - 1) and board[i][j] == 'O':
                    bfs(i, j)

        # change the remaining 'O's (unsafe) to 'X's and restore 'S' to 'O'
        for i in range(ROWS):
            for j in range(COLS):
                if board[i][j] == 'O':
                    board[i][j] = 'X'
                elif board[i][j] == 'S':
                    board[i][j] = 'O'
        return board
