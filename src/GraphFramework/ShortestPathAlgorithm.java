/*Group members : 
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                    Safaa Khan , 2110828 ,B0B*/
                    package GraphFramework;

                    import java.util.ArrayList;
                    import java.util.List;
                    
                    public class ShortestPathAlgorithm {
                        //object of graph type 
                         private Graph  graph ;
                         // list to hold all edges of the graph 
                          List<List<Edge>> adjList;
                    //--------------------------------------------------------------------------------
                        public ShortestPathAlgorithm(Graph graph ) {
                            this.graph=graph;    
                            adjList = new ArrayList<>();
                            //this for loop o inlilize each elements of the addjlist with array list to hold all edges of each vertex 
                            for (int i = 0; i < graph.getVertex().length; i++) {
                                 adjList.add(new ArrayList<>());
                            }
                            
                            // this for loop is used to inltize each array list withe edges of each vertex  
                            for (int i = 0; i < graph.getVertex().length; i++) {
                                if (graph.getVertex()[i]!=null){
                       Edge  edge =graph.getVertex()[i].getEdges().getHead();
                        // this while loop is used to get each edge of certain  vertex  
                             while(edge!=null){
                            adjList.get(i).add(edge);
                            edge =edge.getNext();
                            }
                        }
                    
                            }
                        }
                    //--------------------------------------------------------------------------------
                       // return graph object
                        public Graph getGraph() {
                            return graph;
                        }
                        
                    
                         
                        
                            
                    
                        
                    }
                    