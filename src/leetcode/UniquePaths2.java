package leetcode;

public class UniquePaths2 {

	public static void main(String[] args) {
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		
		int answer = uniquePathWithObstacles(obstacleGrid);
		
		System.out.println(answer);
	}
	
	public static int uniquePathWithObstacles(int[][] obstacleGrid) {
		// 1x1, 1x2, 2x1, 2x2  -> int[m][n]¿¡ µµÂøÇØ¾ßµÊ
        int answer = 0;
        
        int obstacleX = 0;
        int obstacleY = 0;
        
        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;
        
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        
        obstacleGrid[0][0] = 1;
        
        for(int i=1; i<n; i++){
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 1) ? 1 : 0;
        }
        
        for(int i=1; i<m; i++){
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 1) ? 1 : 0;
        }
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(obstacleGrid[i][j] == 0){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }else{
                    obstacleGrid[i][j] = 0;
                }
            }
        }
        
        return obstacleGrid[n-1][m-1];
	}
}
