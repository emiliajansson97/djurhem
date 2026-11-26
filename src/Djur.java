public class Djur {
    String namn;
    int vikt;

    public Djur(String namn, int vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }
    public String getNamn() {
        return namn;
    }
    public int getVikt() {
        return vikt;
    }

    public void visa(){
        System.out.println(namn + ", väger: " + vikt + "kg");

    }

}
