package com.zikozee.abstractfactory.aws;

import com.zikozee.abstractfactory.Network;

/**
 * @author: Ezekiel Eromosei
 * @created: 18 January 2023
 */

public class AwsNetwork implements Network {

    public AwsNetwork(Type type) {
        System.out.println("Network Type: " + type);
    }

    @Override
    public String buffer() {
        return "Buffering at 60% ...";
    }
}
