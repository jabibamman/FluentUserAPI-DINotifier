package fr.fluentUserAPI;

import org.fluentUserAPI.service.InMemoryUserRegistry;
import org.fluentUserAPI.logger.ConsoleLogger;
import org.fluentUserAPI.logger.MyFormatter;
import org.fluentUserAPI.model.Address;
import org.fluentUserAPI.model.User;
import org.fluentUserAPI.notification.FakeNotifier;
import org.fluentUserAPI.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void test() {
        var userRegistry = new InMemoryUserRegistry();
        var userService = new UserService(userRegistry, new FakeNotifier(), new ConsoleLogger(new MyFormatter()));
        var userId = userService.register(User.of("GREGORY", "BOISSINOT", 42, Address.of(10,"Rue de la paix", "75012", "Paris")));
        var registeredUser = userRegistry.getById(userId);
        Assertions.assertEquals(User.of(userId, "GREGORY", "BOISSINOT", 42,  Address.of(10,"Rue de la paix", "75012", "Paris")),registeredUser);
    }
}

