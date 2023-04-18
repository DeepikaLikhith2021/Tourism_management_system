package Collection_Programs;

import java.util.PriorityQueue;

import com.graphbuilder.struc.Stack;

public class Priority_queue {

	public static void main(String[] args) {
		
		
		PriorityQueue<Object> q=new PriorityQueue<Object>();
		q.add(30);
		q.add(20);
		q.add(1);
		q.add(2);
		
		q.add(40);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.peek());
		
		System.out.println(q.poll());
		System.out.println(q);

	}

}
