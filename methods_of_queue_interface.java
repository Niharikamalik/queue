import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   // Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();
// 	    offer is used to add element to the queue 
		q.offer(10); 
		q.offer(20);
		q.offer(30);
		q.add(40);// instead of offer we can also use add() but it throws an expection when queue is empty
		//  but offer print null and does throw any expection 
		System.out.println(q);
		// print head of queue
		System.out.println("peek() : " + q.peek());
		// element() also used to print head of queue .it is similar to peek() .
		// it throws NoSuchElementExpection when the queue is empty
		System.out.println("element() : " + q.element());
// 		this method remove and returns the head of the queue .it returns null when queue is empty.
		System.out.println("poll() : "+ q.poll());
// 	this method removesand returns the head of the queue. it throws  NoSuchElementExpection when queue is empty\
        System.out.println("remove() : "+ q.remove());
        // return the size of the queue 
        System.out.println("size() : "+ q.size());
        // check queue is empty or not 
        System.out.println("isEmpty() : " + q.isEmpty());
	}
}
