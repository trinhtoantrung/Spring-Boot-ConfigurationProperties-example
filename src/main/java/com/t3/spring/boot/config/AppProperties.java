package com.t3.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Creation of configuration-properties-example.
 * <p/>
 * Created by tttrinh
 * Created date 4/13/17 2:03 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
  private String error;
  private List<Menu> menus = new ArrayList<>();
  private Compiler compiler = new Compiler();

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public List<Menu> getMenus() {
    return menus;
  }

  public void setMenus(List<Menu> menus) {
    this.menus = menus;
  }

  public Compiler getCompiler() {
    return compiler;
  }

  public void setCompiler(Compiler compiler) {
    this.compiler = compiler;
  }

  public static class Menu {
    private String name;
    private String title;
    private String path;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getPath() {
      return path;
    }

    public void setPath(String path) {
      this.path = path;
    }

    @Override
    public String toString() {
      return "Menu{" +
          "name='" + name + '\'' +
          ", title='" + title + '\'' +
          ", path='" + path + '\'' +
          '}';
    }
  }

  public static class Compiler {
    private String timeout;
    private String outputFolder;

    public String getTimeout() {
      return timeout;
    }

    public void setTimeout(String timeout) {
      this.timeout = timeout;
    }

    public String getOutputFolder() {
      return outputFolder;
    }

    public void setOutputFolder(String outputFolder) {
      this.outputFolder = outputFolder;
    }

    @Override
    public String toString() {
      return "Compiler{" +
          "timeout='" + timeout + '\'' +
          ", outputFolder='" + outputFolder + '\'' +
          '}';
    }
  }

  @Override
  public String toString() {
    return "AppProperties{" +
        "error='" + error + '\'' +
        ", menus=" + menus +
        ", compiler=" + compiler +
        '}';
  }
}
