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
public class TestCacheObject {
    public static void main(String args[]){
        CacheString myMessage = new CacheString(); // Type specific
        CahcheShirt myShirt = new CahcheShirt();     // Type specific

        myMessage.add("Save this for me");
        
        // Print Message
        System.out.println("Message is: " + myMessage.get());
        
        
        myShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
        System.out.println("Shirt Type:" + myShirt.get().toString());
        
    }
}
