//https://www.ideserve.co.in/
//https://leetcode.com/problemset/all/




//Find maximum element from each sub-array of size 'k'|
/*If the given input array is {9,6,11,8,10,5,14,13,93,14} and for k = 4, output should be 11,11,11,14,14,93,93. 
Please observe that 11 is the largest element in the first, second and third sub-arrays - {9,6,11,8}, {6,11,8,10} and {11,8,10,5}; 14 is 
the largest element for fourth and fifth sub-array and 93 is the largest element for remaining sub-arrays.
*/

package LinkedListProg;

public class FindLargestElementInSubArray {

	public static void largestElement(int A[]){
		  int largest = -1;
		for(int i=0;i<=(A.length-4);i++) {
			largest = A[i];
			for(int j=i+1;j<i+4;j++){
				if(A[j]>largest){
					largest=A[j];
					
				}
			}
			
			System.out.println((i+1)+ "subarray output"+ largest);
			largest = -1;
			
		}
		    
		
	
	}
	
	
	
	public static void main(String[] args) {
	
	//int A[] = {9,6,11,8,10,5,14,13,93,14,98,0,0};
	
	int A[] = {9,6,11,9};
	largestElement(A);
	
	
	}

}
