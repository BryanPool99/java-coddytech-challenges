# Formato de fechas
DateTimeFormatter te permite dar formato a fechas y horas con patrones específicos:
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
```

Da formato a una fecha usando el formatter:
```java
LocalDate date = LocalDate.of(2024, 3, 15);
String formatted = date.format(formatter);
```
Analiza una cadena para convertirla en una fecha:
```java
String dateStr = "2024-03-15";
LocalDate date = LocalDate.parse(dateStr, formatter);
```
