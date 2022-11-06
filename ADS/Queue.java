class Queue // by array
{
	int size;
	int Q[];
	int front;
	int rear;
	int n;
	Queue(int s)
	{
		size = s;
		Q = new int[size];
		front = rear = -1;       //pre-increment
	}
	boolean isFull() //checking queue is full or not
	{
		if(front == 0 && rear == size-1)
			return true;  // queue is full
		else
			return false;
	}
	
	void enqueue(int x)  //insert operation
	{
		if(isFull())
		{
			System.out.println("Queue is full: Overflow");
			return;
		}
		else  // insertion is possible
		{
			if(front == -1)  // i.e queue is empty
				front =0;    // rear is still at -1 here
			
			rear++;          // rear incremented to 0 index
			Q[rear] = x;	 //element insertion starts
			System.out.println(x+" Inserted");
			
		}	
	}
	
	boolean isEmpty()
	{
		if(rear == -1)  // no element is in queue
			return true;
		else
			return false;
	}	
	
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty: underflow");
			return -1;
		}
		else
		{
			int x = Q[front];
			if(front >= rear) // all elements are deleted in the queue
			{
				front = -1;   // reset or re-initiate
				rear = -1;
			}
			else
			{
				front++;
			}
			System.out.println("Deleted " +x);
			return x;			
		}				
	}
	
	void display()
	{
		for(int i = front; i<= rear; i++)
			System.out.print(Q[i]+" ");
	}
	
	public static void main(String args[])
	{
		Queue q1 = new Queue(5);
		q1.enqueue(12);
		q1.enqueue(10);
		q1.enqueue(9);
		q1.enqueue(45);
		q1.enqueue(22);
		System.out.println("Elements of Queue:========>");		
		q1.display();
		System.out.println();
		
		System.out.println("Elements after Deletion:========>");
		q1.dequeue();
		q1.dequeue();
		/*q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.display();      */
		
		System.out.println();
		q1.enqueue(29);
		q1.display();
			
	}
}

/*

				when size of array was correct:
12 Inserted
10 Inserted
9 Inserted
45 Inserted
22 Inserted
Elements of Queue:========>
12 10 9 45 22
Elements after Deletion:========>
Deleted 12
10 9 45 22

			when array size = 3 is taken:
12 Inserted
10 Inserted
9 Inserted
Queue is full: Overflow
Queue is full: Overflow
Elements of Queue:========>
12 10 9
Elements after Deletion:========>
Deleted 12
10 9

			When all elements deleted and array size = 6
12 Inserted
10 Inserted
9 Inserted
45 Inserted
22 Inserted
Elements of Queue:========>
12 10 9 45 22
Elements after Deletion:========>
Deleted 12
Deleted 10
Deleted 9
Deleted 45
Deleted 22
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
        at Queue.display(Queue.java:76)
        at Queue.main(Queue.java:97)

		when array size is 3 and all element deleted
		
Elements after Deletion:========>
Deleted 12
Deleted 10
Deleted 9
Queue is empty: underflow
Queue is empty: underflow
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
        at Queue.display(Queue.java:76)
        at Queue.main(Queue.java:97)		

		

IMPORTANT POINTS :========================

rear ptr will point where last element inserted
front ptr will point the next index where last element deleted
if R =F = -1 at initial

queue is full means there would be an element at every index(1st to last)

after front moved to 0th index it will not move further until we don't delete the element
whereas rear will move with each element insertion.
F<=R  or F=0(no element deleted)

once rear ptr reaches the last index no more element can be added even if
all element are deleted by front.








*/