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

## Partie 2 : Système de Notification

Pour envoyer une notification, utilisez une classe qui implémente NotifierInterface. Par exemple 

```java
NotifierInterface notifier = new EmailNotifier();
notifier.sendNotification(user);
```

## Contribuer

Les Pull Requests sont les bienvenues. Pour les changements majeurs, veuillez ouvrir une issue pour en discuter.