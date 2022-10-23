import java.util.Arrays;
import java.util.List;

public enum Pizza {

    SWOJSKA(20, 30),
    PEPERONI(30, 50),
    WIEJSKA(50, 100),
    KARBONAURA(28, 45),
    MARGARITA(18, 30);

    private int cena;
    private int srednica;


    Pizza(int cena, int srednica) {
        this.cena = cena;
        this.srednica = srednica;
    }

    public static List<Pizza> zwrocPizze() {
        return Arrays.asList(Pizza.values());
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getSrednica() {
        return srednica;
    }

    public void setSrednica(int srednica) {
        this.srednica = srednica;
    }
}
