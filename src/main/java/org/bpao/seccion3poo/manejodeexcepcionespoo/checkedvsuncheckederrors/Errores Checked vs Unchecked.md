# Errores Checked vs Unchecked
Las excepciones de Java se dividen en excepciones comprobadas y no comprobadas, lo que determina cómo el compilador impone su gestión.

Las excepciones comprobadas extienden directamente Exception (no a través de RuntimeException). El compilador te obliga a capturarlas o declararlas con throws:

```java
// Debe declararse con throws
public void readFile(String path) throws IOException {
    FileReader reader = new FileReader(path);
}

// O capturarlo
public void readFileSafe(String path) {
    try {
        FileReader reader = new FileReader(path);
    } catch (IOException e) {
        System.out.println("File error: " + e.getMessage());
    }
}
```

Las excepciones no comprobadas extienden RuntimeException. El compilador no exige que las gestiones. Normalmente indican errores de programación:
```java
// No se necesita declaración throws
public int divide(int a, int b) {
    return a / b;  // Puede lanzar ArithmeticException (no comprobada)
}

String name = null;
name.length();  // NullPointerException (no comprobada)
```

Al crear excepciones personalizadas, elige la clase principal según cómo deban gestionarlas los llamadores:

- Usa excepciones comprobadas (extienden Exception) para condiciones recuperables que el llamador debería anticipar
- Usa excepciones no comprobadas (extienden RuntimeException) para errores de programación que no deberían producirse en código correcto