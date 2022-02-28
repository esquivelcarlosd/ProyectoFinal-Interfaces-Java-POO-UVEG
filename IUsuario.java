/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectofinalretocinco;

/**
 *
 * @author esqui
 */
public interface IUsuario {
    //Declaramos los tres métodos abstractos que serán usados por las clases
    //Maestro, Alumno y Tutor
    public void imprimirPerfil();
    public void mostrarCalificaciones();
    public void guardarCalificaciones(double calificacion);
    
}
