package ArraysBinarySearch;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindElementOccursOnesInThree
{ 
	public static int getSingle(Integer[] listarr,int[] arr,int n){
		int sum1=0,sum2=0;
		
		for(int elm :listarr){
			sum1+=elm;
		}
		
		for(int elm :arr){
			sum2+=elm;
		}
		
			
		return (3*sum1-3*sum2)/2;
	}
	
	
	
	public static void main(String args[])
	{
		int arr[] = {3, 3, 2, 3};
		int sum=0; 
		int n = arr.length;
		 	
//		 List<int[]> list = Arrays.asList(arr);
//		 Set<int[]> set = new HashSet<>(list);
//		
//		 System.out.println(list.get);
		
		
		Set<int[]> set = new HashSet<>(Arrays.asList(arr));		
		set.toArray();
		set
		for( int[] s : set ){
			System.out.println(set);			
		}
	
		uniquearr = s.toArray();
//		System.out.println("The element with single occurrence is " + getSingle(uniquearr,arr, n));
	}
}
// Code contributed by Rishab Jain
