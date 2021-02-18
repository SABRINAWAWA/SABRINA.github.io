/**
 * A class that implements the ADT queue by using an expandable circular array
 * with one unused location.
 * 
 */
public class ArrayQueue<T> implements QueueInterface<T> {

	private T[] queue; // circular array of queue entries and one unused location
	private int frontIndex;
	private int backIndex;
	private static final int DEFAULT_INITIAL_CAPACITY = 50;

	public ArrayQueue() {
		this(DEFAULT_INITIAL_CAPACITY);
	} 

	public ArrayQueue(int initialCapacity) {
		queue = (T[]) new Object[initialCapacity + 1];
		frontIndex = 0;
		backIndex = initialCapacity;
	} 


	public void enqueue(T newEntry) {
		if (isArrayFull()) 
			doubleArray(); 

		backIndex = (backIndex + 1) % queue.length;
		queue[backIndex] = newEntry;
	} 
	
	public T getFront() {
		T front = null;

		if (!isEmpty()) {
			front = queue[frontIndex];
		}

		return front;
	} 

	public T dequeue() {
		T front = null;

		if (!isEmpty()) {
			front = queue[frontIndex];
			queue[frontIndex] = null;
			frontIndex = (frontIndex + 1) % queue.length;
		} 

		return front;
	} 


	public boolean isEmpty() {
		return frontIndex == ((backIndex + 1) % queue.length);
	} 


	public void clear() {
		if (!isEmpty()) { // deallocates only the used portion
			for (int index = frontIndex; index != backIndex; index = (index + 1)
					% queue.length) {
				queue[index] = null;
			} 
			queue[backIndex] = null;
		} 
		frontIndex = 0;
		backIndex = queue.length - 1;
	} 

	private boolean isArrayFull() {
		return frontIndex == ((backIndex + 2) % queue.length);
	} 

	private void doubleArray() {
		T[] oldQueue = queue;
		int oldSize = oldQueue.length;

		queue = (T[]) new Object[2 * oldSize];

		for (int index = 0; index < oldSize - 1; index++) {
			queue[index] = oldQueue[frontIndex];
			frontIndex = (frontIndex + 1) % oldSize;
		} 

		frontIndex = 0;
		backIndex = oldSize - 2;
	} 
	
	public void display() {
		
		for(int i=frontIndex; i!=(backIndex+1)%queue.length; i=(i+1)%queue.length) {
			T data = queue[i];
			System.out.print(data + " ");
		}
		System.out.println();
	}
   
   	public void splice(ArrayQueue<T> anotherQueue) {
   		T data=null;
   		int size=anotherQueue.queue.length;
   		if (anotherQueue.frontIndex!=(anotherQueue.backIndex+1)%size) {
   			for(int i=anotherQueue.frontIndex; i!=(anotherQueue.backIndex+1)%anotherQueue.queue.length; i=(i+1)%anotherQueue.queue.length) {
   				data = anotherQueue.queue[i];
   				this.enqueue(data);
   			}
   		}
   	} 
   	
   	public T getSecond() {
   		T data=null;
   		if (frontIndex!=(backIndex+1)%queue.length) {
   			data = queue[frontIndex+1];
   		}
   		return data;
	}
	
	
}