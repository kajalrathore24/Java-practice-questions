
package ArrayProject;
import java.util.*;
public class AverageDay {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("How many days temperature?");
        int numDays=console.nextInt();
        int[] temps=new int[numDays];
        // record temperature and find average
        int sum=0;
        for(int i=0;i<numDays;i++){
            System.out.print("Day "+(i+1)+"'s hight temperature");
            temps[i]=console.nextInt();
            // int next=console.nextInt();
            sum+=temps[i];
        }
        double average=sum/numDays;
        // count days above avearge
        int above=0;
        for(int i=0;i<temps.length;i++){
            if(temps[i]>average){
                above++;
            }
        }
        System.out.println();
        System.out.println("average temp="+average);
        System.out.println(above+"days above average");
    }
    
}
