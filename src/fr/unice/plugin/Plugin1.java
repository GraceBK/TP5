package fr.unice.plugin;

import exemple.Plugin;

/**
 * Created by graceboukou on 07/11/2016.
 */
public class Plugin1 implements Plugin {
    static {
        System.out.println("Chargement de Plugin1");
    }

    public void decrisToi() {
        System.out.println("Je suis une instance de Plugin1");
    }
}
