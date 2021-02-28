/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;
import java.sql.*;
/**
 *
 * @author HarshitMaurya
 */
public class TicTacToeClass {
    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
   public  ResultSet rst;
    
   
   public TicTacToeClass()
   {
       try
       {
                  Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tictactoe","root","root");
               
           
       }
       catch(ClassNotFoundException | SQLException e)
       {
       }
       }
   }

    
    

   


