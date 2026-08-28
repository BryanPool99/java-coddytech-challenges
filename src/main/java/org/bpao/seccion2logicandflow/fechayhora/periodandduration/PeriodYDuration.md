# Period y Duration

Period representa cantidades basadas en fechas (años, meses, días), mientras que Duration representa cantidades basadas
en tiempo (horas, minutos, segundos).
Crear un Period:

```java
Period period = Period.of(1, 2, 15);
// 1 year, 2 months, 15 days
```

Crear una Duration:

```java
Duration duration = Duration.ofHours(2);
// 2 hours
Duration minutes = Duration.ofMinutes(90);
// 90 minutes
```

Period utiliza el formato ISO-8601:

```java
P1Y2M15D  // 1 year, 2 months, 15 days
```