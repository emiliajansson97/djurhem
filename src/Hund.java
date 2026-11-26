public class Hund extends Djur{
    String art;
    String mat;

    public Hund(String namn, int vikt, String art, String mat) {
        super(namn, vikt);
        this.art = art;
        this.mat = mat;
    }

    @Override
    public void visa() {
        System.out.println(getNamn() + " är en " + art + " som väger " + getVikt() + " kg. " + getNamn() + " äter " + mat);
    }
}
