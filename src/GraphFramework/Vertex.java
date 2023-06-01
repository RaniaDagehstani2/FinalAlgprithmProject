package GraphFramework;
/*Group members :
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                 Safaa Khan , 2110828 ,B0B
For Prim Algorithm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm
For Kruskal Algoritm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm*/

 
import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex {
 //declear the attribute    
  private String   label;
 // this link list is edge type to hode all aedges of vertex  
 private linklist  adjlist;
  private boolean isVisited;



//-------------------------------------------------------------
  
public Vertex(){
  this(null);
}
  public Vertex(String   inputData) {
    this.label = inputData;
    adjlist =new linklist();
    
  }

//-------------------------------------------------------------
   //this method is used add edges of vertex 
  public void addEdge(Edge e) {
   adjlist.addEdge(e);
   
  }

//------------------------------------------------------------
  //this method is used to return the adjlist list of edges of vertex
  public linklist  getEdges(){
    return this.adjlist;
  }
  
  //-------------------------------------------------------------
  public boolean isIsVisited() {
    return isVisited;
}
//-------------------------------------------------------------  
public void setIsVisited(boolean isVisited) {
    this.isVisited = isVisited;
}
//-------------------------------------------------------------
 //this methodd is used to get label of node
  public String   getLabel() {
    return label;
}
//-------------------------------------------------------------
  //this methodd is used to set the label of node
public void setLabel(String  label) {
    this.label = label;
}
//-------------------------------------------------------------
  //this methodd is used to set the list of edges
    public void setEdges(linklist edges) {
        this.adjlist = edges;
    }
//-------------------------------------------------------------
  // this method is used to print all attribue of the vertex
    public  void displayInfo() {
        System.out.print( "Vertex. "+(char)(Integer.parseInt(label)+65) +" ") ;
        adjlist.printAllNodes();
        System.out.println( " isVisited=" + isVisited + '}');
    }

    }

    
     

