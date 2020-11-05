package com.example.marketexpress;

public class Modelo {
    private String nombre;
    private int image;

    public Modelo(String nombre, int image) {
        this.nombre = nombre;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
