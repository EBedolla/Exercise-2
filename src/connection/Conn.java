/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author eduar
 */
public class Conn {
    
    Connection conect = null;
    public Connection MakeConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejercicio-2", "root", "");
            System.out.println("connection stablished");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conect;
    }
}
