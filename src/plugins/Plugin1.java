package plugins;

/**
 * Created by graceboukou on 12/11/2016.
 */
public class Plugin1 {
    static {
        System.out.println("Chargement du nouveau Plugin1 de la question avec URLClassLoader");
    }

    public void decrisToi() {
        System.out.println("Je suis une instance du nouveau Plugin1 de la question avec URLClassLoader");
    }
}
