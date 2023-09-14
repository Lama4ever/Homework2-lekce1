package com.engeto.homework2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarrotSeller seller = new CarrotSeller("Prodejce jedna", LocalDate.of(1992, 1, 1), 3, 2500, "Praha", "3AS4518", BigDecimal.valueOf(5.3), "192.168.1.1");
        System.out.println("Prodejce jmenen " + seller.getName() + " prodal v prumeru " + seller.averageSellPerInvoice());
    }
}