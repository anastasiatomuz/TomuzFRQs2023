
public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        for (int r = 0; r < grid.length; r ++){
            for (int c = 0; c < grid[0].length; c ++){
                boolean conditionsMet = false;
                int ranNum = 0;
                while (!conditionsMet){
                    ranNum = (int)(Math.random()*MAX) + 1;
                    if (ranNum % 10 == 0 && ranNum % 100 != 0){
                        conditionsMet = true;
                    }
                }
                grid[r][c] = ranNum;
            }
        }
    }

    public int countIncreasingCols() {
        int count = 0;
        if (grid.length == 1){
            return 1;
        }
        for (int c = 0; c < grid[0].length; c ++){
            boolean tester = true;
            for (int r = 1; r < grid.length; r ++){
                if (grid[r][c] < grid[r - 1][c]){
                    tester = false;
                }
            }
            if (tester == true){
                count ++;
            }
        }
        return count;
    }
}