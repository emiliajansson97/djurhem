public class Katt extends Djur{
    String mat;

    public Katt(String namn, int vikt,String art,String mat){
        super(namn, vikt, art);
        this.mat = mat;
    }

    @Override
    public void visa() {
        System.out.println(getNamn() + " är en " + getArt() + " som väger " + getVikt() + " kg. " + getNamn() + " äter " + mat);
    }
}
