public class LinkedList{
   Node head, tail;
   int count;
   
   public void add(int item) {
      Node node = new Node(item);
      if(head == null) {
         head = node;
         tail = node;
         count++;
      }
      else {
         Node p = head;
         Node prev = null;
         while(p != null) {
            if(p == tail) {
               if(item > p.getItem()) {
                  tail.setNext(node);
                  tail = node;
                  count++;
                  break;
               }
            }
            if(p.getItem() == item) {
               if(p == tail) {
                  tail.setNext(node);
                  tail = node;
               }
               else {
                  node.setNext(p.getNext());
                  p.setNext(node);
               }
               count++;
               break;
            }
            else if(p.getItem() > item){
               if(p == head) {
                  node.setNext(head);
                  head = node;
                  count++;
                  break;
               }
               else if(p == tail) {
                  node.setNext(tail);
                  prev.setNext(node);
                  count++;
                  break;
               }
               else {
                  prev.setNext(node);
                  node.setNext(p);
                  count++;
                  break;
               }
            }
            prev = p;
            p = p.getNext();
         }
      }
   }
   public void delete(int item){
      Node p = head;
      Node prev = null;
      if(head!=null) { //checks if the link list is empty
         while(p!=null) {
            if(p.getItem() == item) {
               if(p == head) {
                  head = p.getNext();
                  p = null;
                  count--;
                  break;
               }
               else if(p == tail) {
                  tail = prev;
                  tail.setNext(null);
                  count--;
                  break;
               }
               else {
                  prev.setNext(p.getNext());
                  p = null;
                  count--;
                  break;
               }
            }
            prev = p;
            p = p.getNext();
         }
      }
   }  
   
   public String toString(){
      StringBuffer sb = new StringBuffer();
      Node p = head;
      while(p!=null) {
         sb.append(p.getItem()+" ");
         p = p.getNext();
      }
      return sb.toString();
   }
}