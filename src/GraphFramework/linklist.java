package GraphFramework;
/*Group members :
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                 Safaa Khan , 2110828 ,B0B
For Prim Algorithm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm
For Kruskal Algoritm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm*/

import java.util.logging.Logger;
import GraphFramework.*;


public class linklist  {
    private Edge  head;
    private int size ;
    
    // Constructor
    public linklist() {
       head = null;
    }
 
    // Example Method to check if list is empty
    public boolean isEmpty() {
       return head == null;
    }
    
   public void printAllNodes() {
      Edge hPointer =head;
 while (hPointer != null) {
      hPointer .displayInfo();
      hPointer = hPointer.getNext();
   }
   }

   public void addEdge(Edge e) {
   // Insertion as First node, Empty or non-empty list
 	 if (head ==null){    
             head =e;
         size++;
         }
   // Insertion anywhere else even at last
         else{
               Edge   helpPtr = head;
      while (helpPtr.getNext()!= null) {
    // we found our spot and stop traversal 
         helpPtr = (helpPtr.getNext());
      }
      // Now make new node and insert   
    helpPtr.next=e;
      size++;
      
   }
   }
   
   public void deleteEdge(Vertex v) {
   if (!isEmpty()) {
      if (head.getEnd()== v)  // if أ¢â‚¬إ“valueأ¢â‚¬â€Œ is in the first node
         head = head.getNext();
      // ELSE, value is (possibly) elsewhere in the list
      else {
         Edge help_ptr = head;
         while (help_ptr.next != null) {
            if (help_ptr.next.getEnd()== v) {
               help_ptr.next = help_ptr.next.next;
               size--;
               break;
            }
            help_ptr = help_ptr.next;
         }
         
     }
   }
   }
         
    public Edge  getEdge() {
       Edge  help_ptr = head;
         if(head !=null){
         head =head.getNext();
         return  help_ptr;
         }
         else return null;
       
   
}

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Edge  getHead() {
        return head;
    }

    public void setHead(Edge head) {
        this.head = head;
    }
   
 
   

 
}
 