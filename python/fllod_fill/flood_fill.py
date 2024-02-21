from typing import List


class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        start_cell = image[sr][sc]

        def dfs(img, x, y):
            # Check boundary conditions
            if x < 0 or x >= len(img) or y < 0 or y >= len(img[0]):
                return

            # Check if the current pixel has the target color
            if img[x][y] != start_cell:
                return

            # Check if the current pixel already has the replacement color
            if img[x][y] == color:
                return

            # Change the color of the current pixel to replacement_color
            img[x][y] = color

            # Recursively call flood_fill on neighboring pixels
            dfs(img, x + 1, y)  # right
            dfs(img, x - 1, y)  # left
            dfs(img, x, y + 1)  # down
            dfs(img, x, y - 1)  # up

        dfs(image, sr, sc)

        return image


image = [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
sr = 1
sc = 1
color = 2
print(Solution().floodFill(image, sr, sc, color))
