import java.util.LinkedList;
import java.util.Queue;

public class Chess {

    // 定义棋盘的行和列
    private int n;
    private int m;
    // 定义8个方向，对应马走日字的8种走法
    private int[][] directions = {{1, 2}, {2, 1}, {-1, 2}, {-2, 1}, {1, -2}, {2, -1}, {-1, -2}, {-2, -1}};

    public HorseMinimumSteps(int n, int m) {
        this.n = n;
        this.m = m;
    }

    // 内部类表示棋盘上的一个点以及到达该点的步数
    private class Point {
        int x;
        int y;
        int step;

        public Point(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    public int[][] findMinimumSteps(int startX, int startY) {
        int[][] result = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<Point> queue = new LinkedList<>();
        // 将起始点加入队列，并标记为已访问，起始步数为0
        queue.add(new Point(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            int curX = cur.x;
            int curY = cur.y;
            int curStep = cur.step;
            // 更新结果数组中当前位置的步数
            result[curX][curY] = curStep;
            // 尝试8个方向
            for (int[] dir : directions) {
                int newX = curX + dir[0];
                int newY = curY + dir[1];
                // 判断新位置是否在棋盘内且未被访问过
                if (newX >= 0 && newX < n && newY >= 0 && newY < m &&!visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.add(new Point(newX, newY, curStep + 1));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        HorseMinimumSteps horse = new HorseMinimumSteps(8, 8);
        int[][] steps = horse.findMinimumSteps(3, 3);
        for (int i = 0; i < steps.length; i++) {
            for (int j = 0; j < steps[0].length; j++) {
                System.out.print(steps[i][j] + " ");
            }
            System.out.println();
        }
    }
}