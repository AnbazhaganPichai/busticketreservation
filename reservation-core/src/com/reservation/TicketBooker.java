package com.reservation;

import com.reservation.core.ITicketBooker;

import java.net.SocketPermission;
import java.sql.*;
import java.util.Calendar;

/**
 * Created by GBS05161 on 06-03-2019.
 */
public class TicketBooker implements ITicketBooker {
    private static final int MIN_CAPACITY = 0;
    private static final int MAX_CAPACITY = 50;
    static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@t5tstsede-scan.sg.gbs.pro:1521/OTH_ORABE.BSELLA.IT";
    static final String USER = "SVIL_P2P";
    static final String PASS = "55555555e.";


    @Override
    public void bookTicket(PassengerDetails passenger) {
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement statement = connection.prepareStatement("insert into PASSENGER_TABLE VALUES (?,?,?,?,?,?,?.?)");
            statement.setInt(1, Integer.valueOf(passenger.getTicketId()) );
            statement.setString(2, passenger.getPassengerName());
            statement.setString(3, passenger.getTravelFrom());
            statement.setString(4, passenger.getTravelTo());
            statement.setDate(5, Date.valueOf(passenger.getTravelDate()));
            statement.setDate(6, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
            statement.setInt(7, passenger.getTicketCount());
            statement.setInt(8, Integer.parseInt(passenger.getTicketId()));
            statement.executeQuery();
            System.out.println("inserted successfully");
        }catch (SQLException e){
            e.getStackTrace();
        }catch (Exception e){
            e.getStackTrace();
        }


    }

    @Override
    public void cancelTicket(String ticketId) {

    }

    @Override
    public void viewTicket(String ticketId) {

    }

    @Override
    public void viewBusList(String from, String to, String DateOfTravel) {
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM BUS_TABLE WHERE FROM=?, TO=?, TRAVEL_DATE=?");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
