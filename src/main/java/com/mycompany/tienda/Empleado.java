package com.mycompany.tienda;



/**
 * Clase que representa a un empleado en la empresa.
 * Contiene información sobre el nombre, email y puesto del empleado.
 * 
 * @author pdiagom
 * @version 1.0
 */
public class Empleado {
    
    private String nombre1;
    private String email;
    private String puesto;

    /**
     * Constructor de la clase Empleado.
     * 
     * @param nombre Nombre del empleado.
     * @param email Email del empleado.
     * @param puesto Puesto de trabajo del empleado.
     */
    public Empleado(String nombre, String email, String puesto) {
        this.nombre1 = nombre;
        this.email = email;
        this.puesto = puesto;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre1;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre Nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre1 = nombre;
    }
}

