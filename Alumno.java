/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalretocinco;

/**
 *
 * @author esqui
 */
public class Alumno extends UsuarioBase implements IUsuario{
    
    Alumno(double iD, String nombreAlumno, String apellidoAlumno, double calificacion, String correoElectrónico){
        super(iD, nombreAlumno, apellidoAlumno, calificacion, correoElectrónico);        
    }    
     //Se que no es de buena prácticar acceder a las variables con el operador 
    //punto, sin embargo, me limité a crear mas métodos de acuerdo a las
    //especificaciones del proyecto (la cantidad de métodos)
    
    
    @Override   
    public void imprimirPerfil(){        
       System.out.println("ID: " + this.iD + " - El alumno " + this.nombreAlumno + " " +  this.apellidoAlumno + ", cuyo correo es: " + this.correoElectrónico);
    }
    @Override
    public void mostrarCalificaciones(){
        System.out.println("La calificación del alumno: " + this.nombreAlumno + " es de: " + this.calificacion);
    }
    @Override
    public void guardarCalificaciones(double calificacion){
        System.out.println("Se guardó la siguiente calificación: " + this.calificacion);
        
    }
   
    
}
