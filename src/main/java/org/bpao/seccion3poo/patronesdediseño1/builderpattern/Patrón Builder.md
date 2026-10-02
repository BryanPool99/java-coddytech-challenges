# Patrón Builder
El patrón Builder es un patrón de diseño creacional para construir objetos complejos con muchos parámetros opcionales. Evita los constructores telescópicos y las listas largas de parámetros al construir los objetos paso a paso.

### Estructura
El patrón consta de:

- Una clase con un constructor privado que acepta únicamente un builder
- Una clase Builder interna estática que construye el objeto
- Métodos del builder que devuelven this para el encadenamiento de métodos
- Un método build() que crea el objeto final

### Ejemplo de implementación

```java
public class User {
    private final String name;    // requerido
    private final String email;   // requerido
    private final int age;        // opcional
    private final String phone;   // opcional
    
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
    }
    
    public static class UserBuilder {
        private final String name;
        private final String email;
        private int age;
        private String phone;
        
        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }
        
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }
}
```

### Uso con encadenamiento de métodos
```java
User user = new User.UserBuilder("Alice", "alice@email.com")
    .age(25)
    .phone("555-1234")
    .build();
```

El patrón Builder es ideal cuando los objetos tienen muchos campos opcionales, ya que proporciona un código legible y fácil de mantener en comparación con los constructores con numerosos parámetros.
