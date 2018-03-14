package com.ATMApplication;

import com.events.CustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by ankur on 16/7/17.
 */
public class AlertForGeneratingSMS implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;

    int acceptPIN(int pin) {
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        return pin;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public String toString(){
        return "Generating SMS";
    }
}
