/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf4_c03;

/**
 *
 * @author dmorenoar
 */
public abstract class Persona {

    private String nombre = "";
    private int edad = 0;
    private char sexo = 'U';
    private int dni = 00000000;
  
        
    
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    public void saludar(){
        System.out.println("Holaaaa, soy una Persona");
    }
    
    public int dameNota(){
        return 11; //Podría ser una operación 
    }
    
    public abstract void nacer(int dia);
    
}
