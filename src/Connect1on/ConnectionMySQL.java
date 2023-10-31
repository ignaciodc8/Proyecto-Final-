/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect1on;

import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinal.ProyectoFinal; 

/**
 *
 * @author nac
 */
public class ConnectionMySQL {
    String usuario = "root";
       String pass = "1234";
       String url = "jdbc:mysql://localhost:3306/proyectofinal";
       
       Connection cn;
       Statement stmt;
       PreparedStatement ps;
       ResultSet rs;
       
       String query;
       public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            cn = DriverManager.getConnection(url, usuario, pass);
            stmt = cn.createStatement();
            //stmt.executeUpdate("INSERT INTO usuarios VALUES(null, 'Hola', 'Asdasd', '32453432') ");
        } catch (SQLException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return cn;
       }
}

