// print multiplication by leaving itself in array

import java.util.*;
public class Product {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        int product=1;
        left[0]=product;
        for(int i=1;i<arr.length;i++){
            product=product*arr[i-1];
            left[i]=product;
        }
        System.out.println(Arrays.toString(left));

        product=1;
        right[arr.length-1]=product;
        for(int i=arr.length-2;i>=0;i--){
            product=product*arr[i+1];
            right[i]=product;
        }
        System.out.println(Arrays.toString(right));

        int[] productArray=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            productArray[i]=left[i]*right[i];
        }
        System.out.println(Arrays.toString(productArray));
    }
    
}
