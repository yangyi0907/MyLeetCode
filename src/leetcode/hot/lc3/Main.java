package leetcode.hot.lc3;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String s="au";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(" ".equals(s)||"   ".equals(s)||s.length()==1)return 1;

        int sol=0;

        int[] flag=new int[130];
        char[] b = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for(int k=0;k<130;k++){
                flag[k]=0;
            }
            for (int j = i; j < s.length(); j++) {
                if(flag[b[j]+1]==0){
                    flag[b[j]+1]=1;
                    if(sol<j-i+1){sol=j-i+1;}
                }
                else{
                    if(sol<j-i){sol=j-i;}
                    break;
                }
            }
        }
        return sol;
    }
}

