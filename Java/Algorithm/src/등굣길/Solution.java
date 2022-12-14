package 등굣길;

import java.util.*;


class Solution {
    static long INF = Long.MAX_VALUE;
    public int solution(int m, int n, int[][] puddles) {
        // System.out.println(INF);
        int [][] graph = new int[n][m];
        int [][] dp = new int[n+1][m+1];
        for (int i=0; i<puddles.length;i++){
            int x,y;
            x= puddles[i][1];
            y= puddles[i][0];
            graph[x-1][y-1]=1;
        }
        dp[1][1]=1;
        for (int i=1; i<n+1; i++){
            for(int j =1; j<m+1; j++){
                if (i==1 && j==1)
                    continue;
                if  (graph[i-1][j-1]==1)
                    continue;
                dp[i][j]= (dp[i-1][j]+dp[i][j-1])%1000000007;

            }
        }
        int answer=dp[n][m];
        return answer;
    }

}