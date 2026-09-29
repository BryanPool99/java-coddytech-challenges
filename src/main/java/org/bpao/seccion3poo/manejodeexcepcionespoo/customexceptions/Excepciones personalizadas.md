# Excepciones personalizadas

Para crear una excepción personalizada, extiende una clase de excepción existente.

Para una excepción comprobada, extiende Exception:

```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
```

Para una excepción no comprobada, extiende RuntimeException:
```java
public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

La llamada super(message) pasa el mensaje de error a la clase padre, lo que hace que esté disponible mediante getMessage().

Lanza y captura excepciones personalizadas como cualquier otra excepción:
```java
public void withdraw(double amount) throws InsufficientFundsException {
    if (amount > balance) {
        throw new InsufficientFundsException("Balance too low: " + balance);
    }
    balance -= amount;
}

// Usándolo
try {
    account.withdraw(1000);
} catch (InsufficientFundsException e) {
    System.out.println(e.getMessage());
}
```

Las excepciones comprobadas obligan a quienes llaman a gestionarlas con try-catch o throws. Las excepciones no comprobadas no requieren una gestión explícita. Elige según si el error es algo que quienes llaman deberían anticipar y del que deberían recuperarse.
