# Patrón Composite
El Patrón Composite es un patrón de diseño estructural que compone objetos en estructuras de árbol para representar jerarquías de parte y totalidad. Permite tratar objetos individuales y composiciones de manera uniforme mediante una interfaz común.

El patrón consta de tres elementos clave:
- Componente: Interfaz que define operaciones comunes
- Hoja: Objetos individuales que implementan la interfaz del componente
- Compuesto: Objetos contenedores que contienen elementos secundarios y delegan las operaciones en ellos

Ejemplo de implementación de un sistema de archivos:
```java
// Interfaz Component
interface FileComponent {
    void display(String indent);
    int getSize();
}

// Clase Leaf
class File implements FileComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void display(String indent) {
        System.out.println(indent + name + " (" + size + "KB)");
    }

    public int getSize() {
        return size;
    }
}

// Clase Composite
class Folder implements FileComponent {
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void display(String indent) {
        System.out.println(indent + name + "/");
        for (FileComponent child : children) {
            child.display(indent + "  ");
        }
    }

    public int getSize() {
        return children.stream().mapToInt(FileComponent::getSize).sum();
    }
}
```

Uso de la estructura compuesta:
```java
Folder root = new Folder("Documents");
root.add(new File("resume.pdf", 150));

Folder photos = new Folder("Photos");
photos.add(new File("vacation.jpg", 2000));
root.add(photos);

root.display("");
System.out.println("Total: " + root.getSize() + "KB");
```

El compuesto delega las operaciones en sus elementos secundarios de forma recursiva. Los clientes interactúan con el árbol sin saber si están trabajando con una hoja o un compuesto.

Casos de uso: Organigramas, componentes de UI, sistemas de menús, sistemas de archivos: cualquier jerarquía en la que los grupos y los elementos individuales necesiten un tratamiento idéntico.
