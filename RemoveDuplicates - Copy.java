import java.util.Arrays;
public class RemoveDuplicates{
    public static void main(String[] args){
        int[] arr ={5,2,8,2,5,1,3,8};
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length-1];

        System.out.println("Array After removing duplicates:");
        for(int i=0;i<j;i++){
            System.out.println(temp[i]+" ");
        }
    }
}