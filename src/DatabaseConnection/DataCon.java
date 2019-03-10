/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class DataCon {
    private static Connection con;
    public static void connectionDB(String server,String user,String pass,String dbName) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        setCon(DriverManager.getConnection("jdbc:mysql://"+server+"/"+dbName,user,pass));
    }

    /**
     * @return the con
     */
    public static Connection getCon() {
        return con;
    }

    /**
     * @param aCon the con to set
     */
    public static void setCon(Connection aCon) {
        con = aCon;
    }
}
