//Implem    entation of Trees:
public class Tree {
    
    //Strict Binary Tree: Each node has 0 or 2 children (leaves).
    //Full Binary Tree: Each node has exactly 2 children at the same level.
    //Complete Binary Tree: Filled from left to right. (0 or 2 children)
    
    //Binary Tree: Implementation
    //---------------------------
    Tree_Node root;
    //Inserting nodes to the tree
    public Tree_Node insertRec(Tree_Node root, int data)
    {
        if(root == null)
        {
            root = new Tree_Node(data);
        }
        else if(data < root.data)
        {
            root.left = insertRec(root.left,data);
        }
        else if(data > root.data)
        {
            root.right = insertRec(root.right,data);
        }
        return root;
    }
    public void insert(int i)
    {
        root = insertRec(root,i);
    }
    //tree traversals:
    //InOrder Traversal:
    //-------------------
    public void inorder()
    {
        inorderRec(root);
    }
    public void inorderRec(Tree_Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
    //------------------------------------------
    //PreOrder Traversal:
    //-------------------
    public void Preorder()
    {
        preorderRec(root);
    }
    public void preorderRec(Tree_Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    //-----------------------------------------
    //PostOrder Traversal:
    //-------------------
    public void Postorder()
    {
        postorderRec(root);
    }
    public void postorderRec(Tree_Node root)
    {
        if(root!=null)
        {
            preorderRec(root.left);
            preorderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
    //-----------------------------------------
    public static void main(String[] args)
    {
        Tree tree = new Tree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.inorder();
    }
}
