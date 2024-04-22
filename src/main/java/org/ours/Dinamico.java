package org.ours;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.MissingPropertyException;

import java.util.List;

public class Dinamico {
    public void arrancarTransportes(List<Transporte> transportes) {
        System.out.println("**************************************************");
        System.out.println("INICIO DE CÓDIGO DINÁMICO CON GROOVY");
        System.out.println("**************************************************");

        Binding binding = new Binding();
        binding.setVariable("transportes", transportes);
        GroovyShell shell = new GroovyShell(binding);

        String script = """
            def iniciarTransportes(transportes) {
                transportes.each { transporte ->
                    transporte.iniciar()
                }
            }

            iniciarTransportes(transportes)
        """;

        try {
            shell.evaluate(script);
            System.out.println("Script ejecutado correctamente.");
        } catch (MissingPropertyException e) {
            System.err.println("Error: Se intentó acceder a una propiedad inexistente.");
        } catch (Exception e) {
            System.err.println("Error al ejecutar el script: " + e.getMessage());
        }

        System.out.println("**************************************************");
        System.out.println("FINAL DE CÓDIGO DINÁMICO CON GROOVY");
        System.out.println("**************************************************");
    }
}