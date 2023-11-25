/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class AgenteInmobiliario extends Vendedor {
    Boolean ventaCasa;
    Vendedor agente;

    public Boolean getVentaCasa() {
        return ventaCasa;
    }

    public void setVentaCasa(Boolean ventaCasa) {
        this.ventaCasa = ventaCasa;
    }

    public Vendedor getAgente() {
        return agente;
    }

    public void setAgente(Vendedor agente) {
        this.agente = agente;
    }
    
}
