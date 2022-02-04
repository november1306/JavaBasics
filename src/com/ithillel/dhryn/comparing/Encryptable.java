package com.ithillel.dhryn.comparing;

public interface Encryptable {
    boolean encode(String encriptionKey);

    boolean decode(String encriptionKey);
}
