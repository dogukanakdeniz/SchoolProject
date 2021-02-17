package opdracht_2_1;

public class Piloot {
    private String naam;

    private Integer vlieguren;

    private double salaris;

    public Piloot ( String nm ) {naam = nm;}

    public String getNaam() {return naam + " heeft " + getVlieguren() + " vlieguren gemaakt en verdient " + getSalaris();}

    public Integer getVlieguren() {return vlieguren;}

    public double getSalaris() {return salaris;}

    public void verhoogVliegurenMet(Integer vlieguren) { this.vlieguren = vlieguren;}

    public void setSalaris(double salaris) { this.salaris = salaris; }

    public String toString() { String s = getNaam(); return s;}

}

