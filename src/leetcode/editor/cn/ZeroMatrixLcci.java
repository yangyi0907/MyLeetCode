package leetcode.editor.cn;

//面试题 01.08.零矩阵
public class ZeroMatrixLcci {
    public static void main(String[] args) {
        Solution solution = new ZeroMatrixLcci().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void setZeroes(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(matrix[i][j]==0){
                        helper(matrix,i,j,Integer.MAX_VALUE-1);
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(matrix[i][j]==Integer.MAX_VALUE-1){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        public void helper(int[][] matrix, int i, int j, int n) {
            for (int k = 0; k < matrix.length; k++) {
                if(matrix[k][j]!=0) matrix[k][j]=n;
            }
            for (int k = 0; k < matrix[0].length; k++) {
                if(matrix[i][k]!=0) matrix[i][k]=n;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}