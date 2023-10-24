package org.fluentUserAPI.notification;

public class FakeNotifier implements NotifierInterface {
  @Override
  public void notify(String message) {
    System.out.println("Sending fake notification: " + message);
  }
}
