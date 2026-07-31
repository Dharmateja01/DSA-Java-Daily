package arrays;

public class BinarySearchElement {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,43,67};
        int target=43;
        int left=0;
        int right= nums.length-1;
        int result=binarysearch(nums,target);
        if(result !=-1){
            System.out.println("element found at index : "+result);
        }else{
            System.out.println("element not found ");
        }
    }
    public static int binarysearch(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
//        int mid=(left+right)/2;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]<target) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
