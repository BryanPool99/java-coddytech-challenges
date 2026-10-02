package org.bpao.seccion3poo.patronesdediseño1.observerpattern.desafio;

public class Investors {
    // Clase DayTrader - implementa Observer
    // TODO: Implementa la interfaz Observer
    static class DayTrader implements Observer {
        // TODO: Añade campo privado para name
        private String name;

        // TODO: Crea el constructor que toma name como parámetro
        public DayTrader(String name) {
            this.name = name;
        }

        // TODO: Implementa el método update
        // Imprime: "[name] received alert: [stockName] is now $[price] - Making quick trade!"
        // Formatea price con dos decimales usando String.format("%.2f", price)
        @Override
        public void update(String stockName, double price) {
            System.out.println(String.format("%s received alert: %s is now $%.2f - Making quick trade!", this.name, stockName, price));
        }
    }

    // Clase LongTermInvestor - implementa Observer
    // TODO: Implementa la interfaz Observer
    static class LongTermInvestor implements Observer {
        // TODO: Añade campo privado para name
        private String name;

        // TODO: Crea el constructor que toma name como parámetro
        public LongTermInvestor(String name) {
            this.name = name;
        }
        // TODO: Implementa el método update
        // Imprime: "[name] received alert: [stockName] is now $[price] - Holding steady."
        // Formatea price con dos decimales usando String.format("%.2f", price)

        @Override
        public void update(String stockName, double price) {
            System.out.println(String.format("%s received alert: %s is now $%.2f - Holding steady.", this.name, stockName, price));
        }
    }
}
