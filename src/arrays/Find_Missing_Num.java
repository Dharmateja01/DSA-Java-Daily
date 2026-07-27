package arrays;

public class Find_Missing_Num {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n= arr.length+1;
        int ExpectedSum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i< arr.length;i++){
            actualsum=actualsum+arr[i];
        }
        int missingnum=ExpectedSum-actualsum;
        System.out.println("missing number is "+missingnum);
    }
}
