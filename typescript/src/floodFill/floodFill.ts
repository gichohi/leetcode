export const floodFill = (image: number[][], sr: number, sc: number, color: number): number[][] => {
    const start = image[sr][sc];
    dfs(image, sr, sc, start, color);
    return image;
};

const dfs = (img: number[][], x: number, y: number, s: number, c: number): void => {
    if(x < 0 || x >= img.length || y < 0 || y >= img[0].length){
        return;
    }

    if(img[x][y] != s){
        return;
    }

    if(img[x][y] == c){
        return;
    }

    img[x][y] = c;

    dfs(img, x + 1, y, s, c);
    dfs(img, x - 1, y, s, c);
    dfs(img, x, y + 1, s, c);
    dfs(img, x, y - 1, s, c);
}

const image = [[1,1,1],[1,1,0],[1,0,1]];
console.log(floodFill(image, 1, 1, 2));