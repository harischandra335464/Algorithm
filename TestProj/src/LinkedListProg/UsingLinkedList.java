package LinkedListProg;

import java.util.LinkedList;


public class UsingLinkedList {

	public static void maxFromEachSubArray(int A[],int k){
		
		LinkedList<Integer> list = new LinkedList();
		
		//remove index from list whose corresponding element is less that current one
		for(int i=0;i<k;i++){
			
			while(!list.isEmpty()&& A[list.getLast()] < A[i] ){
				list.removeLast();
			}
			list.addLast(i);
		}
		
		
		for(int i=k;i<A.length;i++){
			
			//first element will the largest element in current window
			System.out.print("       " + A[list.getFirst()]);
			
			//remove the elemnt which does not present in current window
			//sliding window if current index isnt covered by size of window then no use just remove it.
			while(!list.isEmpty()&& list.getFirst()<(i-k+1)){			
				list.removeFirst();
			}
			
			//same process remove index whose corresponding value is less than current index value 
			
			while(!list.isEmpty()&&A[list.getLast()]<A[i]){
				list.removeLast();
			}
			
			list.addLast(i);
			
		}
		System.out.print("       " + A[list.getFirst()]);
		
		
	} 
	
	
	
	public static void main(String[] args) {
		
		  int[] array = {9,6,11,8,10,5,14,13,93,14,100};
	        int k = 4;
	        
	        maxFromEachSubArray(array,k);
		
	}

}
