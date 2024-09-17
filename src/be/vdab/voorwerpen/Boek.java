package be.vdab.voorwerpen;
import be.vdab.util.Voorwerp;

public abstract class Boek implements Voorwerp {

    private String title;
    private String auteur;
    private float aankoopprijs;
    private String genre;

    public Boek() {
    }

    public Boek(String title, String auteur, float aankoopprijs, String genre) {
        setTitle(title);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
    }

    public String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        if (title != null)
            this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public final void setAuteur(String auteur) {
        if (auteur != null)
            this.auteur = auteur;
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public void setAankoopprijs(float aankoopprijs) {
        this.aankoopprijs = aankoopprijs;
    }

    public String getGenre() {
        return genre;
    }

    public final void setGenre(String genre) {
        if (genre != null)
            this.genre = genre;
    }

    @Override
    public void gegevensTonen() {
        System.out.println("GEGEVENS VAN EEN BOEK ");
        System.out.println("Title    : " + title);
        System.out.println("Auteur    : " + auteur);
        System.out.println("Het is eigendom van    : " + EIGENAAR);
        System.out.println("Aankoopprijs    : " + aankoopprijs);
        System.out.println("Genre    : " + genre);

    }

    @Override
    public String toString() {
        return (title + " ; " + auteur + " ; " + EIGENAAR + " ; " +
                aankoopprijs + " ; " + genre);
    }
}



