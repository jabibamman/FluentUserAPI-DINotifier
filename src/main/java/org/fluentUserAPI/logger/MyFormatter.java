package org.fluentUserAPI.logger;

import java.util.Date;

public class MyFormatter implements Formatter {
  @Override
  public String format(String message) {
    return "\u001B[34m[LOG] " + new Date() + " - " + message + "\u001B[0m";
  }

}
