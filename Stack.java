//Implementation of a Stack and its Operations:
public class Stack {
    //Push Implementation:
    int stack[] = new int[5];
    int top = 0;
    public void push(int data)
    {
        if(top == 5)
        {
            System.out.println("Stack is full. Overflow!");
        }
        else
        {
            stack[top] = data;
            top++;
        }
    }
    //Pop Implementation:
    public int pop()
    {
        top--;
        int value = stack[top];
        stack[top] = 0;
        return value;
    }
    //Display contents:
    public void show()
    {
        for(int n : stack)
        {
            System.out.print(n+" ");
        }
    }
    //Peek Implementation: print the element present at the top of the stack.
    public int peek()
    {
        int data;
        data = stack[top-1];
        return data;
    }
    //Stack size:
    public int size()
    {
        return top;
    }
    //Check if the stack is empty:
    public boolean isEmpty()
    {
        return top <= 0;
    }
    public static void main(String[] args)
    {
        Stack a = new Stack();
        a.push(15);
        a.push(8);
        a.push(10);
        
        a.show();
        
        System.out.println("\n");
        System.out.println("------------------------------");
        
        a.pop();
        a.show();
    } 
}
