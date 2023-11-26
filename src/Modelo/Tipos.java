/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Tipos  {
    private Casa Id_casa;
    private String estado_pago;
    private String direccion;
    private String estado_casa;
    private Integer Id;
    private String dimension;
    private String vendedor;

    public Tipos() {
        this.Id_casa = null;
        this.estado_pago = null;
        this.direccion = null;
        this.estado_casa = null;
        this.Id = null;
        this.dimension = null;
        this.vendedor = null;
    }

    public Tipos(Casa Id_casa, String estado_pago, String direccion, String estado_casa, Integer Id, String dimension, String vendedor) {
        this.Id_casa = Id_casa;
        this.estado_pago = estado_pago;
        this.direccion = direccion;
        this.estado_casa = estado_casa;
        this.Id = Id;
        this.dimension = dimension;
        this.vendedor = vendedor;
    }
    
    
    

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    

    public Casa getId_casa() {
        return Id_casa;
    }

    public void setId_casa(Casa Id_casa) {
        this.Id_casa = Id_casa;
    }
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado_casa() {
        return estado_casa;
    }

    public void setEstado_casa(String estado_casa) {
        this.estado_casa = estado_casa;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Tipos:" +"Vendedor:" + vendedor + "Estado_pago:" + estado_pago +  "Id_casa:" + Id_casa + ", dimension:"+dimension+", direccion:" + direccion + ", estado_casa:" + estado_casa +"\n";
    }
    
    
    

    
    
}
