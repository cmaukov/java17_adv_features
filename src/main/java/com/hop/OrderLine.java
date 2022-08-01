package com.hop;
/* dylan_java
 * @created 07/31/2022
 * @author Konstantin Staykov
 */

import java.math.BigDecimal;

import static com.hop.Validation.checkThat;

public record OrderLine(Product product, int quantity, BigDecimal price) {

    public OrderLine {
        checkThat(product != null, "product must not be null");
        checkThat(price != null, "price must not be null");
    }

    public OrderLine withQuantity(int newQuantity) {
        return new OrderLine(this.product, newQuantity, this.price);
    }

    public OrderLine withPrice(BigDecimal newPrice) {
        return new OrderLine(this.product, this.quantity, newPrice);
    }
}