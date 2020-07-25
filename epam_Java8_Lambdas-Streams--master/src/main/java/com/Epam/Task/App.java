package com.Epam.Task;

/**
 * Average Of the Numbers- Program 
 *
 */
import java.util.*;
public class App 
{
	public static double Average(List<Integer> ar){
		IntSummaryStatistics stats = ar.stream().mapToInt(i -> i).summaryStatistics();
		return stats.getAverage();
	}
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println( "Enter number of elements:");
        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<Integer>();
        System.out.println("Enter elements:");
        for(int i = 0;i < n;i++){
        	int a = sc.nextInt();
        	ar.add(a);        
    	}
       System.out.println("Average of the entered elements = " + Average(ar));
    }
}
