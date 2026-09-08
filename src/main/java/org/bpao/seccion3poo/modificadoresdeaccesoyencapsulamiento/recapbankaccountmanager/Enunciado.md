# Desafío Fácil - Resumen - Gestor de cuentas bancarias

Vamos a construir un sistema de BankAccount completo que reúna todo lo que has aprendido sobre encapsulación, modificadores de acceso, getters, setters y la palabra clave final.

Crearás dos archivos para organizar tu código:

Vamos a construir un sistema de BankAccount completo que reúna todo lo que has aprendido sobre encapsulación, modificadores de acceso, getters, setters y la palabra clave final.

Crearás dos archivos para organizar tu código:

- BankAccount.java: Diseña una clase de cuenta bancaria segura que proteja los datos financieros sensibles:
  - Un número de cuenta inmutable que nunca puede cambiar una vez creada la cuenta
  - Un saldo privado que comienza en 0.0 y solo puede modificarse a través de métodos controlados
  - Un nombre de propietario privado que se puede recuperar pero no cambiar directamente
  - Un constructor que recibe el número de cuenta y el nombre del propietario
  - Un getter para el número de cuenta
  - Un getter para el nombre del propietario
  - Un getter para el saldo
  - Un método deposit(double amount) que añade al saldo solo si el monto es positivo, devolviendo true en caso de éxito o false si es rechazado
  - Un método withdraw(double amount) que resta del saldo solo si el monto es positivo Y existen fondos suficientes, devolviendo true en caso de éxito o false si es rechazado
  - Un método getAccountSummary() que devuelve: "Account [accountNumber] | Owner: [ownerName] | Balance: $[balance]" (saldo formateado a 2 decimales)
- Main.java: Crea un BankAccount y realiza una serie de transacciones. Recibirás cinco entradas: número de cuenta, nombre del propietario, monto de depósito, primer monto de retiro y segundo monto de retiro. Imprime cuatro líneas:
  - El resultado del depósito: "Deposit: true" o "Deposit: false"
  - El resultado del primer retiro: "Withdraw 1: true" o "Withdraw 1: false"
  - El resultado del segundo retiro: "Withdraw 2: true" o "Withdraw 2: false"
  - El resumen final de la cuenta

Recibirás cinco entradas en orden: accountNumber (String), ownerName (String), depositAmount (double), withdrawAmount1 (double), withdrawAmount2 (double).

Para formatear el saldo a 2 decimales, puedes usar String.format("%.2f", balance).