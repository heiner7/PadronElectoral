/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padronelectoral;

/**
 *
 * @author Heiner
 */
public class Padron {
    
    private String Cedula;
    private String Genero;
    private String Caducidad;
    private String Nombre;
    private String primerApe;
    private String segundoApe;
    private String Provincia;

    Padron(String cedula,String provicia, String genero, String caducidad, String nombre, String primerApe, String segundoApe) {
        this.Cedula = cedula;
        this.Provincia = provicia;
        this.Genero = genero;
        this.Caducidad = caducidad;
        this.Nombre = nombre;
        this.primerApe = primerApe;
        this.segundoApe = segundoApe;
    }
    
    Padron(){
        
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(String Caducidad) {
        this.Caducidad = Caducidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimerApe() {
        return primerApe;
    }

    public void setPrimerApe(String primerApe) {
        this.primerApe = primerApe;
    }

    public String getSegundoApe() {
        return segundoApe;
    }

    public void setSegundoApe(String segundoApe) {
        this.segundoApe = segundoApe;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    
}
