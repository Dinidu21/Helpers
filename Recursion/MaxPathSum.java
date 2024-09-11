package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxPathSum {
    //BruteForce Approach

    public static int maxPath (List<List<Integer>> grid){
        return (int) maxPath(0,0,grid);
    }
    public static double maxPath (int r,int c , List<List<Integer>> grid){
        if(r == grid.size() || c == grid.get(0).size()){
            return Double.NEGATIVE_INFINITY;
        }

        if(r==grid.size() - 1 && c == grid.get(0).size() - 1){
            return grid.get(r).get(c);
        }

     return grid.get(r).get(c) + Math.max(
             maxPath(r + 1,c,grid),
             maxPath(r,c+1,grid));
    }

    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();

        grid.add(Arrays.asList(1,3,12));
        grid.add(Arrays.asList(5,6,2));

        int result = maxPath(grid);
        System.out.println("Number of possible paths: " + result);

    }
}
