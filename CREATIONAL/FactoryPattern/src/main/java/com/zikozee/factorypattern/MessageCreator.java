package com.zikozee.factorypattern;

import com.zikozee.factorypattern.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory Message
    public abstract Message createMessage();
}
