package Clases;

import Vistas.*;
import java.util.ArrayList;
import java.util.List;


public class ServicioBiblioteca {
    
    public List<Usuario> usuarios = new ArrayList<Usuario>();
    public List<Persona> personas = new ArrayList<Persona>();
    
    private final String PATH_FILE_USUARIOS = "C:\\Users\\USER\\Documents\\NetBeansProjects\\ServicioBiblioteca\\usuariosGuardadas.bin";
    private final String PATH_FILE_PERSONAS = "C:\\Users\\USER\\Documents\\NetBeansProjects\\ServicioBiblioteca\\personasGuardadas.bin";
    
    
    public static void main(String[] args) {
        ServicioBiblioteca controladorPrincipal = new ServicioBiblioteca();
        controladorPrincipal.personasDefault();
        controladorPrincipal.usuariosDefault();
        controladorPrincipal.guardarArchivos();
        controladorPrincipal.cargarArchivos();
        //controladorPrincipal.imprimeInfo();
        
        java.awt.EventQueue.invokeLater(() -> {
            new ServicioBibliotecaGrafico(controladorPrincipal.usuarios,
                controladorPrincipal.personas).setVisible(true);
        });
               
        
    }
    
    private void usuariosDefault(){
        Usuario usuario1 = new Usuario(202068295,"Sorestbug","juan.hernandezfl@alumno.buap.mx",true,false);
        Usuario usuario2 = new Usuario(201945635,"Roxas","alexa.perezpl@alumno.buap.mx",false,false);
        Usuario usuario3 = new Usuario(202185678,"Piezatoon","enrique.durango@alumno.buap.mx",false,false);

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
    }
    
    private void personasDefault(){
        Persona persona1 = new Persona("Sorestbug","Ada Lovelace","Fue la primera programadora de la historia. Amante de las matemáticas y de las ciencias, descubrió un lenguaje de programación cuyos aportes marcaron precedentes dentro de la informática. Estados Unidos creó un lenguaje que bautizó como Ada en su honor. Se la conoce como la “madre de la computación”. Se dice que Lovelace detectó el primer “bug” de la informática en su máquina. ",true,"09/05/2023");
        Persona persona2 = new Persona("Roxas","Hedy Lemarr","Es una estrella del cine clásico de Hollywood. Además de esto, desde pequeña Hedy destacó por su inteligencia y fue considerada por sus profesores como superdotada. Fue Lemarr la responsable de crear el espectro ensanchado por salto de frecuencia, que sirvió como base, para desarrollar tecnologías como el Bluetooth, el GPS y las conexiones WiFi.",true,"10/05/2023");
        Persona persona3 = new Persona("Piezatoon","Jude Milhon","Mejor conocida en la red por su pseudónimo St. Jude, era una famosa hacker y defensora de los derechos personales en internet. Fue la autora del término ciberpunk, y miembro fundador del grupo con el mismo nombre. Programadora, escritora, rebelde, defensora de los ciberderechos.",true,"11/05/2023");
        
        
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        
    }
    

    private void imprimeInfo(){
        
        System.out.println("Usuarios en el Sistema");
        this.usuarios.stream().forEach(u -> System.out.println(u.toString()));
        
        System.out.println("\n Personas en el Sistema");
        this.personas.stream().forEach(l -> System.out.println(l.toString()));
        
        
        
    }
    
    private void guardarArchivos(){
         GeneradorArchivos genA = new GeneradorArchivos();
        if(genA.GuardarUsuarios(this.usuarios, PATH_FILE_USUARIOS)) {
            System.out.println("Se guardaron correctamente los Usuarios");
            
        } else {
            System.out.println("No se guardaron correctamente los Usuarios");
        }

        if(genA.GuardarPersonas(this.personas, PATH_FILE_PERSONAS)) {
            System.out.println("Se guardo correctamente las Personas");
            
        } else {
            System.out.println("No se guardaron correctamente las personas");
        }
        
       
        
    }
    
    private void cargarArchivos(){
        GeneradorArchivos genA = new GeneradorArchivos();
        this.usuarios = genA.CargarUsuarios(PATH_FILE_USUARIOS);
        this.personas = genA.CargarPersonas(PATH_FILE_PERSONAS);
    }
    
}
