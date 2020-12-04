/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsonejemplo;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class GsonEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serializar();
        
        System.out.println("-----------------------");
        
        deserializar();
        
        System.out.println("------------------------");
        
        deserializarArchivo();
    }
    
    public static void serializar(){
        Persona persona = new Persona("Pedro",30,"Mecanico");
        
        Gson gson = new Gson();
        String personaJson = gson.toJson(persona);
        System.out.println(personaJson);
    }
    
    public static void deserializar(){
        String jsonPersona = "{'nombre':'Juan','edad':50,'ocupacion':'Carpintero'}";
        
        Gson gson = new Gson();
        Persona persona = gson.fromJson(jsonPersona, Persona.class);
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getOcupacion());
    }
    
    public static void deserializarArchivo(){
        try {
            Reader myReader = Files.newBufferedReader(Paths.get("C:\\Users\\ruben\\OneDrive\\Documentos\\NetBeansProjects\\GsonEjemplo\\Personas.json"));
             
            Gson gson = new Gson();
            
            Map <?,?> personaMap = gson.fromJson(myReader, Map.class);
            
            System.out.println(personaMap.get("nombre"));
            System.out.println(personaMap.get("edad"));
            System.out.println(personaMap.get("ocupacion"));
            
            } catch (IOException ex) {
            Logger.getLogger(GsonEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
