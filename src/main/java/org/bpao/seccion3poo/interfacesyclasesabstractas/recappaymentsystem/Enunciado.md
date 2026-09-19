# DESAFIO Resumen - Sistema de Pagos
Construyamos un sistema completo de procesamiento de pagos que reúna todo lo que has aprendido sobre las interfaces en este capítulo. Crearás un sistema flexible en el que se puedan procesar de manera uniforme distintos métodos de pago a través de una interfaz común.

Organizarás tu código en cinco archivos:

- Payable.java: Define la interfaz principal que todos los métodos de pago deben implementar. Debe declarar un único método pay(double amount) que devuelva un String describiendo la acción de pago.
- CreditCard.java: Crea una clase que implemente Payable y represente pagos con tarjeta de crédito. Un CreditCard tiene un campo cardNumber (String) que almacena los últimos 4 dígitos. Incluye un constructor para inicializarlo. El método pay debe devolver: Paid [amount] using Credit Card ending in [cardNumber]
- PayPal.java: Crea otra clase que implemente Payable para pagos con PayPal. Una cuenta de PayPal tiene un campo email (String). Incluye un constructor para inicializarlo. El método pay debe devolver: Paid [amount] via PayPal account [email]
- PaymentProcessor.java: Crea una clase procesadora que pueda manejar cualquier objeto Payable. Debe tener un método processPayment(Payable paymentMethod, double amount) que llame al método pay del método de pago y devuelva el resultado. Esto demuestra cómo las interfaces permiten un comportamiento polimórfico: ¡el procesador no necesita conocer el tipo de pago específico!
- Main.java: Reúne todo. Recibirás tres entradas: un número de tarjeta (los últimos 4 dígitos), una dirección de correo electrónico y un importe de pago. Crea un PaymentProcessor y, después, úsalo para procesar pagos con una CreditCard y una cuenta de PayPal por el importe indicado. Imprime cada resultado en una línea separada.

Recibirás tres entradas: los últimos 4 dígitos del número de tarjeta (String), el correo electrónico de PayPal (String) y el importe del pago (double).

Da formato a los importes con dos decimales en la salida. ¡Observa cómo el mismo PaymentProcessor gestiona tipos de pago completamente diferentes gracias al poder de las interfaces!