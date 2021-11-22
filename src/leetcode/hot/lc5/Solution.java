package leetcode.hot.lc5;

public class Solution {
    public static void main(String[] args) {
        String s="aacabdkacaa";
        System.out.println(longgestPalingdrome(s));
    }
    static String longgestPalingdrome(String s){
        int len=s.length();
        for (int i = len; i>0; i--) {
            //ÅĞ¶Ï»ØÎÄÊı
            int m=huiwen(s,i);
            if(m==-1){
                continue;
            }else {
                return s.substring(m,m+i);
            }
        }
        return "s";
    }
    static int huiwen(String s,int n){
        int len=s.length();
        boolean flag=true;
        for (int i = 0; i+n-1 < len; i++) {
            flag=true;
            int n1=i;
            int n2=i+n-1;
            for (int j = 0; j < n/2; j++) {
                if(s.charAt(n1)!=s.charAt(n2)){
                    flag=false;
                    break;
                }else {
                    n1++;
                    n2--;
                }
            }
            if(flag==true){
                return i;
            }
        }
        return -1;
    }
}
