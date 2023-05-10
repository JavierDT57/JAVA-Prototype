package Clases;

import java.io.Serializable;

public class Usuario implements Serializable {
   public int Matricula;
   public String Usuario;
   public String Correo;
   public boolean Moderador;
   public boolean Espectador;

    public Usuario(int Matricula, String Usuario, String Correo, boolean Moderador, boolean Espectador) {
        this.Matricula = Matricula;
        this.Usuario = Usuario;
        this.Correo = Correo;
        this.Moderador = Moderador;
        this.Espectador = Espectador;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Matricula=" + Matricula + ", Usuario=" + Usuario + ", Correo=" + Correo + ", Moderador=" + Moderador + ", Espectador=" + Espectador + '}';
    }

   
   
    
}
