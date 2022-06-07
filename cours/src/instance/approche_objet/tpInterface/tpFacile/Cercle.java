package instance.approche_objet.tpInterface.tpFacile;

public class Cercle implements ObjectGeometrique {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return rayon*rayon*Math.PI;
    }

    @Override
    public double surface() {
        return 2*Math.PI*rayon;
    }
}
