package edu.tecii.android.final_proyect;

public class Uniformes extends Catalogo1 {
    private String nombre;
    private int idDrawable;

    public Uniformes(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }




}