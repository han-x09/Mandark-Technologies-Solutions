package Java;
import java.util.*;


public class Problem5{

    static void PerfectNumber(int x){
        int sum=0;
        for (int i=1;i<x;i++){
            if (x%i==0){
                sum=sum+i;
            }
        }
        if (sum==x){
            System.out.println("True");
        }
        else{
             System.out.println("False");
        }
        

    }
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a;
        a=sc.nextInt();
        PerfectNumber(a);

        sc.close();
    }
}