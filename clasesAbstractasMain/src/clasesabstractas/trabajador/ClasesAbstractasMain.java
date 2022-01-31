/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesabstractas.trabajador;

/**
 *
 * @author adhara
 */
public class ClasesAbstractasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario[] usuarios = new Usuario [2];
        usuarios[0] = new Trabajador("Omar", 37000, 2007,05,12);
        usuarios[1] = new Alumno("Joana", "Java POO");
        
        for (Usuario i : usuarios){
            System.out.println(i.getNombre() + ", " + i.getDescripcion());
            //ante el comportamiento diferenciado entre el metodo abstracto de Alumno y Trabajador,
            //imprime tecto diferente al llamar al metodo
        }
      
    }
    
}
