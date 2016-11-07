package exemple;

/**
 * Created by graceboukou on 07/11/2016.
 */
public class ClasseA {
    // ClasseB ne sera jamais chargÈe !
    private ClasseB objet1;
    private ClasseC objet2;

    static {
        System.out.println("Chargement de ClasseA");
    }

    public ClasseA() {
        objet2 = new ClasseC();
    }
}
