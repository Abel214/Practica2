/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.casas;

import Controlador.Dao.DaoImplement;
import Controlador.Listas.DynamicList;

import Modelo.Vendedor;

/**
 *
 * @author ALEJANDRO
 */
public class AgenteControl1 extends DaoImplement<Vendedor>{
     private DynamicList<Vendedor>listR=new DynamicList<>();
     private Vendedor vendedor;
     
     public AgenteControl1(){
         super(Vendedor.class);
     }
    public DynamicList<Vendedor> getVendedores() {
        return listR = all();
    }

    public void setListR(DynamicList<Vendedor> listR) {
        this.listR = listR;
    }

    public Vendedor getVendedor() {
        if(vendedor==null)
            vendedor=new Vendedor();
            return vendedor;
        
        
    }


    public void setVendedor (Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public Boolean persit(){
        vendedor.setId(all().getLength()+1);
        
        return persist(vendedor);
    }
}
