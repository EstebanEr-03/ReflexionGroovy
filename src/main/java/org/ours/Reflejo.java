package org.ours;

import java.util.List;

public class Reflejo {
    public void arrancarTransportes(List<Transporte> transportes) {
        System.out.println("**************************************************");
        System.out.println("INICIO DE ARRANQUE A TRAVÉS DE REFLEXIÓN");
        System.out.println("**************************************************");

        for (Transporte transporte : transportes) {
            Class<?> clase = transporte.getClass();
            transporte.iniciar();
            System.out.println("Se ha iniciado un transporte tipo: " + clase.getName());
        }

        System.out.println("**************************************************");
        System.out.println("FINAL DE ARRANQUE A TRAVÉS DE REFLEXIÓN");
        System.out.println("**************************************************");
    }
}
