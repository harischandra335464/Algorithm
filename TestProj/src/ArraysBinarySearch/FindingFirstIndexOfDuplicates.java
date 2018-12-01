package ArraysBinarySearch;

public class FindingFirstIndexOfDuplicates {

	public static int findIndexOfElement(int A[],int val){
		int index,mid;
		int low =0;
		int high = A.length-1;
		
		while(low<=high){
			mid = (low+high)/2;
			
			if(A[mid]==val) {
				index = mid-1;
				while(A[index]>=A[mid]){
				    index--;
		    	}
				return (index+1);
			}
				
			
			else if(A[mid-1]<val)
				low = mid+1;
			else 
				high = mid-1;
			
			
		}
		return -1;
		
	
		
	}
	

	public static void main(String[] args) {
	
		 int[] array = {0, 1, 2, 2, 4,4,4,4,4, 5, 5,5,5,5,5, 5, 8};
	     int num = 5;
	     int index;
	     index= findIndexOfElement(array,num);
	     
	     System.out.println("index of duplicate element     "    +index);
	    	 
	     
		
	}

}
