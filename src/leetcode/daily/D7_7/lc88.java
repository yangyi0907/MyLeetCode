package leetcode.daily.D7_7;

public class lc88 {
    public static void main(String[] args) {
        int[] nums1=new int[]{1,2,3,0,0,0};
        int[] nums2=new int[]{2,5,6};
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        while (j<n){
            while (nums1[i]<=nums2[j]&&i<m){
                i++;
            }
            if(i==m){
                while (j<n){
                    nums1[i++]=nums2[j++];
                    m++;
                }
            }else {
                for (int k = m; k >i; k--) {
                    nums1[k]=nums1[k-1];
                }
                nums1[i++]=nums2[j++];
                m++;
            }
        }
        for (int k = 0; k < m; k++) {
            System.out.println(nums1[k]);
        }
    }
}
