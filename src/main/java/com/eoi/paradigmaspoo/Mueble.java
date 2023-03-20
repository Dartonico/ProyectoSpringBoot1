package com.eoi.paradigmaspoo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Mueble. La clase mueble, comprende aquellos objetos fisisiqcos que tienen una habitacion.
 * Ademas, todos los objetos de la clase Mueble, tienen un ArrayList de Componentes de Mueble(ComponenteDeMueble.class)
 */
@Component
public abstract class Mueble extends ObjetoFisico {
    //Define la habitacion en la que se encuentra el mueble
    /**
     * Se utiliza para guardar el nombre de la habitacion en la que se encuentra el mueble.
     */
    private String habitacion;

    /**
     * The Componentes.
     */
    protected List<ComponenteDeMueble> componentes = new ArrayList<>();


    /**
     * Instantiates a new Mueble.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     */
    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    /**
     * Instantiates a new Mueble.
     *
     * @param nombre     the nombre
     * @param alto       the alto
     * @param ancho      the ancho
     * @param fondo      the fondo
     * @param peso       the peso
     * @param material   the material
     * @param habitacion the habitacion
     */
    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material, String habitacion) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.habitacion = habitacion;
    }

    /**
     * Gets componentes.
     *
     * @return the componentes
     */
    public List<ComponenteDeMueble> getComponentes() {
        return componentes;
    }

    /**
     * Sets componentes.
     *
     * @param componentes the componentes
     */
    public void setComponentes(List<ComponenteDeMueble> componentes) {
        this.componentes = componentes;
    }

    /**
     * El metodo showInfo muestra en pantalla la informacion basica de un objeto fisico.
     */
    @Override
    public void showInfo() {
        System.out.println("FICHA DE MUEBLE");
        super.showInfo();
        System.out.println("Numero de componentes: " + componentes.size());
        System.out.println("Listado de Componentes: ");
        componentes.forEach(n ->  {
            ObjetoFisico o =  n;
            o.showInfo();
        });
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }
}
