package com.zikozee.factorypattern;

import com.zikozee.factorypattern.message.Message;
import com.zikozee.factorypattern.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
