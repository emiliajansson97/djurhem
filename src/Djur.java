public class Djur {
    String namn;
    int vikt;

    public Djur(String namn, int vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }

    public void visa(){
        System.out.println(namn + ", väger: " + vikt + "kg");

    }

}
