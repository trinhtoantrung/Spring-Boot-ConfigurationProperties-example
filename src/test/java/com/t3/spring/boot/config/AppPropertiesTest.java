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
 * Created date 4/13/17 2:53 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConfigurationPropertiesExampleApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppPropertiesTest {

  @Autowired
  private AppProperties appProperties;

  @Test
  public void testGetAppProperties() throws Exception {
    System.out.println(appProperties.toString());

    assertEquals(appProperties.getMenus().get(0).getTitle(), "Home");
    assertEquals(appProperties.getMenus().get(0).getName(), "Home");
    assertEquals(appProperties.getMenus().get(0).getPath(), "/");
    assertEquals(appProperties.getMenus().get(1).getTitle(), "Login");
    assertEquals(appProperties.getMenus().get(1).getName(), "Login");
    assertEquals(appProperties.getMenus().get(1).getPath(), "/login");
    assertEquals(appProperties.getCompiler().getTimeout(), "5");
    assertEquals(appProperties.getCompiler().getOutputFolder(),"/temp/");
    assertEquals(appProperties.getError(),"/error/");
  }
}