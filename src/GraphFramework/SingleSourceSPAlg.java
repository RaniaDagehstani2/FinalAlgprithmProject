/*Group members : 
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                    Safaa Khan , 2110828 ,B0B*/
                    package GraphFramework;
                    import java.util.Comparator;
                    import java.util.HashMap;
                    import java.util.Map;
                    import java.util.PriorityQueue;
                    
                    public class SingleSourceSPAlg  extends ShortestPathAlgorithm {    
                    
                        
                        // to assigent the single source shortest paths from given source to rest vertex 
                         Map<Integer, Edge> shortestPaths ;
                         //costructer
                        public SingleSourceSPAlg(Graph graph ) {
                            super(graph);
                            shortestPaths = new HashMap<>();
                        
                           
                            
                        }
                        //-------------------------------------------------------------------------------
                        //this methos is used to implement of the algorithm responsible for computing the shortest path for a specified source
                        public Map<Integer, Edge> computeDijkstraAlg(int source) {
                            
                            Map<Integer, Edge> shortestPaths = new HashMap<>();
                            //PriorityQueue is used to implement the Dijkstra  Algorithm
                            PriorityQueue<Edge> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.getWeight()));
                            //get source vertex
                           Vertex sourcevertex=getGraph().getVertex()[source];
                           //create edges that contain only source vertex ,with zere wheight 
                           Edge ed= getGraph().CreateEdge(null,sourcevertex, 0);
                           // has no parent becuse it is the source edge     
                             ed.setParent(null);
                           // add edge to minheap
                            minHeap.add(ed);
                            while (!minHeap.isEmpty()) {
                                //get the edge from minheap
                                Edge current = minHeap.poll(); 
                                // if the  current.getTarget() of current edge not in shortest path list that mean its not visited
                                if (!shortestPaths.containsKey(Integer.parseInt(current.getTarget().getLabel()))) {
                                    //add this edge in shortestpath 
                                    shortestPaths.put(Integer.parseInt(current.getTarget().getLabel()), current);
                                    //find the adjacient vertex for this vertex and compute the shortest path for each vertex
                                    for (Edge edge : adjList.get(Integer.parseInt(current.getTarget().getLabel()))) {
                                        if ((!shortestPaths.containsKey(Integer.parseInt(edge.getTarget().getLabel())))) {
                                         
                                   Edge edgeMinHeap =getGraph().CreateEdge(current.getSource(),edge.getTarget(), (current.getWeight() + edge.getWeight()));
                                        //parent attribute is used 
                                            edgeMinHeap.setParent(current.getTarget());
                                          
                                            minHeap.add( edgeMinHeap );
                                        }
                                    }
                                }
                            }
                            //return the shortest path for given source
                            return shortestPaths;
                        }
                    
                       
                    }
                    