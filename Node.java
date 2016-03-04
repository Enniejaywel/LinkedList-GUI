//Node class

public class Node{
   
   private int item;
   private Node next;
   
   //constructor
   public Node(int item)                     { this.item = item; }
   public Node()                             {}
   
   //setter
   public void setItem(int item)            { this.item = item; }
   public void setNext(Node next)            { this.next = next; }
   //getter
   public int getItem()                      { return item; }
   public Node getNext()                     { return next; }
   

}//end of class