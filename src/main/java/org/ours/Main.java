package org.ours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("INICIO DE ARRANQUE DE TRANSPORTES");
        System.out.println("**************************************************");

        Transporte[] transportesArray = {new Bicicleta(), new Barco(), new Helicoptero()};
        List<Transporte> transportes = new ArrayList<>(Arrays.asList(transportesArray));

        Dinamico dinamico = new Dinamico();
        Reflejo reflejo = new Reflejo();

        dinamico.arrancarTransportes(transportes); // Usando Groovy
        reflejo.arrancarTransportes(transportes); // Usando reflexión
    }
}
