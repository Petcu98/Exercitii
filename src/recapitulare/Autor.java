package recapitulare;

import java.util.Arrays;
import java.util.Objects;

public class Autor {
    private String nume;
    private int varsta;
    private char gen;
    private Carte[] carti;

    public Autor(String nume) {
        this.nume = nume;
    }

    public Autor(String nume, int varsta, char gen, Carte[] carti) {
        this(nume);
        this.varsta = varsta;
        this.gen = gen;
        this.carti = carti;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public Carte[] getCarti() {
        return carti;
    }

    public void setCarti(Carte[] carti) {
        this.carti = carti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return varsta == autor.varsta && gen == autor.gen && Objects.equals(nume, autor.nume) && Arrays.equals(carti, autor.carti);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nume, varsta, gen);
        result = 31 * result + Arrays.hashCode(carti);
        return result;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", gen=" + gen +
                ", carti=" + Arrays.toString(carti) +
                '}';
    }

    public static Autor findAutor(String nume, Autor[] autori) {
        for (int i = 0; i < autori.length; i++) {
            if (nume.equals(autori[i].getNume())) {
                return autori[i];
            }
        }
        return null;
    }

    public Carte[] findCarti() {
        Carte[] rezultat = new Carte[carti.length];
        for (int i = 0; i < carti.length; i++) {
            int anPublicatie = carti[i].getAnPublicatie();
            if (anPublicatie > 2000) {
                rezultat[i] = carti[i];
            }
        }
        return rezultat;
    }

    public Carte[] findCartiByNrPagini(int nrPagini) {
        Carte[] rezultat = new Carte[carti.length];
        for (int i = 0; i < carti.length; i++) {
            int nrPaginiCarteCurenta = carti[i].getPagini().length;
            if (nrPaginiCarteCurenta > nrPagini) {
                rezultat[i] = carti[i];
            }
        }
        return rezultat;
    }

    public Pagina[] findPaginiByAutor() {
        int nrTotalPagini = 0;
        int k = 0;
        for (int i = 0; i < carti.length; i++) {
            int nrPaginiCarteCurenta = carti[i].getPagini().length;
            nrTotalPagini = nrTotalPagini + nrPaginiCarteCurenta;
        }
        Pagina[] rezultat = new Pagina[nrTotalPagini];
        for (int i = 0; i < carti.length; i++) {
            Carte carteCurenta = carti[i];
            Pagina[] paginiCarteCurenta = carteCurenta.getPagini();
            for (int j = 0; j < paginiCarteCurenta.length; j++) {
                Pagina paginaCurenta = paginiCarteCurenta[j];
                rezultat[k] = paginaCurenta;
                k++;
            }
        }
        return rezultat;
    }
}
