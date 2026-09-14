# Por qué no hay herencia múltiple de clases
Java solo permite la herencia simple: una clase solo puede extender otra clase. Esto evita el Problema del Diamante, donde surge ambigüedad si una clase pudiera heredar el mismo método de múltiples clases padre.

```java
// NO permitido en Java - herencia múltiple
public class D extends B, C { } // ¡ERROR!
```

Sin embargo, Java permite que una clase implemente múltiples interfaces como alternativa:

```java
// Válido en Java
public class Dog extends Animal implements Runnable, Comparable<Dog> {
    // Puede extender una clase e implementar múltiples interfaces
}
```

Java admite la herencia multinivel: la creación de cadenas de herencia:

```java
public class AudioDevice { }

public class MusicPlayer extends AudioDevice { }

public class SmartSpeaker extends MusicPlayer { }
// SmartSpeaker hereda tanto de MusicPlayer como de AudioDevice
```