package com.engeto.homework2;

import java.net.Inet4Address;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = (Inet4Address) Inet4Address.getByName("192.168.1.1");
        CarrotSeller seller = new CarrotSeller(
                "Prodejce jedna",
                LocalDate.of(1992, 1, 1),
                3,
                2500,
                "Praha",
                "3AS4518",
                5.3,
                ip
                );
        System.out.println("Prodejce jmenen " + seller.getName() + " prodal v prumeru " + seller.averageSellPerInvoice());
    }
}