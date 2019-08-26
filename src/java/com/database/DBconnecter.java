/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;
import java.sql.*;
/**
 *
 * @author Ravindi
 */
public class DBconnecter {
Connection con = null;
    public DBconnecter() {  
}
    public Connection getconnection(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/school_db","root","");   
        }catch(Exception e){ 
            System.out.println(e);
        }
        
        if(con !=null){
            System.out.println("connect");
        }
        return con;
    }
    }
 

