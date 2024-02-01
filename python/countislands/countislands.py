import collections
from typing import List


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        # bfs starts from a land cell and explores adjacent land cells,
        # marking them as visited
        def bfs(row, col):
            queue = collections.deque([(row, col)])
            while queue:
                r, c = queue.popleft()
                if 0 <= r < len(grid) and 0 <= c < len(grid[0]) and grid[r][c] == "1":
                    grid[r][c] = "0"  # mark as visited
                    queue.append((r + 1, c))
                    queue.append((r - 1, c))
                    queue.append((r, c + 1))
                    queue.append((r, c - 1))

        num_of_islands = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == "1":
                    num_of_islands += 1
                    bfs(i, j)

        return num_of_islands
