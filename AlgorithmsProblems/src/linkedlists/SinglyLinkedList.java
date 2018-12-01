package linkedlists;

public class SinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

      LinkedList4 list1=new LinkedList4();
 
      list1.insert(110);    
      LinkedList4 list2 = list1;
            
      list1.insert(20);
      list1.insert(99);
      list1.insert(9);
      list1.insert(10);
      list1.insertAt(4,99);
     // list1.deleteAt(5);
      list1.show(list1.head);
      /*find the middle element of linked list1*/
      list1.findMidlle();

      int length = list1.findLengthRec(list1.head);
	System.out.println("length of linked list1 is\t"+ length);
	
	boolean found = list1.searchElement(list1.head,10);
	
	System.out.println("Search element fount is			" + found);
	
	int count1 = list1.countKey(list1.head,99);
	System.out.println("total number of element found     " + count1);
	
	
	
	//to create loop 
	list1.head.next = list2.head;
	boolean hasloop = list1.containsLoop(list1.head);
	
	System.out.println("this linked list has loop     " +list1.head.data +"      "+ hasloop);
	
	//to detect pallindrome or not
	
	 LinkedList4 pallind=new LinkedList4();
	 
	 pallind.insert(1);
	 pallind.insert(2);
	 pallind.insert(3);
	 pallind.insert(4);
	 pallind.insert(1);

	 pallind.head = pallind.detectPallindrome( pallind.head,pallind.head);
	 
	if(pallind.pallin)
	System.out.println("given list is pallindrome");
	
	else 
		System.out.println("not a pallindrome");
	
	
	
 LinkedList4 remove=new LinkedList4();
	 
 remove.insert(1);
 remove.insert(2);
 remove.insert(3);
 remove.insert(4);
 remove.insert(1);
 
 remove.removeDuplicate(remove.head);	
 remove.show(remove.head);
	
	
	
	
	}

   	
}
