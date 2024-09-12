package Recursion;

public class GuessNumber {
    public static int minSum(int n) {
        return costCalculate(1,n); //5 [1,2,3,4,5]
    }

    public static int costCalculate(int start, int end){

        int minCost = Integer.MAX_VALUE;
        
        if(start >= end){
            return 0;
        }

        for (int i = start; i <= end ; i++) {
            int costIfGuessI = i + Math.max(costCalculate(start,i-1),costCalculate(i+1,end));
            //System.out.println(costIfGuessI);
            minCost = Math.min(minCost,costIfGuessI);
        }
        return minCost;
    }

    public static void main(String[] args) {
        int n = 5;
        int result =  minSum(n);
        System.out.println(result);
    }
}
