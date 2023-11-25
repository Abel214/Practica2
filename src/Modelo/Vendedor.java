/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Vendedor {
    String nombre;
    String apellido;
    String cedula;
    String numero;
    Integer id;
    String edad;

//    public Vendedor(String nombre, String apellido, String cedula, String numero, Integer id, String edad) {
//        this.nombre = null;
//        this.apellido = null;
//        this.cedula = null;
//        this.numero = null;
//        this.id = null; 
//        this.edad = null;
//    }

    public Vendedor(String nombre, String apellido, String cedula, String numero, Integer id, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numero = numero;
        this.id = id;
        this.edad = edad;
    }
    
    
    public Vendedor(){
        this.nombre = null;
        this.apellido = null;
        this.cedula = null;
        this.numero = null;
        this.id = null; 
        this.edad = null;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return apellido ;
    }
    
    
}
