package flood.fill;

// https://leetcode.com/problems/flood-fill/description/
class FloodFill {

    int[][] floodFill(int[][] image, int row, int col, int color) {
        if (image[row][col] != color) {
            int originalColor = image[row][col];
            floodFillLoop(image, row, col, originalColor, color);
        }
        return image;
    }

    void floodFillLoop(int[][] image, int row, int col, int srcColor, int targetColor) {
        if (image[row][col] == targetColor || image[row][col] != srcColor) return;

        image[row][col] = targetColor;

        if (col < image[row].length - 1) floodFillLoop(image, row, col + 1, srcColor, targetColor); // right
        if (col > 0) floodFillLoop(image, row, col - 1, srcColor, targetColor); // left
        if (row > 0) floodFillLoop(image, row - 1, col, srcColor, targetColor); // top
        if (row < image.length - 1) floodFillLoop(image, row + 1, col, srcColor, targetColor); // bottom
    }

}
