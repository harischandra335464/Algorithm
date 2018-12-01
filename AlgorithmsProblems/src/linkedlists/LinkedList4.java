//https://www.geeksforgeeks.org/top-20-linked-list-interview-question/
package linkedlists;

import java.util.HashSet;
import java.util.Iterator;

public class LinkedList4 {
	Node head;
	boolean pallin=true;

	//===========================================================================================
	public void insert(int data){
		
		Node node = new Node();
		node.data= data;
		node.next = null;
		
		if(head==null){
			head=node;
		}
		else{
			
			Node temp =head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next = node;
		}
		
	}	


	//===========================================================================================
	
	public void insertAt(int index,int data){
				Node node = new Node();
				node.data=data;
				node.next=null;
				Node current = head;
				if(index==1){
					   node.next=head;
					   head=node;
					   
					}
				else{
				while((index-1)>1&&current!=null){
					current=current.next;
					index--;
				}
				
					if(current!=null){
					node.next=current.next;
					current.next = node;
					}
					else
						System.out.println("invalid position");
				}
					
	}
	

	//===========================================================================================
	
	public void deleteAt(int index){
		
		if(index==1){
			head=head.next;
			
		}
		
		else{
			Node current = head;
			while((index-1)>1&&current!=null){
				current=current.next;
				index--;
			}
			if(current.next!=null){
				current.next=current.next.next;
			}
			else{
				System.out.println("invalid position");
			}
			
			
		}
		
		
		
	}
	

	//===========================================================================================
	
	public void show(Node n) {
		       //Node n=head;
		       while(n!=null){
		    	   System.out.println(n.data);
		    	   n= n.next;
		       }
			
		}

	//===========================================================================================
	
   public void findMidlle(){
	   int mid,data,count=0;
	   Node current=head,prev;

	   while(current!=null){
		    
		     current = current.next;
		     count++;	     
	   }
	   
	   mid = count/2;
	   current = head;
	   for(int i=0;i<mid;i++){
		   current=current.next;
	   }
   System.out.println("middle element is : "+ current.data);

   prev=current=head;
   while(true){
	   if(current==null || current.next==null){     // will check first statement only if its flase then go for next statement
		   break;
	   }
	   prev = prev.next;
	   current = current.next.next;
   }
   System.out.println("middle element by efficient way is : "+ prev.data);
   
   }
   
   
   //	===========================================================================================

   public int findLengthRec(Node start){
	   
	   		if(start==null){
	   			return 0;
	   		}
	   		
	   		 return 1 + findLengthRec(start.next);
	   		     		  
   }
   //  ==============================================================================================
   
   public boolean searchElement(Node start,int key){
	   
	   if(start.data==key){
		   return true;
	   }
	   
	   return searchElement(start.next, key);
	   
   }
   //=================================================================================================
   
   public boolean containsLoop(Node start){
	   HashSet<Node> hs = new HashSet<>();
	   
	   while(start!=null){
		   
		   if(hs.add(start)){
			   start=start.next;
		   }
		   else 
			   return true;
		   
	   }
	   return false;
   } 
   
   
   //=================================================================================================
   public int countKey(Node start,int key){
	   			
	   			if(start.next==null){
	   				return 0;
	   			}
	   			
	   			int count=countKey(start.next,key);
	   			
	   			if(start.data==key){
	   			   count++;	
	   			}
	   		 
	   		  return count;
   }
   
  //====================================================================================================

   public Node  detectPallindrome(Node start,Node end){
	   
	           
	   		   if(end==null){
	   				return start;
	   			}
	   		   start = 	detectPallindrome(start,end.next);
	   			
	   		   if(start.data!=end.data){
	   			pallin=false;
	   			  // return null;
	   				  			
	   			}	   			
	   				   			
	   			return start.next;
   }
   

	
 //=============================================================================================================

public void removeDuplicate(Node start){
	
		Node node = new Node();
		node.next = null;
		HashSet<Integer> hs = new HashSet<>();
		while(start!=null){ 
		hs.add(start.data);
		start=start.next;	
		}
		
		Node noduplicates = new Node(); 
		noduplicates=null; 
		Iterator<Integer> itr = hs.iterator();
		head = null;
		while(itr.hasNext()){
			insert(itr.next());
		}
}
	
}	
