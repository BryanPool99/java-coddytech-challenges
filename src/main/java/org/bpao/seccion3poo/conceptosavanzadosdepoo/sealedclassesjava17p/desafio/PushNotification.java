package org.bpao.seccion3poo.conceptosavanzadosdepoo.sealedclassesjava17p.desafio;

// TODO: Crea una clase final PushNotification que extienda Notification
// - Usa la palabra clave 'final' ya que esta es una subclase permitida
// - Añade un campo privado 'deviceId' (String)
// - Añade un constructor que tome message y deviceId
//   (llama a super(message) para inicializar el padre)
// - Implement deliver() to return: "Sending push to device [deviceId]: [message]"
public final class PushNotification extends Notification {
    private String deviceId;

    public PushNotification(String message, String deviceId) {
        super(message);
        this.deviceId = deviceId;
    }

    @Override
    String deliver() {
        return "Sending push to device " + this.deviceId + ": " + this.getMessage();
    }
}
