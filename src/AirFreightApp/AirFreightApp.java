
package AirFreightApp;

import GraphFramework.*;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AirFreightApp {

   
    public static void main(String[] args) throws FileNotFoundException {
      //create object of    AFRouteMap
    AFRouteMap  g =new  AFRouteMap(); 
        g.setisDirected(true);
    DBAllSourceSPAlg dijkstra;      
 int n = 0, m = 0, MenuChoice = -1;
        Scanner in = new Scanner(System.in);
        // menu do while 
        do {
            System.out.println("\t\t\n------- Runtime of Dijkstra algorithm ------------\n");
            System.out.println("1- First Requarement : Read From The Graph ---------");
            System.out.println("2- Second Requarement : Creat Random Graph ---------");
            System.out.println("3- Exit from program ---------");
            System.out.print("> \nEnter your choice : ");
            MenuChoice = in.nextInt();
            if (MenuChoice != 1 && MenuChoice != 2&&MenuChoice != 3) {
                System.out.println("****Invalid input!****");
                 System.out.print("> Try Aqain  ");
               MenuChoice = in.nextInt();
               continue;
            }
            // menu break condition
            
            // to perform the Kruskal and prim of requarement 2 
             if ( MenuChoice == 2) {
            System.out.println("> Available cases (where n represents # of vertices and m represents # of edges: )");
            System.out.println(" 1-  n=2000\tm=10000");
            System.out.println(" 2-  n=3000\tm=15000");
            System.out.println(" 3-  n=4000\tm=20000");
            System.out.println(" 4-  n=5000\tm=25000");
            System.out.println(" 5-  n=6000\tm=30000");
 
            System.out.print("> Enter a case to test: ");
            int choice = in.nextInt();
            // switch for all avaliable cases of the test 
            while (choice < 1 || choice > 5) {
                System.out.println("Invalid input!");
                System.out.print("> Try Aqain  ");
                choice = in.nextInt();
            }
            switch (choice) {
                  case 1: {
                    n=2000;
                    m=10000;
                }
                break;
                case 2: {
                   n=3000;
                   m=15000;
                }
                break;
                case 3: {
                   n=4000;
                   m=20000;
                }
                break;
                case 4: {
                    n=5000;
                    m=25000;
                }
                break;
                case 5: {
                    n=6000 ;
                    m=30000;
                }
               
            }
          // create random graph 
            g.makeGraph(n, m);
            //create obje ction of typeDBAllSourceSPAlg(g) and sent the random graph 
              dijkstra = new DBAllSourceSPAlg(g);
            long StartTime = System.currentTimeMillis();
            //call computeDijkstraBasedSPAlg()mehode
           dijkstra.computeDijkstraBasedSPAlg();
           long EndtTime = System.currentTimeMillis();         
                 System.out.println("\n----------------- dijkstra----------------\n");
             System.out.println("\nThe time run of  dijkstra when n = "+n + ", m = "+ m +" is "+(EndtTime-StartTime));
           System.out.println("\n---------------------------------------\n");
        } 
         
          if (MenuChoice == 1) {
           //read the vertecies and edges from file and create graph 
          g.readFromFile("Graph2.txt");
          //create obje ction of typeDBAllSourceSPAlg(g) and sent the random graph 
           dijkstra = new DBAllSourceSPAlg(g);
           //call computeDijkstraBasedSPAlg()mehode
           dijkstra.computeDijkstraBasedSPAlg();
           //display() the result
             dijkstra.display();
           
          
        }
          // to exit from program 
            if (MenuChoice == 3) {
           
                System.out.println("Good Bye :)");
                System.exit(0);
          
        }
        } while (MenuChoice != 3 );
       
        
        }
}

    
    
