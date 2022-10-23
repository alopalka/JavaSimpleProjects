public class Zamowienie {
    private Pizza pizza;
    private Pizzeria pizzeria;
    private Klient klient;

    public Zamowienie(Pizza pizza, Pizzeria pizzeria, Klient klient) {
        this.pizza = pizza;
        this.pizzeria = pizzeria;
        this.klient = klient;
        pizzeria.przyjmijZamowienie(this);
        klient.zlozZamowienie(this);
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizzeria getPizzeria() {
        return pizzeria;
    }

    public void setPizzeria(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
}

