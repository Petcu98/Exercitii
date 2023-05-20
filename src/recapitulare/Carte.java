package recapitulare;

import java.util.Arrays;
import java.util.Objects;

public class Carte {
    private String titlu;
    private String tip;
    private String[] limbi;
    private String[] capitole;
    private int anPublicatie;
    private Pagina[] pagini;

    public Carte(String titlu, String tip, String[] capitole) {
        this.titlu = titlu;
        this.tip = tip;
        this.capitole = capitole;
    }

    public Carte(String titlu, String tip, String[] limbi, String[] capitole, int anPublicatie, Pagina[] pagini) {
        this(titlu, tip, capitole);
        this.limbi = limbi;
        this.anPublicatie = anPublicatie;
        this.pagini = pagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String[] getLimbi() {
        return limbi;
    }

    public void setLimbi(String[] limbi) {
        this.limbi = limbi;
    }

    public String[] getCapitole() {
        return capitole;
    }

    public void setCapitole(String[] capitole) {
        this.capitole = capitole;
    }

    public int getAnPublicatie() {
        return anPublicatie;
    }

    public void setAnPublicatie(int anPublicatie) {
        this.anPublicatie = anPublicatie;
    }

    public Pagina[] getPagini() {
        return pagini;
    }

    public void setPagini(Pagina[] pagini) {
        this.pagini = pagini;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return anPublicatie == carte.anPublicatie && Objects.equals(titlu, carte.titlu) && Objects.equals(tip, carte.tip) && Arrays.equals(limbi, carte.limbi) && Arrays.equals(capitole, carte.capitole) && Arrays.equals(pagini, carte.pagini);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(titlu, tip, anPublicatie);
        result = 31 * result + Arrays.hashCode(limbi);
        result = 31 * result + Arrays.hashCode(capitole);
        result = 31 * result + Arrays.hashCode(pagini);
        return result;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", tip='" + tip + '\'' +
                ", limbi=" + Arrays.toString(limbi) +
                ", capitole=" + Arrays.toString(capitole) +
                ", anPublicatie=" + anPublicatie +
                ", pagini=" + Arrays.toString(pagini) +
                '}';
    }

    public boolean[] decide(String input) {
        boolean[] rezultat = new boolean[pagini.length];
        int i = 0;
        for (Pagina paginaCurenta : pagini) {
            rezultat[i] = paginaCurenta.getText().contains(input) && paginaCurenta.isAreImagini() == false;
            /*if (paginaCurenta.getText().contains(input) && paginaCurenta.isAreImagini() == false) {
                rezultat[i] = true;
            } else {
                rezultat[i] = false;
            }*/
            i++;
        }
        return rezultat;
    }
}
