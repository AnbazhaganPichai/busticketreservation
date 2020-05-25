package com.exception;

/**
 * Created by GBS05161 on 07-03-2019.
 */
public class ReservationException extends RuntimeException{
    public ReservationException() {
    }

    public ReservationException(String message) {
        super(message);
    }

    public ReservationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReservationException(Throwable cause) {
        super(cause);
    }

    public ReservationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
