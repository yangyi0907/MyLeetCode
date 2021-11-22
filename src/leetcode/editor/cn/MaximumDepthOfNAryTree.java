package leetcode.editor.cn;

import java.util.List;

//559.N 叉树的最大深度
public class MaximumDepthOfNAryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfNAryTree().new Solution();
    }
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
    //leetcode submit region begin(Prohibit modification and deletion)
// Definition for a Node.

class Solution {
    public int maxDepth(Node root) {
        return DFS(root);
    }
    public int DFS(Node root){
        if(root==null)return 0;
        List<Node> ch=root.children;
        int max=1;
        for (int i = 0; i < ch.size(); i++) {
            int h=DFS(ch.get(i))+1;
            max=Math.max(h,max);
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}