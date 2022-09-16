class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
    int size;
    MyQueue()
	{
		front=size;
		rear=0;
		size = 0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    arr[rear]=x;
        rear++;
    }

//Function to pop an element from queue and return that element.
  int pop()
    {
        // Your Code
        if(rear==front)
        return -1;
        else
        return arr[front++];
     }
}




