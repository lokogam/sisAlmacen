
package Modelo;

public class Usuarios {

    int IdUsuarios;
    String Nombre;
    String Usuario;
    String Clave;
    String Perfil;
    
    public Usuarios(){
        
    }
    public Usuarios(int IdUsuarios, String Nombre, String Usuario, String Clave, String Perfil) {
        this.IdUsuarios = IdUsuarios;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.Perfil = Perfil;
    }
    
    
    public int getIdUsuarios() {
        return IdUsuarios;
    }

    public void setIdUsuarios(int IdUsuarios) {
        this.IdUsuarios = IdUsuarios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }


    

    
    
    
}
