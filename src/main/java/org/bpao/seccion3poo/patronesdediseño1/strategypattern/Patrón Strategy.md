# Patrón Strategy
El patrón Strategy es un patrón de diseño de comportamiento que define una familia de algoritmos, encapsula cada uno en su propia clase y los hace intercambiables. Permite cambiar de algoritmo en tiempo de ejecución sin modificar el código que los utiliza.

### Componentes principales

Interfaz de estrategia: Define la interfaz común para todas las estrategias concretas.
```java
interface PaymentStrategy {
    void pay(int amount);
}
```

Estrategias concretas: Implementan la interfaz de estrategia con algoritmos específicos.
```java
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}
```

Clase de contexto: Mantiene una referencia a una estrategia y delega el trabajo en ella. El contexto solo conoce la interfaz, no la implementación concreta.
```java
class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
```
### Uso
Las estrategias se pueden cambiar dinámicamente en tiempo de ejecución:
```java
ShoppingCart cart = new ShoppingCart();

cart.setPaymentStrategy(new CreditCardPayment());
cart.checkout(100);  // Pagado 100 vía Credit Card

cart.setPaymentStrategy(new PayPalPayment());
cart.checkout(50);   // Pagado 50 vía PayPal
```

### Ventajas
El patrón Strategy es ideal cuando tienes varias formas de realizar una acción y quieres cambiar fácilmente entre ellas. Añadir una nueva estrategia simplemente significa crear una nueva clase que implemente la interfaz de estrategia: no se requieren cambios en el código existente.
