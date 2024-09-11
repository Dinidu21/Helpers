package Recursion;

import java.util.*;

public class CounterPathProblem {
    // BruteForce Approach
    public static int counterPath(List<List<String>> grid) {
        return counterPath(0,0,grid);
    }
    public static int counterPath(int r,int c,List<List<String>> grid) {

        if(r == grid.size() || c == grid.get(0).size()){
            return 0;
        }

        if (grid.get(r).get(c) == "X"){
            return 0;
        }

        if(r == grid.size() -1 && c == grid.get(0).size() -1){
            return 1;
        }

        return counterPath(r+1,c,grid) + counterPath(r,c+1 ,grid);
    }

    public static void main(String[] args) {
        List<List<String>> grid = new ArrayList<>();

        grid.add(Arrays.asList("O", "O", "X"));  // X represents a wall
        grid.add(Arrays.asList("O", "O", "O"));
        grid.add(Arrays.asList("O", "O", "O"));

        int result = counterPath(grid);
        System.out.println("Number of possible paths: " + result);

    }
}
