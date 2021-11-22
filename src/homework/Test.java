package homework;

/**
 * @author YANGYI
 * @create 2021/8/2
 */
public class Test {
    public static void main(String[] args) {
        String str = "aabaaf";
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        int[] next = new int[a.length];
        getNext(next, a);
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + ",");
        }
    }

    static void getNext(int[] next, char[] s) {
        int j = 0;
        next[0] = j;
        for (int i = 1; i < s.length; i++) { // 注意i从1开始，这样才能和j比较
            while (j > 0 && s[i] != s[j]) { // 处理前后缀不相同，回溯是个连续的过程，所以是while不是if，又因为j起始位置是0，不能再回溯，所以是j=0
                j = next[j - 1]; // 向前回溯，回溯前一位的next中的位置
            }
            if (s[i] == s[j]){ // 找到相同的前后缀
                j++;
            }
            //最长相等前后缀长度加1
            next[i] = j; // 将j（前缀的长度）赋给next【i】，不管前后缀是否相同，都要存放
        }
    }

}
