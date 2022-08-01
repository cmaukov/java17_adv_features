package com.hop;
/* dylan_java
 * @created 07/31/2022
 * @author Konstantin Staykov
 */

public final class Validation {
    public static void checkThat(boolean exp, String message){
        if(!exp) throw new IllegalArgumentException(message);
    }
}
