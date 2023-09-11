public class Souris {

    private int poid;
    private int age;
    private String couleur;
    private int esperanceVie;
    private boolean clone;

    public static final int ESPERANCE_VIE_DEFAULT = 36;

    public Souris(int unPoid, String uneCouleur, int unAge) {
        this.poid = unPoid;
        this.age = unAge;
        this.couleur = uneCouleur;
        this.esperanceVie = ESPERANCE_VIE_DEFAULT;
        this.clone = false;

         System.out.println("Une nouvelle souris!");
    }

    public Souris(int poid, String couleur) {
        this.poid = poid;
        this.couleur = couleur;
        this.esperanceVie = ESPERANCE_VIE_DEFAULT;
        this.clone = false;

        System.out.println("Une nouvelle souris!");
    }

    public Souris(Souris sourisClone) {
        this.age = sourisClone.getAge();
        this.couleur = sourisClone.getCouleur();
        this.poid = sourisClone.getPoid();
        this.esperanceVie = sourisClone.getEsperanceVie() * (4/5);
        this.clone = true;

        System.out.println("Clone d'une souris !");
    }

    public int getPoid() {
        return poid;
    }

    public int getAge() {
        return age;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    public int vieillir() {
        this.age++;

        if (this.age > this.esperanceVie/2 && clone) {
            couleur = "verte";
        
        }
        return this.age;
    }
    
    public void evolue(){
        for (int i = this.age; i < this.esperanceVie; i++){
            i = 5;
            esperanceVie = 36;
            vieillir();
        }
    }

    @Override
    public String toString() {
        String Clonee = clone ? " clonée " : "";
        return "Une souris " + couleur + Clonee + ", de " + age + "mois" +  " et pesant " + poid + "grammes";
                
    }

}