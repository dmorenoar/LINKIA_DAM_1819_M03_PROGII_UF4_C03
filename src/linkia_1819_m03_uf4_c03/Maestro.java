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
public class Maestro extends Persona{
   
    /*Siempre tendremos que utilizar en las subclases el constructor del padre
    Y encima debe ser lo primero que hagamos en nuestro constructor HIJO
    */
    
    private int sueldo = 0;
    private int dept = 2;
    
    //EL CONSTRUCTOR REFINA EL COMPORTAMIENTO DEL CONSTRUCTOR DEL PADRE
    //PODRE USAR LOS ATRIBUTOS DE MI SUPERCLASE Y ADEMAS PONERLE LOS MIOS
    public Maestro(int sueldo){
        super("Dani",31,'M');
        this.sueldo = sueldo;
    }
    
    //Según los atributos el super al padre nos diferenciará entre un constructor o otro
    public Maestro(int sueldo, int dept){
        super("Mar", 4);
        this.sueldo = sueldo;
        this.dept = dept;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    //Método para el solo
    public void cobrar() {
        System.out.println("Voy a cobrar!!!");
    }

    /*La clase padre Persona me obliga a heredar este método y a
    implementar su funcionalidad*/
    @Override
    public void nacer(int dia) {
        System.out.println("Soy un maestro");
    }
    
}
