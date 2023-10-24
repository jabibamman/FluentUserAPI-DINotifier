package org.fluentUserAPI;

import org.fluentUserAPI.builder.AddressBuilder;
import org.fluentUserAPI.builder.UserBuilder;
import org.fluentUserAPI.logger.ConsoleLogger;
import org.fluentUserAPI.logger.MyFormatter;
import org.fluentUserAPI.notification.EmailNotifier;
import org.fluentUserAPI.service.UserService;

public class Main {
  public static void main(String[] args) {
    var userRegistry = new InMemoryUserRegistry();
    var userService = new UserService(userRegistry, new EmailNotifier(),
                                      new ConsoleLogger(new MyFormatter()));
    var address = new AddressBuilder()
                      .streetName("Rue de la paix")
                      .streetNumber(1)
                      .city("Paris")
                      .postalCode("75000")
                      .build();

    var user = new UserBuilder()
                   .firstname("John")
                   .lastname("Doe")
                   .age(42)
                   .address(address)
                   .build();

    userService.register(user);
  }
}
