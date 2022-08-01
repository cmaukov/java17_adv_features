package com.hop;
/* dylan_java
 * @created 07/31/2022
 * @author Konstantin Staykov
 */
import static com.hop.Validation.checkThat;
import java.math.BigDecimal;

public record OrderLine(Product product, int quantity, BigDecimal price) {

    public OrderLine {
        checkThat(product != null, "product must not be null");
        checkThat(price != null, "price must not be null");
    }
}