//Implementation of a Queue:
public class Queue {
    int queue[] = new int[5];
    int size,front,rear;
    
    //Insertion to the Queue:
    public void enQueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
        }
        else
        {
            queue[rear] = data;
            rear = rear + 1;// Circular Queue Implementation: rear = (rear+1)%5
            size = size + 1;
        }
    }
    //Display the elements:
    public void show()
    {
        for(int i = 0;i<size;i++)
        {
            System.out.print(queue[front+i] + " ");// Circular Queue Implementation:System.out.print(queue[(front+i)%5] + " ");
        }
    }
    //Remove the elements:
    public int deQueue()
    {
        int data = queue[front];
        if(isEmpty())
        {
            System.out.println("Queue is Full");
        }
        else
        {
            front = front+1;// Circular Queue Implementation: front = (front+1)%5
            size = size-1;
        }
        return data;
    }
    //Size of the queue:
    public int getSize()
    {
        return size;
    }
    //Check if queue is empty
    public boolean isEmpty()
    {
        return getSize() == 0;
    }
    //Check if queue is full
    public boolean isFull()
    {
        return getSize() == 5;
    }
    public static void main(String[] args)
    {
        Queue b = new Queue();
        b.enQueue(5);
        b.enQueue(2);
        b.enQueue(7);
        b.enQueue(3);
        b.show();
    }
}
