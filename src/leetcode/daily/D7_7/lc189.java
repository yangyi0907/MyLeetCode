package leetcode.daily.D7_7;

public class lc189 {
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k=k%length;
        ro(nums,0,length-1);
        ro(nums,0,k-1);
        ro(nums,k,length-1);

    }
    public void ro(int[] nums,int start,int end){
        int n=(end-start+1)/2;
        int flag=0;
        for (int i = 0; i < n; i++) {
            flag=nums[start+i];
            nums[start+i]=nums[end-i];
            nums[end-i]=flag;
        }
    }
}
