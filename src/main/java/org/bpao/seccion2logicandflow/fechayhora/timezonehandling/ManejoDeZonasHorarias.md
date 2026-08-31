# Manejo de zonas horarias
ZonedDateTime representa una fecha y hora con una zona horaria, útil para trabajar con diferentes zonas horarias.

Crea una hora en una zona específica:
```java
ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
```

Convierte un LocalDateTime a un ZonedDateTime usando .atZone():
```java
LocalDateTime local = LocalDateTime.now();
ZonedDateTime zoned = local.atZone(ZoneId.of("Asia/Tokyo"));
```

Convierte la hora entre zonas:
```java
ZonedDateTime newYork = tokyo.withZoneSameInstant(ZoneId.of("America/New_York"));
```

Formatea un ZonedDateTime incluyendo el desplazamiento UTC usando los patrones Z o xxx:
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm xxx");
String formatted = zoned.format(formatter);
// Ejemplo: 2024-03-15 10:30 +09:00
```