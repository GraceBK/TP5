package exemple;

import fr.unice.plugin.Plugin;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by graceboukou on 12/11/2016.
 */
public class Exemple5 {
    private static Plugin loadPlugin(String className) {
        Class c = null;
        try {
            URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:plugins/")});
            c = classLoader.loadClass(className);
        }
        catch(ClassNotFoundException e) {
            System.err.println("Classe " + className + " non trouvee");
            e.printStackTrace();
            return null;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            Object o = c.newInstance();
            return (Plugin) o;
        }
        catch(InstantiationException e) {
            System.err.println("Erreur dans l'instantiation de la classe "
                    + className);
            e.printStackTrace();
            return null;
        }
        catch(IllegalAccessException e) {
            System.err.println("Erreur dans l'instantiation de la classe "
                    + className);
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            /**
             * Changer le chemin car il charge tout les Plugin1
             * QUESTION 1 : Est-ce que la modification est prise en compte ? Pourquoi ?
             * REPONSE : NON Car le nouveau Plugin1 n'a pas ete charge
             */
            Plugin plugin = loadPlugin("fr.unice.plugin.Plugin1");
            plugin.decrisToi();
            try {
                Thread.sleep(5000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
