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
public class Alumno extends Persona implements Matricular{
    
    private int nota = 10;
    private int[] notas = new int[5];

    //Constructor del padre
    public Alumno(String nombre, int edad, char sexo,int nota) {
        super(nombre, edad, sexo); //Constructor del padre
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    //Método para el solo que no ve Maestro
    public void aprobar(int[] notas){
        this.notas = notas;
    }
    
    
    @Override
    public void saludar(){
        System.out.println("Hola soy un alumno");
    }
    
    /*Llamo desde el hijo a un método comun que tiene el padre desde el hijo*/
    public void calcularMiNota(int[] notas){
        notas[0] = super.dameNota() + 10; //Utilizo super. para llamar a un método del padre
    }

    @Override
    public void nacer(int dia) {
        System.out.println("Soy un alumno");
    }

    @Override
    public int apuntarAsignatura(int nota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void asistenciaClase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
