package Clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class GeneradorArchivos {
    
    public GeneradorArchivos(){
        
    }
    
    public boolean GuardarUsuarios(List<Usuario> usuarios,String pathFile){
      try{
          if(usuarios.isEmpty()){
              return false;
          }
      }
      catch(Exception e){
          System.out.println(e);

          return false;
      }
      ObjectOutputStream output;
      
      
      try{
         output = new ObjectOutputStream(new FileOutputStream(pathFile)); 
         output.writeObject(usuarios);
         output.close();
      }
      catch(FileNotFoundException e){
          System.out.println("Archivo Usuarios no Enontrado");
          return false;
          
      }
      catch(Exception e){
          System.out.println(e);
          return false;
      }
      
      
      return true;
    }
    
     public boolean GuardarPersonas(List<Persona> personas,String pathFile){
      try{
          if(personas.isEmpty()){
              return false;
          }
      }
      catch(Exception e){
          System.out.println(e);

          return false;
      }
      ObjectOutputStream output;
      
      
      try{
         output = new ObjectOutputStream(new FileOutputStream(pathFile)); 
         output.writeObject(personas);
         output.close();
      }
      catch(FileNotFoundException e){
          System.out.println("Archivo Personas no Enontrado");
          return false;
          
      }
      catch(Exception e){
          System.out.println(e);
          return false;
      }
      
      
      return true;
    }
     
     
     public List<Usuario> CargarUsuarios(String pathFile){
        List<Usuario> usuariosLeidos = new ArrayList<Usuario>();
        try {
            ObjectInputStream input = new ObjectInputStream(
                new FileInputStream(pathFile));
             usuariosLeidos = (List<Usuario>) input.readObject();
            input.close();
        } catch(FileNotFoundException e){
            System.out.println("Archivo Usuarios no Enontrado");
        } catch(Exception e){
            System.out.println(e);
        }
        return usuariosLeidos;
    }
     
     public List<Persona> CargarPersonas(String pathFile){
        List<Persona> personasLeidas = new ArrayList<Persona>();
        try {
            ObjectInputStream input = new ObjectInputStream(
                new FileInputStream(pathFile));
             personasLeidas = (List<Persona>) input.readObject();
            input.close();
        } catch(FileNotFoundException e){
            System.out.println("Archivo Libros no Enontrado");
        } catch(Exception e){
            System.out.println(e);
        }
        return personasLeidas;
    }
    

    
    
    
}
