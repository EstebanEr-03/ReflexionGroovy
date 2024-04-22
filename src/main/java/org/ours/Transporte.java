package org.ours;

import java.util.List;

// Clase abstracta para vehículos
public abstract class Transporte {
    public void iniciar() {
        System.out.println("Se inicia el transporte genérico.");
    }

    public abstract void iniciarEspecifico();
}
