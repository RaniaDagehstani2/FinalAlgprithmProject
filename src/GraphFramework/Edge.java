package GraphFramework;
/*Group members :
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                 Safaa Khan , 2110828 ,B0B
For Prim Algorithm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm
For Kruskal Algoritm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm*/


public class Edge implements Comparable<Edge>{
    //declear the attribute 
    private Vertex source;
    private Vertex target;
    private Integer weight;
    private Vertex parent;
     Edge next;
 

    public Edge() {
        this(null ,null,0);
    }
      
    
    public Edge(Vertex source, Vertex target, Integer inputWeight) {
      this.source = source;
      this.target = target;
      this.weight = inputWeight;
       this.next =null;
      
    }
     public Edge( Vertex target, Integer inputWeight,Edge next) {
        
      this.target = target;
      this.weight = inputWeight;
      this.next =next;
    }
     
     
     public Edge( Vertex target, Integer inputWeight) { 
      this.target = target;
      this.weight = inputWeight;
      this.next =null;
      
    }
//-------------------------------------------------------------
  //this method is used to get end vertex 
    public Vertex getEnd() {
      return this.target;
    }
    //-------------------------------------------------------------
  //this method is used to get weight of the edge  
    public Integer getWeight() {
      return this.weight;
    }
   //-------------------------------------------------------------
  //this method is used to display all attribute of edge
    public void displayInfo(){
        System.out.print( " "+(char)(Integer.parseInt(target.getLabel())+65)+"   "+": Length line  : "+weight*5+ "\n");
    }  
//-------------------------------------------------------------
  //this method is used to get parent
    public Vertex getParent() {
        return parent;
    }
//-------------------------------------------------------------
  //this method is used to set parent 
    public void setParent(Vertex parent) {
        this.parent = parent;
    }
//-------------------------------------------------------------
  //this method is used to source
    public Vertex getSource() {
        return source;
    }
//-------------------------------------------------------------
  //this method is used to st source
    public void setSource(Vertex source) {
        this.source = source;
    }
//-------------------------------------------------------------
  //this method is used to get target
    public Vertex getTarget() {
        return target;
    }
//-------------------------------------------------------------
  //this method is used to set target 
    public void setTarget(Vertex target) {
        this.target = target;
    }
//-------------------------------------------------------------
  //this method is used to next edge in list 
    public Edge getNext() {
        return next;
    }
//-------------------------------------------------------------
  //this method is used to set next
    public void setNext(Edge next) {
        this.next = next;
    }
//-------------------------------------------------------------
  //this method is used to weight of edge 
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
   //-------------------------------------------------------------
  //this method is used to compare between to edge by the weight   
     @Override
    public int compareTo(Edge edge) {
        return weight  - edge.weight;
    }


   
}
    
      
  