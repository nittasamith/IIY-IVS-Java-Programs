import java.util.Arrays;
public class MaxMinArray{
    public static void main(String[] args){
        int[] arr={5,2,8,1,3};
         Arrays.sort(arr);
         int min = arr[0];
         int max = arr[arr.length-1];
         System.out.println("maximum element :"+min);
         System.out.println("minimum element :"+max);
    }
}