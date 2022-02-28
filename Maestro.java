/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalretocinco;

/**
 *
 * @author esqui
 */
public class Maestro extends UsuarioBase implements IUsuario{
    //esta clase, su interfáz es de IUsuario y es heredada de UsuarioBase
    Maestro(double iD, String nombre, String apellido, String correoElectrónico){
        super(iD, nombre, apellido, correoElectrónico);    
    }
    //Se que no es de buena prácticar acceder a las variables con el operador 
    //punto, sin embargo, me limité a crear mas métodos de acuerdo a las
    //especificaciones del proyecto (la cantidad de métodos)
    
    
    @Override   
    public void imprimirPerfil(){        
       System.out.println("ID: " + this.iD + "- El maestro " + this.nombre + " " +  this.apellido + ", cuyo correo es: " + this.correoElectrónico);
    }
    
    @Override
    public void mostrarCalificaciones(){
        //Nothing to do
    }
       @Override
    public void guardarCalificaciones(double calificacion){
        //Nothing to do
    }   
}
