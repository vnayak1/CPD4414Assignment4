/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment4;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import DatabaseCredentials.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * REST Web Service
 *
 * @author vinayak
 */
@Path("product")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    Connection conn;
    
    Product p = new Product();
    ArrayList<Product> products= new ArrayList<>();
    
    public GenericResource() {
             
    }

    /**
     * Retrieves representation of an instance of com.assignment4.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/products")
    @Produces("application/json")
    public ArrayList<Product> getJson() throws SQLException {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();

         conn = database.getConnection();
         String query ="select * from product";
         
         Statement  st = conn.createStatement();
         ResultSet  rs = st.executeQuery(query);
         
         while(rs.next()){
         
          Product  pnew = new Product(rs.getInt("ProductID"),rs.getString("name"),rs.getString("description"), rs.getInt("quantity"));
          products.add(pnew);        
                   
         }
//         
//        if (conn == null)
//        {
//        return "connection is not created";
//        }
//        else{
//        
//        return "connection is created";}
        
        return products;
    }
            
    
      @GET
      @Path("/products/{productid}")
      @Produces("application/json")
        public ArrayList<Product> getJsonOne(@PathParam("productid") int productid) throws SQLException {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
    
         conn = database.getConnection();
         String query ="";
         
         Statement  st = conn.createStatement();
         ResultSet  rs = st.executeQuery("select * from product where ProductID="+productid);
         
         while(rs.next()){
         
          Product  pnew = new Product(rs.getInt("ProductID"),rs.getString("name"),rs.getString("description"), rs.getInt("quantity"));
          products.add(pnew);        
                   
         }
//         
//        if (conn == null)
//        {
//        return "connection is not created";
//        }
//        else{
//        
//        return "connection is created";}
        
        return products;
    }
    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
