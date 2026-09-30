package org.bpao.seccion3poo.patronesdediseño1.singletonpattern.desafio;

public class AppConfig {
    // TODO: Crea un campo estático privado para contener la única instancia
    private static AppConfig instance;
    // TODO: Crea campos privados para appName (String) y maxUsers (int)
    private String appName;
    private int maxUsers;

    // TODO: Crea un constructor privado que:
    // - Initializes appName to "MyApplication"
    // - Inicializa maxUsers a 100
    // - Prints "AppConfig initialized"
    private AppConfig() {
        this.appName = "MyApplication";
        this.maxUsers = 100;
        System.out.println("AppConfig initialized");
    }
    // TODO: Crea un método público estático getInstance() que:
    // - Crea la instancia solo si no existe (inicialización perezosa)
    // - Devuelve la instancia

    public static AppConfig getInstance() {
        if (instance==null) {
            instance = new AppConfig();
        }
        return instance;
    }

    // TODO: Crea el método setAppName(String name) para actualizar appName
    public void setAppName(String appName) {
        this.appName = appName;
    }

    // TODO: Crea el método setMaxUsers(int max) para actualizar maxUsers

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    // TODO: Crea el método displaySettings() que imprime:
    // "App: [appName], Max Users: [maxUsers]"
    public void displaySettings() {
        System.out.println(String.format("App: %s, Max Users: %d", this.appName, this.maxUsers));
    }
}
