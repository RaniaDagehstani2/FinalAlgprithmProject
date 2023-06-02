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
          city =" city: ";
        
            if (Integer.parseInt(getLabel())==0)
             city +=5;
            else  if (Integer.parseInt(getLabel())==1)
              city+=2;
            else  if (Integer.parseInt(getLabel())==2)
              city+=8;
            else  if (Integer.parseInt(getLabel())==3)
              city+=1;
           else  if (Integer.parseInt(getLabel())==4)
              city+=3;
             else  if (Integer.parseInt(getLabel())==5)
              city+=4;
          else  if (Integer.parseInt(getLabel())==6)
              city+=6;
            else  if (Integer.parseInt(getLabel())==7)
              city+=7;
          else  if (Integer.parseInt(getLabel())==8)
             city+=9;
           else  if (Integer.parseInt(getLabel())==9)
              city+=10;
            
            
        System.out.print("loc. " + (char)(Integer.parseInt(getLabel())+65)+city );
        
    } 
    
}
