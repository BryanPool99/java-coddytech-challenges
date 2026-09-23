package org.bpao.seccion3poo.conceptosavanzadosdepoo.innernestedandanonymousclass.desafio;

public class ShoppingCart {
    // TODO: Agregar un campo privado para customerName
    private String customerName;

    // TODO: Crear un constructor que reciba customerName
    public ShoppingCart(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    // TODO: Crear una clase interna anidada Item con:
    //       - campos privados: name (String), price (double)
    //       - constructor para inicializar ambos campos
    //       - método getDetails() que devuelva: "[name]: $[price]"
    class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getDetails() {
            return String.format("%s: $%s", this.getName(), this.getPrice());
        }
    }

    // TODO: Crear un método checkout que reciba un Item y un porcentaje de descuento (double)
    //       Dentro de checkout():
    //       1. Crear una clase interna local DiscountCalculator con el método:
    //          applyDiscount(double originalPrice) - devuelve el precio después del descuento
    //       2. Usar DiscountCalculator para calcular el precio final
    //       3. Crear una clase interna anónima que implemente Formatter
    //          para formatear y devolver la cadena del recibo:
    //          --- Receipt ---
    //          Customer: [customerName]
    //          Item: [item details]
    //          Discount: [discount]%
    //          Final Price: $[calculated price]
    public String checkout(Item item, double percentageDiscount) {
        class DiscountCalculator {
            public double applyDiscount(double originalPrice) {
                return originalPrice - (originalPrice * percentageDiscount / 100);
            }
        }

        DiscountCalculator calculator = new DiscountCalculator();
        double finalPrice = calculator.applyDiscount(item.price);

        Formatter formatter = new Formatter() {
            @Override
            public String format() {
                StringBuilder sb = new StringBuilder();
                sb.append("--- Receipt ---");
                sb.append("\n");
                sb.append("Customer: " + getCustomerName());
                sb.append("\n");
                sb.append("Item: " + item.getDetails());
                sb.append("\n");
                sb.append("Discount: " + percentageDiscount + "%");
                sb.append("\n");
                sb.append("Final Price: $" + finalPrice);
                return sb.toString();
            }
        };
        return formatter.format();
    }
}
