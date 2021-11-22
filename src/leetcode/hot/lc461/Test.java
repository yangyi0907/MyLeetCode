package leetcode.hot.lc461;

public class Test {
    public static void main(String[] args) {
        int x=3,y=1;
        Solution sol=new Solution();
        int n=sol.hammingDistance(x,y);
        System.out.println(n);
    }
}
class Solution {
    public int hammingDistance(int x, int y) {
        int m=x^y;
        int sum=0;
        while (m!=0){
            if(m%2==1){
                sum++;
            }
            m/=2;
        }
        return sum;
    }
}