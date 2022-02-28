/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalretocinco;

/**
 *
 * @author esqui
 */
public class Tutor extends UsuarioBase implements IUsuario{
    
   Tutor(double iD, String nombre, String apellido, String correoElectrónico,  String nombreAlumno, String apellidoAlumno, double calificacion ){
       super(iD, nombre, apellido, correoElectrónico, nombreAlumno, apellidoAlumno, calificacion);       
    }
    //Se que no es de buena prácticar acceder a las variables con el operador 
    //punto, sin embargo, me limité a crear mas métodos de acuerdo a las
    //especificaciones del proyecto (la cantidad de métodos)
    @Override
    public void imprimirPerfil(){
        System.out.println("ID: " + this.iD + " - El tutor " + this.nombre + " " +  this.apellido + ", cuyo correo es: " + this.correoElectrónico);
        //code
    }
    
    @Override
    public void mostrarCalificaciones(){
        System.out.println("La calificación del alumno " + this.nombreAlumno + " " + this.apellidoAlumno + " es: " + this.calificacion);  
    }
       @Override
    public void guardarCalificaciones(double calificacion){}   
}
