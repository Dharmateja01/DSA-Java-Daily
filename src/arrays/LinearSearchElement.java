package arrays;

public class LinearSearchElement {
    private static int linearsearch(int[] nums, int target) {
        for(int i=0;i< nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8};
        int target=50;
        int result=linearsearch(nums,target);
        if(result !=-1){
            System.out.println("element found at index : "+result);
        }else{
            System.out.println("element not found ");
        }
    }
}
