import java.util.*;

public class Klient {

    private String imie;
    private String nazwisko;
    private String adres;

    private List<Zamowienie> zamowienia = new ArrayList();

    public Klient(String imie, String nazwisko, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }
    public void zlozZamowienie(Zamowienie zamowienie) {
        if (zamowienie.getKlient() != null && zamowienie.getPizza() != null && zamowienie.getPizzeria() != null) {
            zamowienia.add(zamowienie);
        }
    }

    public void zamow(Pizza pizza, Pizzeria pizzeria) {
        new Zamowienie(pizza, pizzeria, this);
    }

    public Pizza getUlubionaPizza() {
        List<Pizza> zamowionePizze = getZamowionePizze();
        Map<Pizza, Integer> howMany = new HashMap<>();
        for (Pizza pizza : zamowionePizze) {
            if (!howMany.containsKey(pizza)) {
                howMany.put(pizza, 1);
            } else {
                howMany.put(pizza, howMany.get(pizza) + 1);
            }
        }
        return Collections.max(howMany.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public List<Pizza> getZamowionePizze() {
        return zamowienia.stream()
                .map(zamowienie -> zamowienie.getPizza())
                .toList();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Zamowienie> getZamowienia() {
        return zamowienia;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
