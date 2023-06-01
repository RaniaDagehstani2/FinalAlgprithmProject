/*Group members : Safaa Khan , 2110828 ,B0B
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
For Prim Algorithm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm
For Kruskal Algoritm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm*/

package PhoneNetworkApp;

/**
 *
 * @author User
 */
import GraphFramework.Edge;
import GraphFramework.Vertex;
public class Line extends Edge {
    Integer Length ;

   public Line(){
       super();
   } 

    public Line( Vertex source, Vertex target, Integer inputWeight) {
        super(source, target, inputWeight);
        this.Length = 0;
    }

    public Line( Vertex target, Integer inputWeight, Edge next) {
        super(target, inputWeight, next);
        this.Length = Length;
    }

    public Line( Vertex target, Integer inputWeight) {
        super(target, inputWeight);
        this.Length = Length;
        
    }

    public void setLength(Integer Length) {
        this.Length =Length ;
    }

    public Integer getLength() {
        return Length;
    }
    
    
    
    @Override
    
     public void displayInfo(){
 
        System.out.print( " Office No. "+((char)(Integer.parseInt(getTarget().getLabel())+65))+"  line length "+getLength()+ "\n");
        
    
         
     }
  
    
}
