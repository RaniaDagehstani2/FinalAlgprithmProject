/*Group members : 
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
                    Safaa Khan , 2110828 ,B0B*/
                    package AirFreightApp;

                    import GraphFramework.Edge;
                    import GraphFramework.Vertex;
                    
                    public class Route extends Edge {
                    //counstructer
                        public Route(Vertex source, Vertex target, Integer inputWeight) {
                            super(source, target, inputWeight);
                        }
                    
                        public Route(Vertex target, Integer inputWeight, Edge next) {
                            super(target, inputWeight, next);
                        }
                    
                        public Route(Vertex target, Integer inputWeight) {
                            super(target, inputWeight);
                        }
                         @Override
                         //overrite displayInfo() method from Edge class
                        public void displayInfo(){
                          System.out.print( " route length: "+getWeight()+ "\n");
                    
                            
                        }
                         @Override
                          //overrite setPartent  method from Edge class
                        public void setParent(Vertex  parent) {
                            super.setParent(parent);
                        }
                        
                    }
                    