public class Main {
    public static void main(String[] args) {
        //        Stwórz klasy:
//         Pizza (nazwa, cena),
//         Pizzeria(nazwa, adres, Pizze które można w niej kupić)
//         Klient(imie, nazwisko, adres).
//         Zamowienie(pizza,pizzeria,klient)
//        Klient kupuję pizze z pizzerii.
//        -Napisz metodę w klasie Klient, dzięki której klient będzie mógł kupić pizzę (nazwa, wielkość)
//        -Chcemy mieć dostęp do historii zamówień każdego klienta.
//        -Napisz metodę która dla klienta która wskaże jego ulubioną pizzę
//          (ulubiona pizza jest wybierana na podstawie jego zamówień, najczęściej zamawiana = ulubiona)
//        -Napisz metodę, która zwróci klienta, który najczęściej zamawia w danej pizzerii

        Pizzeria pizzeria1 = new Pizzeria("Dobra", "Gdynia", Pizza.zwrocPizze());

        Klient klient1 = new Klient("Arnold", "Schwarzenegger", "Wegorzewo");
        Klient klient2 = new Klient("Marcin", "Taki", "Wegorzewo");
        Klient klient3 = new Klient("Marcinek", "Boży", "Wegorzewo");
        Klient klient4 = new Klient("Bogdan", "Bonner", "Wegorzewo");
        Klient klient5 = new Klient("Domino", "Demon", "Wegorzewo");
        Klient klient6 = new Klient("Dupcyfer", "Szatan", "Wegorzewo");
        Klient klient7 = new Klient("Jareczek", "Schwarzenegger", "Wegorzewo");

        klient1.zamow(Pizza.PEPERONI, pizzeria1);
        klient1.zamow(Pizza.SWOJSKA, pizzeria1);
        klient1.zamow(Pizza.MARGARITA, pizzeria1);

        klient2.zamow(Pizza.SWOJSKA, pizzeria1);
        klient2.zamow(Pizza.SWOJSKA, pizzeria1);

        klient3.zamow(Pizza.WIEJSKA, pizzeria1);
        klient3.zamow(Pizza.WIEJSKA, pizzeria1);
        klient3.zamow(Pizza.PEPERONI, pizzeria1);
        klient3.zamow(Pizza.MARGARITA, pizzeria1);

        System.out.println(klient3.getUlubionaPizza());

        klient4.zamow(Pizza.KARBONAURA, pizzeria1);

        klient5.zamow(Pizza.WIEJSKA, pizzeria1);
        klient5.zamow(Pizza.WIEJSKA, pizzeria1);
        klient5.zamow(Pizza.WIEJSKA, pizzeria1);

        klient6.zamow(Pizza.KARBONAURA, pizzeria1);
        klient6.zamow(Pizza.KARBONAURA, pizzeria1);
        klient6.zamow(Pizza.KARBONAURA, pizzeria1);

        klient7.zamow(Pizza.SWOJSKA, pizzeria1);
        klient7.zamow(Pizza.SWOJSKA, pizzeria1);


        System.out.println(pizzeria1.getUlubionyKlient());

    }
}
