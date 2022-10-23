
import java.util.*;

public class Pizzeria {

    private String nazwa;
    private String adres;

    private List<Zamowienie> zamowienia = new ArrayList();
    private List<Pizza> listaPizz = new ArrayList();

    public Pizzeria(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    public Pizzeria(String nazwa, String adres, List<Pizza> listaPizz) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.listaPizz = listaPizz;
    }

    public Klient getUlubionyKlient() {
        List<Klient> klienci = getKlienci();
        Map<Klient, Integer> howMany = new HashMap<>();
        for (Klient klient : klienci) {
            if (!howMany.containsKey(klient)) {
                howMany.put(klient, 1);
            }
            else {
                howMany.put(klient,howMany.get(klient) + 1);
            }
        }
        return Collections.max(howMany.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public List<Klient> getKlienci() {
        return zamowienia.stream()
                .map(zamowienie -> zamowienie.getKlient())
                .toList();
    }

    public void przyjmijZamowienie(Zamowienie zamowienie) {
        zamowienia.add(zamowienie);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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

    public List<Pizza> getListaPizz() {
        return listaPizz;
    }

    public void setListaPizz(List<Pizza> listaPizz) {
        this.listaPizz = listaPizz;
    }
}
