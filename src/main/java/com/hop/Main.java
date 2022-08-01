package com.hop;
/* dylan_java
 * @created 07/31/2022
 * @author Konstantin Staykov
 */

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        var order = Order.builder()
                .withId(123L)
                .forCustomer(new Customer(1L, "Bob Jones", "bob@bob.com"))
                .atDateTime(LocalDateTime.now())
                .addLine(new OrderLine(new Product(232L, "Java Records", "Java records book"), 1, BigDecimal.valueOf(5.55)))
                .build();

        System.out.println(order);
    }
}
