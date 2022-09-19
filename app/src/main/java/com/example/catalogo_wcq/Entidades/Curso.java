package com.example.catalogo_wcq.Entidades;

public class Curso {
    //encapsular
    private String id;
    private String nombre;
    private String descripcion;
    private String duracion;
    private String imagen;

    public Curso(String id, String nombre, String descripcion, String duracion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "id='" + id + ", nombre='" + nombre + ", descripcion='" + descripcion + ", duracion='" + duracion + ", imagen='" + imagen;
    }
}
