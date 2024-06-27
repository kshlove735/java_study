package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void queue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		
		return arrayQueue.remove(0);
	}
}



public class QueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		queue.queue("a");
		queue.queue("b");
		queue.queue("c");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
