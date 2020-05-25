package com.reservation.core;

import com.reservation.PassengerDetails;

/**
 * Created by GBS05161 on 06-03-2019.
 */

public interface ITicketBooker {
    void bookTicket(PassengerDetails passenger);
    void cancelTicket(String ticketId);
    void viewTicket(String ticketId);
    void viewBusList(String from, String to, String DateOfTravel);

}
