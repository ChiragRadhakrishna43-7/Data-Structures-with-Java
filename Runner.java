public class Runner {
    public static void main(String[] args){
        Linked_List  list = new Linked_List();
        list.insert(15);
        list.insert(17);
        list.insert(43);
        
        list.insertAtStart(73);
        
        list.insertAt(2,55);
        list.deletedAt(4);
        list.show();
    }
}
