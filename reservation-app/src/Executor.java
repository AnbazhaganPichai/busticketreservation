import com.reservation.PassengerDetails;
import com.reservation.TicketBooker;
import com.reservation.core.ITicketBooker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by GBS05161 on 07-03-2019.
 */

public class Executor {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        ITicketBooker booker = new TicketBooker();
        PassengerDetails passenger = new PassengerDetails();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@t5tstsede-scan.sg.gbs.pro:1521/OTH_ORABE.BSELLA.IT", "SVIL_P2P", "55555555e.");
            PreparedStatement statement = connection.prepareStatement("insert into TICKET_TABLE values(101, 101, 101, '12/03/2019')");
            statement.executeQuery();
            System.out.println("value inserted");

        }catch (SQLException e){
            e.getStackTrace();

        }catch (Exception e){
            e.getStackTrace();
        }
       // booker.bookTicket(setPassenger(passenger));
    }
    private static PassengerDetails setPassenger(PassengerDetails passenger){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Passenger Id :");
        passenger.setPassengerId(scanner.next());
        System.out.println("Enter Passenger name :");
        passenger.setPassengerName(scanner.next());
        System.out.println("Enter Travel From :");
        passenger.setTravelFrom(scanner.next());
        System.out.println("Enter Travelling To");
        passenger.setTravelTo(scanner.next());
        System.out.println("Enter Travel Date :");
        passenger.setTravelDate(scanner.next());
        System.out.println("enter how many tickets u want to book");
        passenger.setTicketCount(scanner.nextInt());
        return passenger;
    }
}
