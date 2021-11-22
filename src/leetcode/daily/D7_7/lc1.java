package leetcode.daily.D7_7;

public class lc1 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,15};

    }
    public int[] twoSum(int[] nums, int target) {
        int[] so=new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target==nums[i]+nums[j]){
                    so[0]=i;
                    so[1]=j;
                    return so;
                }
            }
        }
        return null;
    }
}
