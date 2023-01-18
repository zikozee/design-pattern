package com.zikozee.abstractfactory.gcp;

import com.zikozee.abstractfactory.Network;

/**
 * @author: Ezekiel Eromosei
 * @created: 18 January 2023
 */

public class GoogleNetwork implements Network {

    public GoogleNetwork(Type type) {
        System.out.println("Network Type: " + type);
    }

    @Override
    public String buffer() {
        return "Buffering at 20% ...";
    }
}
