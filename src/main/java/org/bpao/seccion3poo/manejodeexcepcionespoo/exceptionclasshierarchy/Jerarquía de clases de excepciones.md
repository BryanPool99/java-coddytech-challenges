# Jerarquía de clases de excepciones
El manejo de excepciones de Java se basa en una jerarquía de clases cuyo origen es Throwable:
```java
Throwable
├── Error          // Problemas serios (no capturar)
└── Exception      // Problemas recuperables
    └── RuntimeException  // Excepciones no comprobadas
```

Error representa problemas graves de la JVM, como OutOfMemoryError o StackOverflowError, que las aplicaciones no deberían manejar.

Exception se divide en excepciones comprobadas (subclases directas) y excepciones no comprobadas (subclases de RuntimeException):

```java
Exception
├── IOException           // Problemas de archivo/red
├── SQLException          // Problemas de base de datos
└── RuntimeException
    ├── NullPointerException
    ├── ArrayIndexOutOfBoundsException
    └── IllegalArgumentException
```

Capturar un tipo de excepción padre también captura todos sus tipos hijos:

```java
try {
    // algo de código
} catch (Exception e) {
    // Captura TODAS las excepciones
}

try {
    // algo de código
} catch (RuntimeException e) {
    // Captura solo excepciones de tiempo de ejecución y subclases
}
```

Usa e.getClass().getSimpleName() para obtener el nombre de la clase de la excepción y e.getMessage() para recuperar su mensaje.
