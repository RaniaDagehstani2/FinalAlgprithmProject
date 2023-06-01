/*Group members : Safaa Khan , 2110828 ,B0B
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
For Prim Algorithm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm
For Kruskal Algoritm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm*/

package PhoneNetworkApp;
import GraphFramework.Vertex;
//sub class of vertex
public class Office  extends Vertex{
 //------------------------------------------------------------- 
    public Office() {
    }

    public Office(String inputData) {
        super(inputData);
    }
    
  //------------------------------------------------------------- 
   // this method is used to display the attribut of office class 
    @Override
     public  void displayInfo() {
         System.out.print("Office No. "+(char)(Integer.parseInt(getLabel())+65)+" ");
              //getEdges().printAllNodes();
     }
 //-------------------------------------------------------------  
     // this method is used to store O1, O2,أ¢â‚¬آ¦ or O15 أ¢â‚¬â€œ starts with O followed by a unique number 
    @Override
     public  void setLabel (String label){
          label ="O "+ label;
         super.setLabel( label);
    
}         
        
    
    
}
