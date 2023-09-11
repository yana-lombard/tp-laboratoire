import java.util.ArrayList;

public class Laboratoire {

    public static void main(String[] args) throws Exception {
        ArrayList<Souris> mesSouris;
        mesSouris = new ArrayList<Souris>();
        Souris s1 = new Souris(50, "blanche", 2);
        mesSouris.add(s1);
        Souris s2 = new Souris(45, "grise");
        mesSouris.add(s2);
        Souris s3 = new Souris(s2);
        mesSouris.add(s3);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        s1.vieillir();
        s1.vieillir();

        System.out.println(s1);
        
        s1.evolue();
        s2.evolue();
        s3.evolue();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
