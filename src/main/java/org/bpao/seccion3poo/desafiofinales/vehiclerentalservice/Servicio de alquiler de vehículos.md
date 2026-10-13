# Servicio de alquiler de vehículos

Este desafío final combina múltiples conceptos de OOP en un sistema completo. Aquí están los patrones y técnicas clave:

### Enums con Campos
Los enums pueden tener campos, constructores y métodos:
```java
public enum RentalStatus {
    AVAILABLE("ready to rent"),
    RENTED("currently in use");

    private String description;

    private RentalStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
```

### Excepciones Personalizadas
Cree excepciones específicas del dominio extendiendo Exception:
```java
public class VehicleNotAvailableException extends Exception {
    public VehicleNotAvailableException(String licensePlate) {
        super("Vehicle not available: " + licensePlate);
    }
}
```

### Clases Base Abstractas con Interfaces
Combine clases abstractas para implementaciones compartidas con interfaces para contratos de comportamiento:
```java
public abstract class Vehicle {
    private String licensePlate;
    private RentalStatus status;
    
    public abstract String getVehicleType();
    
    public String getDetails() {
        return licensePlate + " " + getVehicleType() + " - " + status.getDescription();
    }
}

public interface Rentable {
    boolean rent();
    boolean returnVehicle();
    double calculateCost(int days);
}

public class Car extends Vehicle implements Rentable {
    public boolean rent() {
        if (getStatus() == RentalStatus.AVAILABLE) {
            setStatus(RentalStatus.RENTED);
            return true;
        }
        return false;
    }
}
```

### Composición para la Gestión
Utilice la composición para gestionar colecciones de objetos:
```java
public class RentalAgency {
    private ArrayList<Vehicle> fleet = new ArrayList<>();
    
    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }
    
    public double rentVehicle(String licensePlate, int days) throws VehicleNotAvailableException {
        Vehicle vehicle = findVehicle(licensePlate);
        if (vehicle == null) {
            throw new VehicleNotAvailableException(licensePlate);
        }
        Rentable rentable = (Rentable) vehicle;
        if (!rentable.rent()) {
            throw new VehicleNotAvailableException(licensePlate);
        }
        return rentable.calculateCost(days);
    }
}
```

### Polimorfismo en Acción
Diferentes subclases pueden implementar los métodos de la interfaz de manera distinta:
```java
// Car: standard pricing
public double calculateCost(int days) {
    return dailyRate * days;
}

// Motorcycle: discounted pricing
public double calculateCost(int days) {
    return dailyRate * days * 0.9;
}
```
