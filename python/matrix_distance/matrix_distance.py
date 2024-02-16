from collections import deque


class Solution:

    def updateMatrix(self, matrix):
        if not matrix:
            return matrix

        m, n = len(matrix), len(matrix[0])
        queue = deque()

        # Add all cells with 0s to the queue and mark others as -1
        for i in range(m):
            for j in range(n):
                if matrix[i][j] == 0:
                    queue.append((i, j))
                else:
                    matrix[i][j] = -1

        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]

        # Perform BFS
        while queue:
            x, y = queue.popleft()
            for dx, dy in directions:
                nx, ny = x + dx, y + dy
                if 0 <= nx < m and 0 <= ny < n and matrix[nx][ny] == -1:
                    matrix[nx][ny] = matrix[x][y] + 1
                    queue.append((nx, ny))

        return matrix


matrix = [[0, 0, 0], [0, 1, 0], [1, 1, 1]]
print(Solution().updateMatrix(matrix))
