package com.example.centro2.drinksliquors.modelo;

public class Usuario {

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefofo;

    public Usuario(String cedula, String nombre, String apellido, String direccion, String telefofo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefofo = telefofo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefofo() {
        return telefofo;
    }

    public void setTelefofo(String telefofo) {
        this.telefofo = telefofo;
    }

    @Override
    public String  toString() {
        return "Usuario{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefofo='" + telefofo + '\'' +
                '}';
    }

}
