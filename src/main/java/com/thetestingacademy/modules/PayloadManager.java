package com.thetestingacademy.modules;

import com.google.gson.Gson;
import com.thetestingacademy.pojos.Booking;
import com.thetestingacademy.pojos.BookingRespons;
import com.thetestingacademy.pojos.Bookingdates;

public class PayloadManager {
    // Converting the JAVA object to the String
    Gson gson;
    public String createPayloadBookingAsString() {

        Booking booking = new Booking();
        booking.setFirstname("James");
        booking.setLastname("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");

        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);
        gson = new Gson();
        String jsonStringpayload = gson.toJson(booking);
        System.out.println(jsonStringpayload);
        return jsonStringpayload;

    }




    // Converting the String to the JAVA Object
    public BookingRespons bookingResponseJava(String responseString) {
        gson = new Gson();
        BookingRespons bookingResponse = gson.fromJson(responseString, BookingRespons.class);
        return bookingResponse;
    }

    public void getToken(){}



}
