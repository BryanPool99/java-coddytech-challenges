package org.bpao.seccion3poo.patronesdediseño1.observerpattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String stockName = scanner.nextLine();
        double firstPrice = scanner.nextDouble();
        double secondPrice = scanner.nextDouble();

        // TODO: Crea un StockTicker con el nombre de acción dado
        StockTicker stockTicker = new StockTicker(stockName);
        // TODO: Crea un DayTrader llamado "Alice"
        Investors.DayTrader dayTrader = new Investors.DayTrader("Alice");
        // TODO: Crea un LongTermInvestor llamado "Bob"
        Investors.LongTermInvestor longTermInvestor = new Investors.LongTermInvestor("Bob");
        // TODO: Suscribe tanto a Alice como a Bob al ticker
        stockTicker.subscribe(dayTrader);
        stockTicker.subscribe(longTermInvestor);
        // TODO: Establece el precio a firstPrice (ambos observadores son notificados)
        stockTicker.setPrice(firstPrice);
        // TODO: Cancela la suscripción de Alice
        stockTicker.unsubscribe(dayTrader);
        // TODO: Establece el precio a secondPrice (solo Bob es notificado)
        stockTicker.setPrice(secondPrice);
        scanner.close();
    }
}
