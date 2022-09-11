package com.company.openclose;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

    // open for modification
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(this.getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration * baseRate /(double) 100;
    }
}