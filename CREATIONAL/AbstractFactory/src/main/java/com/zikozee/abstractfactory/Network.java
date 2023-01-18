package com.zikozee.abstractfactory;

/**
 * @author: Ezekiel Eromosei
 * @created: 18 January 2023
 */

public interface Network {
    enum Type {
        udp, tcp
    }

    String buffer();
}
