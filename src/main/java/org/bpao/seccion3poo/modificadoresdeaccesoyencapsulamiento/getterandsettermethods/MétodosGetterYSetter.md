# Métodos Getter y Setter

Los getters y setters son métodos que proporcionan acceso controlado a campos privados.
Un getter recupera el valor de un campo, mientras que un setter lo modifica.

La convención de nomenclatura sigue un patrón estándar:
el prefijo get o set seguido del nombre del campo con su primera letra en mayúscula.

```java
public class Product {
    private String name;
    private double price;

    // Getter para name
    public String getName() {
        return name;
    }

    // Setter para name
    public void setName(String name) {
        this.name = name;
    }

    // Getter para price
    public double getPrice() {
        return price;
    }

    // Setter con validación
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
```

Los setters pueden incluir lógica de validación para proteger los objetos de datos no válidos. En el ejemplo anterior, setPrice solo acepta valores no negativos.

Para los campos boolean, los getters utilizan el prefijo is en lugar de get:

```java
private boolean active;

public boolean isActive() {
    return active;
}
```

Puedes crear campos de solo lectura proporcionando únicamente un getter, o campos de solo escritura proporcionando únicamente un setter.