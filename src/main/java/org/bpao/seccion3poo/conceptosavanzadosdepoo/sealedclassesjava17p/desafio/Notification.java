package org.bpao.seccion3poo.conceptosavanzadosdepoo.sealedclassesjava17p.desafio;

// TODO: Crea una clase abstracta sealed Notification
// - Usa la palabra clave 'sealed' y 'permits' para permitir solo:
//   EmailNotification, SMSNotification, PushNotification
// - Añade un campo protected 'message' (String)
// - Añade un constructor que inicialice el message
// - Añade un método getter getMessage()
// - Añade un método abstract deliver() que devuelva String
public abstract sealed class Notification permits EmailNotification, SMSNotification, PushNotification {
    protected String message;
    public Notification(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    abstract String deliver();
}
