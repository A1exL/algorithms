package zero.one.matrix;

import java.util.LinkedList;

// https://leetcode.com/problems/01-matrix/description/
public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] input) {
        int[][] result = new int[input.length][input[0].length];
        int[][] rowColDirections = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        LinkedList<int[]> queue = new LinkedList<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                } else {
                    result[i][j] = Integer.MAX_VALUE - 1000;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int nextDistance = result[cell[0]][cell[1]] + 1;
            for (int[] rowColDirection : rowColDirections) {
                int nextRow = cell[0] + rowColDirection[0];
                int nextColumn = cell[1] + rowColDirection[1];
                if (isOutOfBounds(nextRow, nextColumn, result) || result[nextRow][nextColumn] <= nextDistance) {
                    continue;
                }
                queue.add(new int[] {nextRow, nextColumn});
                result[nextRow][nextColumn] = nextDistance;
            }
        }

        return result;
    }

    private boolean isOutOfBounds(int nextRow, int nextColumn, int[][] result) {
        return nextRow < 0 || nextColumn < 0 || nextRow >= result.length || nextColumn >= result[0].length;
    }
}
