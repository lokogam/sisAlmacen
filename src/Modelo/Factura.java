/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author 
 */
public class Factura {
    
    int LineasId;
    int ProveedoresId;
    Date FechaEntrada;

    public Factura(){
        
    }
    public Factura(int LineasId, int ProveedoresId, Date FechaEntrada) {
        this.LineasId = LineasId;
        this.ProveedoresId = ProveedoresId;
        this.FechaEntrada = FechaEntrada;
    }

    public int getLineasId() {
        return LineasId;
    }

    public void setLineasId(int LineasId) {
        this.LineasId = LineasId;
    }

    public int getProveedoresId() {
        return ProveedoresId;
    }

    public void setProveedoresId(int ProveedoresId) {
        this.ProveedoresId = ProveedoresId;
    }

    public Date getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(Date FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }
    
    
    
}
