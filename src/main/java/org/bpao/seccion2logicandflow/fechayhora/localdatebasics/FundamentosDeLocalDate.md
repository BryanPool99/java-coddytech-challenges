# Fundamentos de LocalDate
LocalDate representa una fecha sin hora ni zona horaria en Java.

Crear la fecha de hoy:
```java
LocalDate today = LocalDate.now();
```

Crear una fecha específica:
```java
LocalDate date = LocalDate.of(2024, 3, 15);
```
Obtener diferentes partes de una fecha:
```java
LocalDate date = LocalDate.of(2024, 3, 15);
int year = date.getYear();      // 2024
int month = date.getMonthValue(); // 3
int day = date.getDayOfMonth();   // 15
String dayOfWeek = date.getDayOfWeek().toString();  // "FRIDAY"
```
Convertir una fecha desde un String:
```java
LocalDate date = LocalDate.parse("2024-03-15");  // Formato: "yyyy-MM-dd"
```
Sumar o restar días:
```java
LocalDate date = LocalDate.of(2024, 3, 15);
LocalDate future = date.plusDays(10);    // 2024-03-25
LocalDate past = date.minusDays(5);      // 2024-03-10
```