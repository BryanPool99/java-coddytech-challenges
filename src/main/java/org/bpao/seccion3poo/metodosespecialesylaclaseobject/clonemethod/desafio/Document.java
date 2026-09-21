package org.bpao.seccion3poo.metodosespecialesylaclaseobject.clonemethod.desafio;

// TODO: Haz que esta clase implemente la interfaz Cloneable
public class Document implements Cloneable {
    // TODO: Declara campos privados: title (String), author (String), version (int)
    private String title;
    private String author;
    private int version;

    // TODO: Crea un constructor que inicialice los tres campos
    public Document(String title, String author, int version) {
        this.title = title;
        this.author = author;
        this.version = version;
    }
    // TODO: Crea métodos getter para title, author y version

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getVersion() {
        return this.version;
    }

    // TODO: Crea el método setVersion(int version) para actualizar la versión
    public void setVersion(int version) {
        this.version = version;
    }
    // TODO: Sobrescribe el método clone()
    // - El tipo de retorno debe ser Document
    // - Llama a super.clone() y conviértelo a Document
    // - Maneja CloneNotSupportedException envolviéndola en RuntimeException

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: Sobrescribe toString() para que devuelva:
    // Document[title=X, author=Y, version=Z]

    @Override
    public String toString() {
        return String.format("Document[title=%s, author=%s, version=%d]", this.getTitle(), this.getAuthor(), this.getVersion());
    }
}
