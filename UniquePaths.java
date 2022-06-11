class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        return countPaths(0,0,m,n,dp);
    }
    
    public int countPaths(int i,int j,int m,int n,int dp[][]){
        if(i>=m || j>=n){
            return 0;
        }
        
        if(i==m-1 && j==n-1){
            return 1;
        }
        
        if(dp[i][j]!=0)
            return dp[i][j];
        
        
        return dp[i][j]=countPaths(i+1,j,m,n,dp)+countPaths(i,j+1,m,n,dp);
        

    }
}
