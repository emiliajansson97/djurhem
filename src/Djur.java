public abstract class Djur {
    private String namn;
    private int vikt;
    private final String art;
    private static int antalDjur = 0;

    public Djur(String namn, int vikt, String art) {
        this.namn = namn;
        this.vikt = vikt;
        this.art = art;

        antalDjur++;
    }
    public static int getAntalDjur() {
        return antalDjur;
    }
    public String getArt() {
        return art;
    }
    public String getNamn() {
        return namn;
    }
    public int getVikt() {
        return vikt;
    }
    public boolean andraVikt(int nyVikt) {
        if(nyVikt <= 0) {
            System.out.println("Vikten kan inte vara 0 eller mindre. Vikten har inte ändrats");
            return false;
        }else {
            System.out.println("vikten har ändrats");
            vikt = nyVikt;
            return true;
        }
    }

    public abstract void visa();


}
