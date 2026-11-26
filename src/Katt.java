public class Katt extends Djur{
    String art;
    String mat;

    public Katt(String namn, int vikt,String art,String mat){
        super(namn, vikt);
        this.art = art;
        this.mat = mat;
    }

    @Override
    public void visa() {
        super.visa();
        System.out.println(art + " äter " + mat);
    }
}
