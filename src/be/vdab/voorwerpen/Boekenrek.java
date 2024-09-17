package be.vdab.voorwerpen;
import be.vdab.util.Voorwerp;

public class Boekenrek implements Voorwerp {
    private String eigenaar;
    private int hoogte ;
    private int breedte ;
    private float aankoopprijs ;
    private static final float WINSTMARGE = 2F ;

    public Boekenrek() {
        this (175, 100, 40.0F) ; // eenheid in cm
   }

    public Boekenrek( int hoogte, int breedte, float aankoopprijs) {
        setHoogte(hoogte);
        setBreedte(breedte);
        setAankoopprijs(aankoopprijs);
    }

    public int getHoogte() {
        return hoogte;
    }

    public final void setHoogte(int hoogte) {
        if (hoogte > 0)
        this.hoogte = hoogte;
    }

    public int getBreedte() {
        return breedte;
    }

    public final void setBreedte(int breedte) {
        if (breedte > 0 )
        this.breedte = breedte;
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public final void setAankoopprijs(float aankoopprijs) {
        if (aankoopprijs > 0.0)
        this.aankoopprijs = aankoopprijs;
    }

    public float getWinstmarge() {
        return WINSTMARGE;
    }

    @Override
    public void gegevensTonen() {
        System.out.println("GEGEVENS VAN DE BOEKENREK ") ;
        System.out.println("Het boekenrek is " + hoogte + " cm hoog en "
                + breedte + " cm breed.");
        System.out.println("Het is eigendom van : " + EIGENAAR);
        System.out.println("Aankoopprijs : " + aankoopprijs);
        System.out.println("Winst : " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return aankoopprijs * WINSTMARGE;
    }
}
