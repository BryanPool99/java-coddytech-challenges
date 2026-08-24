# Conceptos Básicos de Expresiones Regulares

Las expresiones regulares (regex) son patrones utilizados para buscar y validar cadenas. En Java, utiliza el método `matches()` para verificar si una cadena coincide con un patrón.


### Verifica si una cadena contiene solo dígitos:
```java
String text = "12345";
boolean isMatch = text.matches("[0-9]+");
```

### Verifica si una cadena contiene solo letras:
```java
String text = "Hello";
boolean isMatch = text.matches("[a-zA-Z]+");
```
Patrones regex comunes

- [0-9]+ - uno o más dígitos
- [a-zA-Z]+ - uno o más letras
- [0-9]{10} - exactamente 10 dígitos
- .+@.+ - contiene @ con al menos un carácter antes de é