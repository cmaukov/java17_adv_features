package com.hop;
/* dylan_java
 * @created 07/31/2022
 * @author Konstantin Staykov
 */

import static com.hop.Validation.checkThat;

public record Product(long id, String name, String description) {

    public Product {
        checkThat(name != null && !name.isBlank(), "name must not be null or blank");
    }
}