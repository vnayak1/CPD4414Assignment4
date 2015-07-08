/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment4;

/**
 *
 * @author vinayak
 */
public class Product {
    
    
   
    
    public Product(){
    
    }
     
   
    
    private int productId;

    /**
     * Get the value of productId
     *
     * @return the value of productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Set the value of productId
     *
     * @param productId new value of productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    private String description;

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }
 int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
     public Product(int productid,String name,String description,int quantity){
         this.productId=productid;
         this.name= name;
         this.description = description;
         this.quantity = quantity;
    }
}
