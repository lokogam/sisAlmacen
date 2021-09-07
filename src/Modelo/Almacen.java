
package Modelo;


public class Almacen {
    
    String IdAlmacen;
    int LineasId;
    String Descripcion;
    int Stock;
    String UMedida;
    double PUnitario;       

    public Almacen(){
        
    }
    public Almacen(String IdAlmacen, int LineasId, String Descripcion, int Stock, String UMedida, double PUnitario) {
        this.IdAlmacen = IdAlmacen;
        this.LineasId = LineasId;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.UMedida = UMedida;
        this.PUnitario = PUnitario;
    }

    public String getIdAlmacen() {
        return IdAlmacen;
    }

    public void setIdAlmacen(String IdAlmacen) {
        this.IdAlmacen = IdAlmacen;
    }

    public int getLineasId() {
        return LineasId;
    }

    public void setLineasId(int LineasId) {
        this.LineasId = LineasId;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getUMedida() {
        return UMedida;
    }

    public void setUMedida(String UMedida) {
        this.UMedida = UMedida;
    }

    public double getPUnitario() {
        return PUnitario;
    }

    public void setPUnitario(double PUnitario) {
        this.PUnitario = PUnitario;
    }
    
    
}
