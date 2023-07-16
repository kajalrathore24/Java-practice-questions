// Remove X

// Given a string, compute recursively a new string where all 'x' chars have been removed.
// Input format :
// String S
// Output format :
// Modified String
// Constraints :
// 1 <= |S| <= 10^3
// where |S| represents the length of string S. 
// Sample Input 1 :
// xaxb
// Sample Output 1:
// ab
// Sample Input 2 :
// abc
// Sample Output 2:
// abc
// Sample Input 3 :
// xx
// Sample Output 3:






package Recursion;

import java.util.*;
public class RemoveX {
    public static String XRemove(String s){
        if(s.length()==0) return "";
        if(s.charAt(0)=='x')
            return XRemove(s.substring(1));
        return s.charAt(0)+XRemove(s.substring(1));
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(XRemove(str));
    }
    
}
