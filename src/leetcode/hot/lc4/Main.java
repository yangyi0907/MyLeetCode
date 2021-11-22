package leetcode.hot.lc4;

public class Main {
    public static void main(String[] args) {
        int[] nums2={1,2};
        int[] nums1={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1=nums1.length;
        int num2=nums2.length;
        int num=num1+num2;
        int[] nums=new int[num];
        if(num1==0){
            if(num2%2==0){
                return (double) (nums2[num2/2]+nums2[num2/2-1])/2;
            }else{
                return nums2[num2/2];
            }

        }
        if(num2==0){
            if(num1%2==0){
                return (double) (nums1[num1/2]+nums1[num1/2-1])/2;
            }else{
                return nums1[num1/2];
            }
        }
        int i=0,j=0,k=0;
        while (k!=num){
            if(i==num1){
                while(j!=num2){
                    nums[k++]=nums2[j++];
                }
                break;
            }
            if(j==num2){
                while (i!=num1){
                    nums[k++]=nums1[i++];
                }
                break;
            }
            if (nums1[i] < nums2[j]) {
                nums[k++]=nums1[i++];
            }else {
                nums[k++]=nums2[j++];
            }
        }
        if(num%2==0){
            return (nums[num/2-1]+nums[num/2])/2.0;
        }else {
            return nums[num/2];
        }
    }
}
