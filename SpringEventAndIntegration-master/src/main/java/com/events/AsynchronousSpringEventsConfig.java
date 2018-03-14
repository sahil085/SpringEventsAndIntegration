package com.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

//acutally i have tried many times to create my own project, but at the end i h
// ave worked on the sample given by the presenters & forgot to remove the name

@Configuration
public class AsynchronousSpringEventsConfig {
  @Bean(name = "applicationEventMulticaster")
  public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
    SimpleApplicationEventMulticaster eventMulticaster
        = new SimpleApplicationEventMulticaster();
    System.out.println("Employee salary is greater than 30000 ");
    eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
    return eventMulticaster;
  }
}
