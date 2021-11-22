package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;

//面试题 04.01.节点间通路
public class RouteBetweenNodesLcci {
    public static void main(String[] args) {
        Solution solution = new RouteBetweenNodesLcci().new Solution();
        System.out.println(solution.findWhetherExistsPath(3, new int[][]{{0, 1}, {0, 2}, {1, 2}, {1, 2}}, 0, 2));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        Boolean[] flag=new Boolean[n];
        Boolean[] visited=new Boolean[n];
        Arrays.fill(flag,false);
        Arrays.fill(visited,false);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(start);
        visited[start]=true;

        while (!list.isEmpty()){
            Integer i = list.remove(0);
            if(flag[i]==true){
                continue;
            }
            for (int j = 0; j < n; j++) {
                if(graph[j][0]==i&&flag[graph[j][1]]==false){
                    list.add(graph[j][1]);
                    flag[graph[j][1]]=true;
                    visited[graph[j][1]]=true;
                }
            }
            flag[i]=true;
        }
        return visited[target];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}