# Sistema bancario
Un Sistema Bancario demuestra los principios de OOP mediante la gestión de cuentas, las transacciones y el manejo de excepciones.

### Interfaces para contratos

Define operaciones comunes mediante interfaces:
```java
public interface Transactable {
    boolean deposit(double amount);
    boolean withdraw(double amount);
}
```

### Excepciones personalizadas
Crea excepciones personalizadas para errores específicos del dominio:
```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double attempted, double available) {
        super("Insufficient funds: attempted " + attempted + ", available " + available);
    }
}
```

### Clases base abstractas
Usa clases abstractas para definir una estructura común con métodos abstractos para el comportamiento específico de las subclases:
```java
public abstract class Account {
    private String accountNumber;
    private double balance;
    
    public abstract String getAccountType();
    
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
```

### Herencia y polimorfismo
Las subclases extienden las clases base e implementan interfaces:
```java
public class SavingsAccount extends Account implements Transactable {
    private double interestRate;
    
    @Override
    public String getAccountType() {
        return "Savings";
    }
    
    public void applyInterest() {
        setBalance(getBalance() * (1 + interestRate));
    }
}
```

### Composición
Las clases pueden gestionar colecciones de otros objetos:
```java
public class Bank {
    private ArrayList<Account> accounts;
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public Account findAccount(String accountNumber) {
        // Busca y devuelve la cuenta o null
    }
}
```

### Encapsulación
Protege los datos sensibles con campos privados y acceso controlado mediante getters/setters. Usa modificadores protected para permitir el acceso de las subclases mientras mantienes la encapsulación.

### Manejo de excepciones en transacciones
Lanza excepciones personalizadas para operaciones no válidas:
```java
public String transfer(String from, String to, double amount) throws InsufficientFundsException {
    if (!fromAccount.withdraw(amount)) {
        throw new InsufficientFundsException(amount, fromAccount.getBalance());
    }
    toAccount.deposit(amount);
    return "Transferred $" + amount;
}
```
