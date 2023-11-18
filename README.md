# FluentUserAPI-DINotifier


## Comment Utiliser

### Partie 1 : Fluent API

Pour créer un nouvel objet `User`, utilisez le `UserBuilder` :

```java
User user = new UserBuilder()
                .setNom("Doe")
                .setPrenom("John")
                .setAge(30)
                .setAdresse(new Address("42", "Rue de l'Exemple", "Paris"))
                .build();
```

Pour créer un npuvel objet `Adresse`, utilisez le `AddressBuilder` :

```java
Address address = new AddressBuilder.create()
                      .streetNumber(1)
                      .streetName("Rue de la paix")
                      .postalCode("75000")
                      .city("Paris")
                      .build();
```

## Partie 2 : Système de Notification

Pour envoyer une notification, utilisez une classe qui implémente NotifierInterface. Par exemple 

```java
NotifierInterface notifier = new EmailNotifier();
notifier.sendNotification(user);
```

## Partie 3 : Système de Logger

Pour logger dans la console ou bien dans un fichier il faut faire : 

```java
LoggerInterface consoleLogger = new ConsoleLogger(new MyFormatter());
LoggerInterface fileLogger = new FileLogger(new MyFormatter());
```

## Partie 4 : Système de Stockage

Si vous souhaitez utiliser le système de stockage en mémoire :

```java
    var userRegistry = new InMemoryUserRegistry();
```

## Partie 5 : Les tests

Pour run les tests il faut faire avec maven : 

```sh
mvn test
```

## Contribuer

Les Pull Requests sont les bienvenues. Pour les changements majeurs, veuillez ouvrir une issue pour en discuter.