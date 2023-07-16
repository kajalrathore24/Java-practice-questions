// Count Zeros

// Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
// Input Format :
// Integer N
// Output Format :
// Number of zeros in N
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 10204
// Sample Output 1 :
// 2
// Sample Input 2 :
// 708000
// Sample Output 2 :
// 4

package Recursion;

// without recursion
// import java.util.*;
// public class Countzeroes {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int count=0;
//         while(n!=0){
//             int x=n%10;
//             if(x==0){
//                 count++;
//             }
//             n=n/10;
//         }
//         System.out.println(count);
//     }
// }



// with recursion
import java.util.*;
public class Countzeroes {
    public static int count(int n){
        if(n == 0)
       return 0;

    if(n %10 ==0)
        return 1 + count(n / 10);
    else
        return count(n/10); 
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
