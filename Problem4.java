package Java;

import java.lang.Math;
import java.util.*;

public class Problem4 {

    static int[] upcomingLocation(int[]x,String str){
        char[] route = str.toCharArray();
        for (int i=0;i<route.length;i++){
            if(route[i]=='N'){
                x[1]=x[1]+1;
            }
            else if(route[i]=='S'){
                x[1]=x[1]-1;
            }
            else if(route[i]=='E'){
                x[0]=x[0]+1;
            }
            else if(route[i]=='W'){
                x[0]=x[0]-1;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        return x;
    }

    static void shortestDistance(int []currentLocation,int []newLocation){
        double distance;
        distance=Math.sqrt(((currentLocation[0]- newLocation[0])*(currentLocation[0]- newLocation[0]))+((currentLocation[1]- newLocation[1])*(currentLocation[1]- newLocation[1])));
        System.out.println(distance);
    }
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int [] currentLocation=new int[2];
        int [] newLocation=new int[2];
        for(int i=0;i<2;i++)
        {
            currentLocation[i]=sc.nextInt();
            System.out.println("22");
        }
        
        String str=sc.nextLine();
        newLocation=upcomingLocation(currentLocation, str);
        shortestDistance(currentLocation, newLocation);
        

        sc.close();
    }
    
}
