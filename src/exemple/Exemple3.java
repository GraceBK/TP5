package exemple;

/**
 * Created by graceboukou on 07/11/2016.
 */
public class Exemple3 {
    public static void main(String []args) {
        Class c = null;

        try {
            c = Class.forName("fr.unice.plugin.Plugin1");
        }
        catch(ClassNotFoundException e) {
            System.err.println("Classe Plugin1 non trouvee");
            e.printStackTrace();
        }

        try {
            Object o = c.newInstance();
            Plugin p = (Plugin) o;
            p.decrisToi();
        }
        catch(InstantiationException e) {
            System.err.println("Erreur dans l'instantiation de la classe " + c);
            e.printStackTrace();
        }
        catch(IllegalAccessException e) {
            System.err.println("Erreur dans l'instantiation de la classe " + c);
            e.printStackTrace();
        }
    }
}
