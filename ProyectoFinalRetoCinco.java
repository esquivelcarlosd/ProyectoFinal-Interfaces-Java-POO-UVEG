/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

        
package proyectofinalretocinco;
import java.util.Scanner;

/**
 *
 * @author esqui
 */
public class ProyectoFinalRetoCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcionSeleccionada;
        // TODO code application logic here
        //creamos los objetos maestro, alumno y tutor
        Maestro maestro = new Maestro(22, "Carlos", "Esquivel", "esquiveluveg@uveg.com");
        Alumno alumno = new Alumno(12, "Edgar", "Guzman", 9.8, "edgaruveg@uveg.com");
        Tutor tutor = new Tutor(72, "Armando", "Casas", "armandouveg@uveg.com", alumno.nombreAlumno, alumno.apellidoAlumno, alumno.calificacion);
        //creamos un menú con ayuda del comando
        System.out.println("Bienvenido a la base de datos de la escuela Río Grande!");
        do{
           System.out.println("------¿Qué usuario desea consultar?------------------ "); 
           System.out.println("----------Elija una opción-----------------");
           System.out.println("           1)Consultar Maestro.");
           System.out.println("           2)Consultar Alumno.");
           System.out.println("           3)Consultar Tutor.");
           System.out.println("-----Para salir, escriba cualquier otro número-------");
           
           //Creamos un objeto de tipo Scanner para asignarle la opción
           Scanner scanner = new Scanner(System.in);
           opcionSeleccionada = scanner.nextInt();
           
           switch(opcionSeleccionada){
               case 1:
                   maestro.imprimirPerfil();
                   break;
               case 2:
                   alumno.imprimirPerfil();
                   alumno.mostrarCalificaciones();
                   alumno.guardarCalificaciones(alumno.calificacion);
                   break;
               case 3:
                   tutor.imprimirPerfil();
                   tutor.mostrarCalificaciones();
                   break;
               default:
                   System.out.println("!Hasta pronto!");
                   System.out.println("Developed by Carlos Esquivel D");                   
           }           
        }while(opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 );
        
        
        
    }
    
}
