public class Main {
    public static void main(String[] args){
        System.out.println("Katthemmet öppnar!");
        Katt a = new Katt("Alfred", 7, "katt", "kattmat");
        Hund b = new Hund("Boris", 12, "hund", "hundmat");
        a.visa();
        b.visa();
        b.andraVikt(3);
        b.visa();
        System.out.println("Djurhemmet stänger");
        System.out.println("Antal djur " + Djur.getAntalDjur());
    }
}
