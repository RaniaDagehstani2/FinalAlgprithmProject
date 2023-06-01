
package AirFreightApp;

import GraphFramework.Edge;
import GraphFramework.Graph;
import GraphFramework.Vertex;


public class AFRouteMap extends Graph {
//override  createVertex() method     
@Override
public Vertex  createVertex(String label){
      
       return new Location(label) ;
       
   }
    //this method is used to  create  edge and its overrided 
@Override
   public Edge  CreateEdge(Vertex  v1,Vertex  v2 ,Integer  w){  
      return  new Route(v1,v2,w);
   }
}