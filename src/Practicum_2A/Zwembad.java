package Practicum_2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;


    public Zwembad(double br, double le, double di) {
        breedte = br;
        lengte = le;
        diepte = di;
    }


    public double getBreedte() {

        return breedte;
    }

    public double getDiepte() {

        return diepte;
    }

    public double getLengte() {

        return lengte;
    }

    public void setLengte(double lengte) {

        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {

        this.diepte = diepte;
    }

    public void setBreedte(double breedte) {

        this.breedte = breedte;
    }

    public double inhoud() {

        return getBreedte() * getDiepte() * getLengte();
    }

    @Override
    public String toString() {
        return "dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}

