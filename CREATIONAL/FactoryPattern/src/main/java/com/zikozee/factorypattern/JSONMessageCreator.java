package com.zikozee.factorypattern;

import com.zikozee.factorypattern.message.JSONMessage;
import com.zikozee.factorypattern.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
