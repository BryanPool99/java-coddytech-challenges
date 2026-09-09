# Variables de instancia vs. estáticas

Una variable estática (también llamada variable de clase) pertenece a la propia clase y se comparte entre todas las instancias de esa clase, a diferencia de las variables de instancia, que son únicas para cada objeto.

Declara una variable estática mediante la palabra clave static:
```java
public class Student {
    private String name;           // Variable de instancia - única por estudiante
    private static int totalCount; // Variable estática - compartida por todos los estudiantes

    public Student(String name) {
        this.name = name;
        totalCount++;  // Incrementa el contador compartido
    }

    public static int getTotalCount() {
        return totalCount;
    }
}
```

Accede a las variables y los métodos estáticos mediante el nombre de la clase en lugar de hacerlo mediante una instancia de objeto:
```java
Student s1 = new Student("Alice");
Student s2 = new Student("Bob");
System.out.println(Student.getTotalCount());  // Salida: 2
```

Usa variables de instancia para los datos que varían entre objetos. Usa variables estáticas para los datos que deben compartirse entre todas las instancias.