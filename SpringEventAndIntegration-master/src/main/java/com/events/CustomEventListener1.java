package com.events;

import org.springframework.context.ApplicationListener;

public class CustomEventListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event)
    {
        System.out.println(event.getSource()+" dusra listener");
    }
}
