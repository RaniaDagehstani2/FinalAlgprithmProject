/*Group members : 
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                    Safaa Khan , 2110828 ,B0B*/
                    package GraphFramework;

                    import java.util.ArrayList;
                    import java.util.Collections;
                    import java.util.HashMap;
                    import java.util.List;
                    import java.util.Map;
                    
                    public class DBAllSourceSPAlg extends ShortestPathAlgorithm {
                        //create object of type SingleSourceSPAlg to call the method that compte theshortest path for given source
                        SingleSourceSPAlg s ;
                        //this list to hold all shortest pathes for each vertex in graph 
                        Map<Integer, Map<Integer, Edge>> allShortestPaths;
                        //to assigent th sum of the total  of routes from the source to each rest vertex 
                       
                         
                         //constracter 
                        public DBAllSourceSPAlg(Graph graph) {
                            //inltiaze the attributes 
                            super(graph);
                            s =new SingleSourceSPAlg(graph );
                            allShortestPaths = new HashMap<>();   
                        }
                       //---------------------------------------------------------------------------------- 
                        //this method is used to compute the shortest path from each vertex to the rest of the vertices
                       public Map<Integer, Map<Integer, Edge>> computeDijkstraBasedSPAlg() {
                           // in this loop , call computeDijkstraAlg() and send each vertex of graph ,then assigent the return list to  allShortestPaths list
                            for (int i = 0; i < getGraph().getVertex().length; i++) {
                                if (getGraph().getVertex()[i]!=null)
                                allShortestPaths.put(i, s. computeDijkstraAlg(Integer.parseInt(getGraph().getVertex()[i].getLabel())));
                            }
                            return allShortestPaths;
                        }
                       
                       //this method is used display all shortest path for all vertex 
                       public void display(){
                             String noroute ="";
                           for (Map.Entry<Integer, Map<Integer, Edge>> entry : allShortestPaths.entrySet()) {
                                int outerKey = entry.getKey();
                             
                        Map<Integer, Edge> innerMap = entry.getValue();
                        System.out.println("The starting point location is  "+(char)(Integer.parseInt(getGraph().getVertex()[ outerKey].getLabel())+65) );
                        
                               System.out.println("The routes from location " +(char)(Integer.parseInt(getGraph().getVertex()[ outerKey].getLabel())+65)+" to the rest of the locations are:");
                               
                               System.out.println();
                               
                              int x =0; 
                             int value=0;
                             int innerKey =0;
                             Edge edge=null;  
                              Vertex vextex=null;
                                Vertex path [] ;
                                
                                
                                
                           for (Map.Entry<Integer, Edge> innerEntry : innerMap.entrySet()) {
                              path =new Vertex [getGraph().getVertex().length];
                             innerKey = innerEntry.getKey();
                             
                              
                             while (innerKey!=Integer.parseInt(getGraph().getVertex()[x].getLabel())){
                                 getGraph().getVertex()[  outerKey].displayInfo();
                                  System.out.print(" - ");
                                  getGraph().getVertex()[x].displayInfo();
                                         
                                   System.out.println(" --- impossible\n");
                                   x++;
                                 
                             }
                              x++;
                             value = innerEntry.getValue().getWeight();
                              edge = innerEntry.getValue();
                                
                                            Vertex target = getGraph().getVertex()[ innerKey];
                                             vextex =edge.getParent();
                                             
                                             int i =0 ;
                                              if (vextex !=null){
                                                  // this aeey for get all parents of vertex 
                                             path[0]=vextex ;
                                             
                                             
                                             i++;
                                             //reverse the map to simplyfy get  path procecsing  
                                             List<Map.Entry<Integer, Edge>> reversedEntries = new ArrayList<>(innerMap.entrySet());
                                                   Collections.reverse(reversedEntries);
                                              
                                             for (Map.Entry<Integer, Edge> inner : reversedEntries) {
                                                     int key = inner.getKey();
                                                      edge = inner.getValue();
                                                if (vextex !=null)
                                                 if ( key ==Integer.parseInt(vextex .getLabel())){
                                                    
                                                     if (edge.getParent()!=null){
                                                       path [i]=edge.getParent();
                                                               i++;
                                                               vextex=edge.getParent();
                                                     }
                     
                                             }
                                             }
                           /// to ensure that the path start feom sourse vertex                  
                         if ( ! path [i-1].getLabel().equals(getGraph().getVertex()[ outerKey].getLabel()))
                                                 path[i]=getGraph().getVertex()[ outerKey];
                                for (int j=path.length-1;j>=0;j--){
                                    if (path[j]!=null){
                                 path[j].displayInfo();
                                 System.out.print(" - ");
                                    }
                                    
                                }
                                              }
                                target.displayInfo();
                               System.out.println("--- route length: "+ value);
                               System.out.println("\n");
                            
                              
                               
                             }
                              if(innerKey!=Integer.parseInt(getGraph().getVertex()[getGraph().getVertex().length-1].getLabel())){
                                 getGraph().getVertex()[  outerKey].displayInfo();
                                  System.out.print(" - ");
                                  getGraph().getVertex()[x].displayInfo();
                                         
                                   System.out.println(" --- impossible\n"); 
                                   
                             }
                            
                            
                              
                              System.out.println("\n----------------------------------------------------------------------------------------------------\n");
                           }
                       }
                    }
                          
                       
                    
                    
                    
                    
                    
                            
                        
                        
                    
                    