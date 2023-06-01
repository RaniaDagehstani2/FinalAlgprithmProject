package GraphFramework;
/*Group members : 
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                    Safaa Khan , 2110828 ,B0B
For Prim Algorithm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm
For Kruskal Algoritm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm

 */
import java.util.*;
import java.io.FileNotFoundException;

public class Graph {
//declear the attribute 
// verticesNo : number of vertex in list 
  private  int verticesNo;
//edgeNo:  number of edges in list  
  private  int edgeNo;
  // list of vertecis 
    //LinkedList<LinkedList<Edge>> edges;
    Vertex [] vertices ;
  private boolean isDigraph;
  private boolean isWeighted;
  

//-------------------------------------------------------------
// constractor 
  public Graph() {
      this(false ,false );
  }

    public Graph(boolean isDigraph, boolean isWeighted) {
        // ininlize all attributes 
        this.isWeighted =  isWeighted;
        this.isDigraph= isDigraph;
        this.edgeNo=edgeNo;
        this.verticesNo=verticesNo;
        // by default
        //edges=new LinkedList();
        vertices=new Vertex[20];
      
         
    }
  

//-------------------------------------------------------------

  public void AddVertex(Vertex  v ,int index) {
    // add vertex to the list of vertcise
    vertices[index]=v; 
    // increament by one 
    verticesNo++;
  }

//-------------------------------------------------------------
  // this method  check if the graph is  weighted or not 
  public boolean isWeighted() {
    return this.isWeighted;
  }
//-------------------------------------------------------------

// this method  check if the graph is directed or not 
  public boolean isDirected() {
    return this.isDigraph;
  }

  //----------------------------------------------------------
  // this method  to set the value directed variable  
  public void  setisDirected(boolean v) {
    isDigraph=v;
  }

//-------------------------------------------------------------
// this method used to number of vertices in list 
  public int  getVerticesNo() {
    return verticesNo;
}
//-------------------------------------------------------------
  // this method used to  set the number of vertcise 
public void setVerticesNo(int NoOfVertices) {
    this.verticesNo =NoOfVertices ;
}

//-------------------------------------------------------------
// this method used to get number of edges in lisr 
public int  getEdgeNo() {
    return edgeNo;
}
//-------------------------------------------------------------
// this method used to  set number of edges in list 
public void setEdgeNo(int NoOFEdge) {
    this.edgeNo = NoOFEdge;
}

//-------------------------------------------------------------
// this method used to  read  the vertices and edges  from the txt and craete list of vertecise and edges 
public void readFromFile(String fileName) throws FileNotFoundException, java.util.NoSuchElementException{
  
    //creat file objto read from file 
   java.io.File fileGraph=new java.io.File(fileName);
   // creat Scanner obj to read from file         
  Scanner input =new Scanner(fileGraph);
  
  // read first String 
   String str =input.next();
   
   int value =input.nextInt();
   /* if the value thar has been read it = zero that mean the graph is undircted(false)
   if the value = 1 that mean the graph is dircted (true)*/
   if (value==1 )
   setisDirected(true);
   
   //read number of the vertcies and number of edges in graph 
  int verticesnumber=input.nextInt();
  //crate array of length equal to vertices number
  this.vertices=new Vertex[verticesnumber];
  //rad the number of edges 
  int edge=input.nextInt();

  // for loop is used to read itratively all vertices and costs of each edge
  for (int i=0;i<edge;i++){
      //read the labels of nodes
     char s1= input.next().charAt(0);
     char  s2=input.next().charAt(0);
     // creat two obj using createVertex() method
   Vertex  v1=createVertex(s1-65+"") ;
    Vertex v2=createVertex(s2-65+"") ;
   // read the wight of the edges
    int w =input.nextInt();

    // add the edg to adjency list 
     AddEdge( v1 ,v2, w);
    
  }
      
 // close input object 
 //alledges();
input.close();


}
//--------------------------------------------------------------------------------
// this method is used to connect to vertecise with edge
 public Edge AddEdge(Vertex  v1 ,Vertex  v2 ,  Integer  w){
     //creat edge by using CreateEdge method
     Edge  edge =CreateEdge(v1, v2, w);
     // determine the position of the  source vertex
       int index =Integer.parseInt(v1.getLabel());
     // add vertex to the vertex array  
      if (vertices[index]==null){
          
          AddVertex(v1,index);
      }
         vertices[index].addEdge(edge);
         index =Integer.parseInt(v2.getLabel());
          if (vertices[index]==null){
          
          AddVertex(v2,index);
      }
                 if (!isDigraph){
          //// determine the position of the  target  vertex 
           
        // add vertex to the vertex array      
           // add edge to the vertex  
             edge =CreateEdge(v2, v1, w);
            
          vertices[index].addEdge(edge);
                 }
     // if graph indercted increment the number of edges two times ,else one time
     if (!isDigraph)
      edgeNo=edgeNo+2;
     else
          edgeNo++;
  
      return  edge;  
  
 }
// this method return the list of vertices
    public Vertex[] getVertex() {
        return vertices;
    }
//--------------------------------------------------------------------------------     
//* this function takes as parameters the number of vertices and the number of edges. 
//It is responsible for creating a graph object with the specified parameters and 
 // randomly initializes the vertices labels, creating edges that connects the
//created vertices randomly and assigning them random weights.//*
    
    public Vertex[] makeGraph(int numnode , int numEdge){
 // array list that hold the vertices 
  vertices =new Vertex[numnode];
     // create object of type random  
        Random randm = new Random();
   // ensure that all verts are connected
        for (int i = 0; i < numnode - 1; i++) {
            int weight = randm.nextInt(20) + 1;//generate random edge weights between 0-20
             Vertex  v1= createVertex(i+"");
             Vertex  v2= createVertex((i+1)+"");       
            AddEdge( v1,v2,weight); //connect verts
        }
        // generate edges bewteen verts with the remaining edges
        int remEdges = numEdge - (  numnode  - 1);

        for (int i = 0; i < remEdges; i++) {
            int srcVert = randm.nextInt(numnode);
            int destVert = randm.nextInt(numnode);
            Vertex  s =createVertex(srcVert+"");
               
           Vertex  d =createVertex(destVert+"");
                    
            if (destVert == srcVert || isConnected(s, d, vertices)) { // to avoid self loops and duplicate edges
                i--;
                continue;
            }
            // generate random weights in range 0 to 20
            int weight = randm.nextInt(20) + 1;
            // add edge to the graph
            AddEdge( s, d, weight);
            

        }
        //alledges();
        return vertices;

    }


//--------------------------------------------------------------------------------     
    // this method is used to check that all vertecise is connected or not.
    public boolean isConnected(Vertex source ,Vertex destenation  ,Vertex []v){
         Edge   edge;
        if (v[0]!=null)
        edge=(v[0].getEdges().getHead());
       for (int i=0 ;i<v.length;i++) 
           if(v[i]!=null){
           edge=(v[i].getEdges().getHead());
       while (edge !=null){
               if (edge.getSource()!=null){
                if(edge.getSource().equals(source)&&edge.getTarget().equals(destenation)||edge.getTarget().equals(source)&&edge.getTarget().equals(source) )
                    return true;
       }
         edge =(edge.getNext());
       }
           }    
    
    return false;
    }
    
    
   //-------------------------------------------------------------------------------- 
    //this method is used to  creat vertex of type 
   public Vertex  createVertex(String label){
       //return null ;
       return null;
       
   }
    //this method is used to  create  edge 
   public Edge  CreateEdge(Vertex  v1,Vertex  v2 ,Integer  w){  
      return  null;
   }
       
public void display(){
   for (int i=0 ;i<vertices.length;i++){
       if ( vertices[i] !=null){
           System.out.println("vertex "+vertices[i].getLabel());
        vertices[i].getEdges().printAllNodes();
       }
       
   } 
}
   
   
}
    


    

       
    

