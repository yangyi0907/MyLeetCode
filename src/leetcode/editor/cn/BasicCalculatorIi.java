package leetcode.editor.cn;

import java.util.Stack;

//227.基本计算器 II
public class BasicCalculatorIi {
    public static void main(String[] args) {
        Solution solution = new BasicCalculatorIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calculate(String s) {
        int ans=0;
        Stack<Integer> nums=new Stack<>();
        Stack<Character> ops=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                continue;
            }else if(isNum(s.charAt(i))){
                int j=i+1;
                while (isNum(s.charAt(j))){
                    j++;
                }
                String cnt=s.substring(i,j);
                nums.push(Integer.parseInt(cnt));
                i=j-1;
            }else if(s.charAt(i)=='('){
                ops.push(s.charAt(i));
            }else if(s.charAt(i)==')'){

            }
        }
        return 0;
    }
    public boolean isNum(char c){
        if(c-'0'>=0&&c-'0'<=9){
            return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}