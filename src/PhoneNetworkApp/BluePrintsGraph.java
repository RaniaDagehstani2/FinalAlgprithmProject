/*G/*Group members :
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                 Safaa Khan , 2110828 ,B0B
For Prim Algorithm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm
For Kruskal Algoritm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm*/
//www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm*/

package PhoneNetworkApp;

import GraphFramework.Edge;
import GraphFramework.Graph;
import GraphFramework.Vertex;
import java.util.ArrayList;
 
public class BluePrintsGraph extends Graph {

    public BluePrintsGraph() {
         super(); 
    }
     
    
   //Override creation methods  
    @Override
    public Vertex  createVertex(String  label){
        return new Office(label);
          
   }
    
    @Override
   public Edge  CreateEdge(Vertex v1 ,Vertex v2  ,Integer  w){
      Line e =new Line ( v1 , v2 , w);
      e.setSource(v1);
      e.setLength(w*5);
      return e;
   }
    
}
