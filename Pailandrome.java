// pailandrome string 
import java.util.*;
public class Pailandrome {
    public static boolean Check(String s){
        String st="";
        for(int i=s.length()-1;i>=0;i--){
            st+=s.charAt(i);
        }
        if(s.equals(st)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean b=Check(s);
        if(b==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
