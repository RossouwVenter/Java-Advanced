/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7Generics;

/**
 *
 * @author rosso
 */
public class TestCacheAny {
    public static void main(String args[]){
        CacheString myMessage = new CacheString(); // Type
        CahcheShirt myShirt = new CahcheShirt();     // Type

        //Generics
        ChacheAny<String> myGenericMessage = new ChacheAny<String>(); 
        ChacheAny<Shirt> myGenericShirt = new ChacheAny<Shirt>(); 
 
        // Add data and print
        myMessage.add("Save this for me"); // Type
        myGenericMessage.add("Save this for me"); // Generic            
        System.out.println("Message is: " + myGenericMessage.get());
        
        
        myGenericShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
        System.out.println("Shirt Type:" + myGenericShirt.get().toString());
        
    }
}
