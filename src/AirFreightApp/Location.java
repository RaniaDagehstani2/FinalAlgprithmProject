/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirFreightApp;

import GraphFramework.Vertex;
 
/**
 *
 * @author User
 */
public class Location extends Vertex  {
    //Attribute 
    private String city;

 //constructers   
    public Location() {
    }

    public Location(String inputData) {
        super(inputData);
    }
    //stor in city "loc "+label as new label 
    public void setLable(String label ){
        city="loc "+label ;
        
    }
    
  @Override
  //overrite displayInfo() method from Vertex class
    public void displayInfo(){
        System.out.print("loc. " + (char)(Integer.parseInt(getLabel())+65)+" : city " );
        
    } 
    
}
