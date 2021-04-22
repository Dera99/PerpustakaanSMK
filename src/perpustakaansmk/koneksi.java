/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaansmk;
import java.sql.Connection;
import javax.swing.*;
import java.sql.DriverManager;
/**
 *
 * @author Administrator
 */
public class koneksi {
    Connection conn = null;
    public static Connection getConnection(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","1234");
//           JOptionPane.showMessageDialog(null, "Connection Succeed");
           return conn;
       }catch(Exception e){
//           JOptionPane.showMessageDialog(null, "Connection Failed");
           return null;
       }
    }
}
