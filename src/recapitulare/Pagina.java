package recapitulare;

import java.util.Objects;

public class Pagina {

    private String text;
    private boolean areImagini;

    public Pagina(String text, boolean areImagini){
        this.text = text;
        this.areImagini = areImagini;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public boolean isAreImagini() {
        return areImagini;
    }

    public void setAreImagini(boolean areImagini) {
        this.areImagini = areImagini;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagina pagina = (Pagina) o;
        return areImagini == pagina.areImagini && Objects.equals(text, pagina.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, areImagini);
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "text='" + text + '\'' +
                ", areImagini=" + areImagini +
                '}';
    }
}
