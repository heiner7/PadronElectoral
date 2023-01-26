/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padronelectoral;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Heiner
 */
public class Archivo {
    
    //lectura de datos
    String s;
    BufferedReader entrada;//aqui se obtiene el archivo
    String Cedula;
    String Genero;
    String Caducidad;
    String Provincia;       
    String Nombre;
    String primerApe;
    String segundoApe;
    ArrayList<Padron> Padron = new ArrayList<>();//Donde se guarda los datos del archivo
    
    Archivo(){
        try {
             entrada = new BufferedReader(new FileReader("PUp.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public ArrayList<Padron> leer() {
        
        try {
            //Se lee cada linea del archivo y termina hasta que sea nulo y la 
            //linea se pasa a la variable s      
            if ((s = entrada.readLine()) != null) {
                
                String[] informacion = s.split(",");
                Cedula = informacion[0];
                Provincia = informacion[1];
                Genero = informacion[2];
                Caducidad = informacion[3];
                Nombre = informacion[5];
                primerApe = informacion[6];
                segundoApe = informacion[7];
                
                Padron objProducto = new Padron(Cedula,Provincia,Genero,Caducidad,
                                                 Nombre,primerApe,segundoApe);             
                Padron.add(objProducto);
                //Se llama el archivo mientras se cumpla la condicion del if
                leer();
            }
            
            entrada.close();
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "El Producto no se encuentra en la Base");
        }
        //se devuelve como resultado el arraylist
        return Padron;
    }
    
}
