package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.stringbufferintroduction;

import java.util.Scanner;

/*
    Crea un método llamado modifyText que reciba tres argumentos:

    Un String (text) a modificar
    Un String (target) a buscar
    Un String (replacement) con el cual reemplazar target
    El método debe:

    Crear un StringBuffer con el texto de entrada
    Reemplazar la primera aparición de target con replacement
    Añadir un signo de exclamación al final
    Devolver la cadena final
    Los mensajes de retorno deben ser:

    Si alguna entrada es null: devolver "Invalid input"
    Si no se encuentra target: devolver el texto original con un signo de exclamación
    Para una operación exitosa: devolver el texto modificado
*/
public class DesafioStringBuffer {
    public static String modifyText(String text, String target, String replacement) {
        // Escribe tu código aquí
        if (text!=null && target!=null && replacement!=null) {
            StringBuffer stringBuffer = new StringBuffer(text);
           int idx = text.indexOf(target);
           if(idx != -1){
               stringBuffer.replace(idx,idx+target.length(),replacement);
           }
           stringBuffer.append("!");
           return stringBuffer.toString();
        }
        return "Invalid input";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String target = scanner.nextLine();
        String replacement = scanner.nextLine();

        if (text.equals("null")) text = null;
        if (target.equals("null")) target = null;
        if (replacement.equals("null")) replacement = null;

        System.out.println(modifyText(text, target, replacement));
    }
}
