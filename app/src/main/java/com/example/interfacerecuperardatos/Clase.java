package com.example.interfacerecuperardatos;

public class Clase {
    private String descripcion;
    private int imagen;
    private int estado;

    public Clase(String descripcion, int imagen, int estado) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
