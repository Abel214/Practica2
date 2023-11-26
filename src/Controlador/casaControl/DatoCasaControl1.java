/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.casaControl;

import Controlador.Listas.DynamicList;
import Controlador.Dao.DaoImplement;
import Modelo.Casa;
import Modelo.Tipos;
/**
 *
 * @author ALEJANDRO
 */
public class DatoCasaControl1 extends DaoImplement<Tipos> {
      private DynamicList<Tipos> tipos;
    private Tipos tipos1;
     public DatoCasaControl1() {
        super(Tipos.class);
    }

    public DynamicList<Tipos> getTipos() {
        tipos=all();
        return tipos;
    }

    public void setTipos(DynamicList<Tipos> tipos) {
        this.tipos = tipos;
    }

    public Tipos getTipos1() {
        if (tipos1 == null) {
            tipos1 = new Tipos();
        }
        return tipos1;
    }

    public void setTipos1(Tipos tipos1) {
        this.tipos1 = tipos1;
    }




    public Boolean persist(){
        tipos1.setId(all().getLength()+ 1);
        return persist(tipos1);
    }
}
