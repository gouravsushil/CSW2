package Quizz1;

import java.util.Scanner;

class Node { 
	  
    int data; 
    Node next; 

    Node(int d) { 
        data = d; 
        next = null; 
    } 
}

public class q2a { 
	  
 
 // Function to search an element in the linked list and interchange it with the element in front of it. 

	public static void CREATE(Node start) {
		
	}
    public static void SEARCH(Node start, int item, Node loc) {
        Node curr = start;
        Node prev = null;
        
        while (curr != null && curr.data != item) {
            prev = curr;
            curr = curr.next;

        }

        if (curr != null && prev != null) {
            loc = curr;
//            prev.next = curr.next;
//            curr.next = start;
//            start = curr; 
            int temp = prev.data;
            prev.data = curr.data;
            curr.data = temp;
            
        }
        else if(prev == null) {
        	loc = curr;
        	
        }
        else {      
        	loc = null;  
        	System.out.println("Item not found");
        }   
     } 
    public static void DISPLAY(Node curr) {
    	while(curr != null) {
    		System.out.print(curr.data+" ");
    		curr = curr.next;
    	}
    }
    public static void main(String[] args) {   
//        	q2a list = new q2a();      
//        	list.head = new Node(1);     
//        	list.head.next = new Node(2);     
//        	list.head.next.next = new Node(3); 
    	Scanner sc = new Scanner(System.in);
    	Node n1 = new Node(1);
    	n1.next = new Node(2);
    	n1.next.next = new Node(3);
    	n1.next.next.next = new Node(4);
//    	DISPLAY(n1);
    	
    	
    	Node loc = null;
//    	
//    	
    	System.out.println("Enter the number to search");
    	int x = sc.nextInt();
    	SEARCH(n1,x,loc);
    	DISPLAY(n1);
        	
    }
}

