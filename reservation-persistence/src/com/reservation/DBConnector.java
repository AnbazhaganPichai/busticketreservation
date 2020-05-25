package com.reservation;

import java.sql.*;

/**
 * Created by GBS05161 on 06-03-2019.
 */
public class DBConnector {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:oracle:thin:@t5tstsede-scan.sg.gbs.pro:1521/OTH_ORABE.BSELLA.IT";
    static final String USER = "SVIL_P2P";
    static final String PASS = "55555555e.";

    public void getConnection(){
        try {
            String query="";
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
