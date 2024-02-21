from collections import deque
from typing import List


class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        if not grid:
            return -1

        queue = deque()

        minutes, fresh = 0, 0
        ROWS, COLS = len(grid), len(grid[0])

        # increment fresh if orange is fresh
        # add to queue if orange is rotten
        for r in range(ROWS):
            for c in range(COLS):
                if grid[r][c] == 1:
                    fresh += 1
                elif grid[r][c] == 2:
                    queue.append((r, c))

        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]

        """
        While the queue is not empty, pop an orange from the queue, 
        then check its adjacent cells (up, down, left, right).
        If any adjacent cell contains a fresh orange, 
        change it to rotten and enqueue its position into the queue. 
        Keep track of the minutes.
        """

        while queue and fresh > 0:
            # BFS
            for _ in range(len(queue)):
                r, c = queue.popleft()
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < ROWS and 0 <= nc < COLS and grid[nr][nc] == 1:
                        grid[nr][nc] = 2
                        fresh -= 1
                        queue.append((nr, nc))
            if queue:
                minutes += 1

        return minutes if fresh == 0 else -1
