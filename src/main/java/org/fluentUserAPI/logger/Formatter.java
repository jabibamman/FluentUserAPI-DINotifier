package org.fluentUserAPI.logger;

@FunctionalInterface
interface Formatter {
  String format(String message);
}
