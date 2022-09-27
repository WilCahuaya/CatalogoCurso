package com.example.catalogo_wcq;

public class ListElement {
    public String color;
    public String name;
    public String descripcion;
    public String status;

    public ListElement(String color, String name, String descripcion, String status) {
        this.color = color;
        this.name = name;
        this.descripcion = descripcion;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
