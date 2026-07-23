package arrays;
public class PushEmptyPacketLast {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<n){
            arr[index]=0;
            index++;
        }
        System.out.println("Array after pushing empty packets to the last:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
