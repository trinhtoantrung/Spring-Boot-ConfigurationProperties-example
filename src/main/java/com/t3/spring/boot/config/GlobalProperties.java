package com.t3.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Creation of configuration-properties-example.
 * <p/>
 * Created by tttrinh
 * Created date 4/13/17 2:04 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Component
@ConfigurationProperties()
public class GlobalProperties {
  private String email;
  private int threadPool;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getThreadPool() {
    return threadPool;
  }

  public void setThreadPool(Integer threadPool) {
    this.threadPool = threadPool;
  }

  @Override
  public String toString() {
    return "GlobalProperties{" +
        "email='" + email + '\'' +
        ", threadPool=" + threadPool +
        '}';
  }
}
