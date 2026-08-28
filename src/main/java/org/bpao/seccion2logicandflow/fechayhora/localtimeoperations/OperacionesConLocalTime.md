# Operaciones con LocalTime

LocalTime representa una hora sin fecha ni zona horaria en Java.

Crear hora actual:
```java
LocalTime now = LocalTime.now();
```
Crear una hora específica:
```java
LocalTime time = LocalTime.of(14, 30);  // 14:30 (2:30 PM)
```

Añadir o restar tiempo:
```java
LocalTime time = LocalTime.of(14, 30);
LocalTime later = time.plusMinutes(45);  // 15:15
LocalTime earlier = time.minusHours(1);  // 13:30
```