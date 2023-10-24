package org.fluentUserAPI.logger;

@FunctionalInterface
interface Logger {
  void log(String message);
}