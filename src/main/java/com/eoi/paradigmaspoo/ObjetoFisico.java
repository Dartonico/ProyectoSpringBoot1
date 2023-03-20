package com.eoi.paradigmaspoo;


/**
 * La clase Objeto fisico. Esta clase representa un concepto de objeto abstracto, en el que englobamos todos
 * aquellos objetos que poseen propiedades físicas. Es un ejemplo del paradigma de ABSTRACCION.
 */


public abstract class ObjetoFisico {
    /**
     * El nombre del objeto
     */
    private String nombre;
    /**
     * La altura del objeto fisico, expresada en centimetros
     */

    private int alto;
    /**
     * El ancho del objeto fisico, expresada en centimetros
     */
    private int ancho;
    /**
     * El fondo del objeto fisico, expresada en centimetros
     */
    private int fondo;
    /**
     * El peso del objeto fisico, expresada en gramos
     */
    private int peso;
    /**
     * El de material principal  del que esta compuesto un objeto fisico
     */
    private String material;

    /**
     * Instantiates a new Objeto fisico.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     */
    protected ObjetoFisico(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.peso = peso;
        this.material = material;
    }

    /**
     * El metodo showInfo muestra en pantalla la informacion basica de un objeto fisico.
     */
    public void showInfo(){
        System.out.println ("Nombre: " + this.nombre + "\n" +
                            "Material: " + this.material + "\n" +
                            "Alto: " + this.alto + "\n" +
                            "Ancho: " + this.ancho + "\n" +
                            "Fondo: " + this.fondo + "\n" +
                            "Peso:" + this.peso
        );
    }

}
