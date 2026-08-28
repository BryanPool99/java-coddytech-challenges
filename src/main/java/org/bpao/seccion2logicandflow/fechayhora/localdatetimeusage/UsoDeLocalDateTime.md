# Uso de LocalDateTime
LocalDateTime combina tanto la fecha como la hora en Java.

Crear fecha y hora actual:
```java
LocalDateTime now = LocalDateTime.now();
```

Crear una fecha y hora específica:
```java
LocalDateTime dateTime = LocalDateTime.of(2024, 3, 15, 14, 30);
// Resulta en: 2024-03-15T14:30
```

Formatear una fecha y hora:
```java
LocalDateTime dateTime = LocalDateTime.of(2024, 3, 15, 14, 30);
String formatted = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
```