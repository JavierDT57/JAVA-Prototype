package Clases;

import java.io.Serializable;

public class Persona implements Serializable {
    public String Usuario;
    public String Nombre;
    public String Biografia;
    public boolean Estatus;
    public String Fecha;

    public Persona(String Usuario, String Nombre, String Biografia, boolean Estatus, String Fecha) {
        this.Usuario = Usuario;
        this.Nombre = Nombre;
        this.Biografia = Biografia;
        this.Estatus = Estatus;
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Persona{" + "Usuario=" + Usuario + ", Nombre=" + Nombre + ", Biografia=" + Biografia + ", Estatus=" + Estatus + ", Fecha=" + Fecha + '}';
    }


    
    
}
