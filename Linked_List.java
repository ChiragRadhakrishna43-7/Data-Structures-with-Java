//Implementation of Linked List:
public class Linked_List {
   
    Node head;
    //Insert Method:
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    //Print the Nodes:
    public void show()
    {
        Node n = head;
        while(n.next!=null)
        {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
    //Insert at the beginning:
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        node.next = head;
        head = node;
    }
    //Insert at a particular position:
    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(index == 0)
        {
            insertAtStart(data);
        }
        else
        {
            Node n = head;
            for(int i = 0; i<index-1;i++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    //Deletion of a node from a linked list:
    public void deletedAt(int index)
    {
        if(index == 0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            for(int i = 0; i<index-1; i++)
            {
                n = n.next;
            }
            n.next = n.next.next;
        }
    }
}
