package fr.fluentUserAPI;

import org.fluentUserAPI.builder.UserBuilder;
import org.fluentUserAPI.logger.ConsoleLogger;
import org.fluentUserAPI.logger.MyFormatter;
import org.fluentUserAPI.model.Address;
import org.fluentUserAPI.model.User;
import org.fluentUserAPI.notification.FakeNotifier;
import org.fluentUserAPI.service.UserService;
import org.fluentUserAPI.storage.InMemoryUserRegistry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
  private UserService userService;
  private InMemoryUserRegistry userRegistry;

  @BeforeEach
  void setUp() {
    userRegistry = new InMemoryUserRegistry();
    userService = new UserService(userRegistry, new FakeNotifier(),
                                  new ConsoleLogger(new MyFormatter()));
  }

  @Test
  void user_should_be_registered() {
    var userId = userService.register(
        User.of("GREGORY", "BOISSINOT", 42,
                Address.of(10, "Rue de la paix", "75012", "Paris")));
    var registeredUser = userRegistry.getById(userId);
    Assertions.assertEquals(
        User.of(userId, "GREGORY", "BOISSINOT", 42,
                Address.of(10, "Rue de la paix", "75012", "Paris")),
        registeredUser);
  }

  @Test
  void user_without_firstname_should_not_be_registered() {
    Assertions.assertThrows(
        NullPointerException.class,
        ()
            -> userService.register(
                UserBuilder.create()
                    .firstname(null)
                    .lastname("Boissinot")
                    .age(42)
                    .address(Address.of(10, "Rue de la paix", "75012", "Paris"))
                    .build()));
  }

  @Test
  void user_with_empty_firstname_should_not_be_registered() {
    Assertions.assertThrows(
        IllegalArgumentException.class,
        ()
            -> userService.register(
                UserBuilder.create()
                    .firstname("")
                    .lastname("Boissinot")
                    .age(42)
                    .address(Address.of(10, "Rue de la paix", "75012", "Paris"))
                    .build()));
  }

  @Test
  void user_without_lastname_should_not_be_registered() {
    Assertions.assertThrows(
        NullPointerException.class,
        ()
            -> userService.register(
                UserBuilder.create()
                    .firstname("Gregory")
                    .lastname(null)
                    .age(42)
                    .address(Address.of(10, "Rue de la paix", "75012", "Paris"))
                    .build()));
  }

  @Test
  void user_with_empty_lastname_should_not_be_registered() {
    Assertions.assertThrows(
        IllegalArgumentException.class,
        ()
            -> userService.register(
                UserBuilder.create()
                    .firstname("Gregory")
                    .lastname("")
                    .age(42)
                    .address(Address.of(10, "Rue de la paix", "75012", "Paris"))
                    .build()));
  }

  @Test
  void user_with_negative_age_should_not_be_registered() {
    Assertions.assertThrows(
        IllegalArgumentException.class,
        ()
            -> userService.register(
                UserBuilder.create()
                    .firstname("Gregory")
                    .lastname("Boissinot")
                    .age(-1)
                    .address(Address.of(10, "Rue de la paix", "75012", "Paris"))
                    .build()));
  }

  @Test
  void user_without_address_should_not_be_registered() {
    Assertions.assertThrows(
        NullPointerException.class,
        ()
            -> userService.register(UserBuilder.create()
                                        .firstname("Gregory")
                                        .lastname("Boissinot")
                                        .age(42)
                                        .address(null)
                                        .build()));
  }
}
