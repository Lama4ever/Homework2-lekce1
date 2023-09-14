package com.engeto.homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.time.LocalDate;

public class CarrotSeller {
    private String name;
    private LocalDate birthDate;
    private int numberOfInvoices;
    //quantity in tons
    private int soldQuantity;
    private String city;
    private String spz;
    //in liters per 100 km
    private double consumption;
    private InetAddress ip;

    public CarrotSeller(String name, LocalDate birthDate, int numberOfInvoices, int soldQuantity, String city, String spz, double consumption, InetAddress ip) {
        this.name = name;
        this.birthDate = birthDate;
        this.numberOfInvoices = numberOfInvoices;
        this.soldQuantity = soldQuantity;
        this.city = city;
        this.spz = spz;
        this.consumption = consumption;
        this.ip = ip;
    }

    public BigDecimal averageSellPerInvoice() {
        BigDecimal average = BigDecimal.valueOf(soldQuantity).divide(BigDecimal.valueOf(numberOfInvoices), RoundingMode.HALF_EVEN);
        // nebo double average = (double) soldQuantity / numberOfInvoices; pro nepresne ale desetinne cislo
        return average;
    }

    public String getName() {
        return name;
    }
}
