/*Group members : 
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                    Safaa Khan , 2110828 ,B0B*/
                    package GraphFramework;

                    import java.util.HashMap;
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
                               
                               
                             int value=0;
                             int innerKey =0;
                             int point =0;        
                             for (int j=0;j<innerMap.size();j++){ 
                                  getGraph().getVertex()[ outerKey].displayInfo(); 
                                
                              
                              int ind=0;
                             
                           for (Map.Entry<Integer, Edge> innerEntry : innerMap.entrySet()) {
                            
                             innerKey = innerEntry.getKey();
                             value = innerEntry.getValue().getWeight();
                                
                          
                                     getGraph().getVertex()[ innerKey].displayInfo();
                                    
                                   
                           
                                 if (ind==point){
                                       break ;
                                   }
                                
                                   ind++;     
                            } 
                                  
                                  
                              
                                  
                                   
                    
                               System.out.println("route length: "+ value);
                               System.out.println("\n");
                               
                                 point++;
                              }
                              System.out.println("\n----------------------------------------------------------------------------------------------------\n");
                         
                    }
                          
                       }
                    
                    }
                    
                    
                    
                    
                            
                        
                        
                    
                    