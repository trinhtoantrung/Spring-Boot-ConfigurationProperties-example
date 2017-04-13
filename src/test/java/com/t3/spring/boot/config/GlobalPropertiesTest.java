package com.t3.spring.boot.config;

import com.t3.spring.boot.ConfigurationPropertiesExampleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Creation of configuration-properties-example.
 * <p/>
 * Created by tttrinh
 * Created date 4/13/17 3:10 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConfigurationPropertiesExampleApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GlobalPropertiesTest {

  @Autowired
  private GlobalProperties globalProperties;

  @Test
  public void testGetGlobalProperties() throws Exception {
    System.out.println(globalProperties.toString());

    assertEquals(globalProperties.getEmail(), "test@mkyong.com");
    assertEquals(globalProperties.getThreadPool(), 10);
  }
}