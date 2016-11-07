package exemple;

/**
 * Created by graceboukou on 07/11/2016.
 */
public class Exemple2 {
    public static void main(String []args) {
        Class c = null;

        try {
            c = Class.forName("ClasseC");
        } catch (ClassNotFoundException e) {
            System.err.println("Classe ClasseC non trouvée");
            e.printStackTrace();
        }

        try {
            c.newInstance();
        } catch (InstantiationException e) {
            System.err.println("Erreur dans l'instatiation de la classe ClasseC");
            e.printStackTrace();
            System.err.println("Erreur dans l'instatiation de la classe ClasseC");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
