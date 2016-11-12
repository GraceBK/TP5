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

        try {/**
         QUESTION: a quoi sert la cast de l'objet o en Plugin (p = (plugin) o;)?
         REPONSE : il permet de changer le type de l'objet o en type plugin

         QUESTION: Ne pourrait-on ecrire directement c.newInstance().decrisToi();?
         REPONSE : NON car la methode decrisToi() n'est pas une methode du type de l'objet c
         */
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
