class Solution {

    Integer[] dp;

    public String stoneGameIII(int[] stoneValue) {

        dp = new Integer[stoneValue.length];

        int diff = solve(0, stoneValue);

        if(diff > 0)
            return "Alice";

        if(diff < 0)
            return "Bob";

        return "Tie";
    }

    private int solve(int index, int[] stone) {

        if(index >= stone.length)
            return 0;

        if(dp[index] != null)
            return dp[index];

        int take = 0;

        int ans = Integer.MIN_VALUE;

        for(int i=index;i<Math.min(index+3,stone.length);i++){

            take += stone[i];

            ans = Math.max(ans, take - solve(i+1, stone));
        }

        return dp[index] = ans;
    }
}