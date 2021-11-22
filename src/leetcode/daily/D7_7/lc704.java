package leetcode.daily.D7_7;

public class lc704 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,5};
        int target=5;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        if(j==0){
            if(nums[j]==target){
                return 0;
            }else {
                return -1;
            }
        }
        if(nums[i]>target||nums[j]<target){
            return -1;
        }
        int mid;
        while (i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        return -1;
    }
}
