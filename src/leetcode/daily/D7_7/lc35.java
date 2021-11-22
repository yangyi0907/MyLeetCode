package leetcode.daily.D7_7;

public class lc35 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<target){
                continue;
            }else {
                return i;
            }
        }
        return nums.length;
    }
}
