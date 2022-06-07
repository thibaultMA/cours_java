package instance.approche_objet.tpInterface.tpFacile;

public class TestObjetGeometrie {
    public static void main(String[] args) {
        ObjectGeometrique[] tabObj = new ObjectGeometrique[2];

        tabObj[0] = new Rectangle(1,2);
        tabObj[1] = new Cercle(25);
    }
}
