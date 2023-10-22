package Ejercicio1;

import java.util.ArrayList;

public class Encuesta {
    private ArrayList<String> preguntas;
    private Persona personaEncuestada;
    private Empleado empleadoQueRealizoEncuesta;

    public Encuesta(ArrayList<String> preguntas,Persona persona,Empleado empleado){
        this.preguntas=new ArrayList<>(preguntas);
        this.personaEncuestada=persona;
        this.empleadoQueRealizoEncuesta=empleado; 
    }

    public void addPreguntas(String pregunta){
        this.preguntas.add(pregunta);
    }

    public ArrayList<String> getPreguntas(){
        return this.preguntas;
    }

    public boolean personaRespondioEncuesta(Persona p){
        if(p.getDni()==personaEncuestada.getDni()){
            return true;
        }
        return false;
    }

    public int cantEncuestasRealizadasPorEmpleado(Empleado e){ //Determina la cantidad de encuesta realizadas por empleado
        int cantEncuestasRealizadas=0;
        if(empleadoQueRealizoEncuesta.getNombre()==e.getNombre()){
            cantEncuestasRealizadas++;
        }
        return cantEncuestasRealizadas;
    }

    public Persona getPersonaEncuestada() {
        return personaEncuestada;
    }

    public void setPersonaEncuestada(Persona personaEncuestada) {
        this.personaEncuestada = personaEncuestada;
    }

    public Empleado getEmpleadoQueRealizoEncuesta() {
        return empleadoQueRealizoEncuesta;
    }

    public void setEmpleadoQueRealizoEncuesta(Empleado empleadoQueRealizoEncuesta) {
        this.empleadoQueRealizoEncuesta = empleadoQueRealizoEncuesta;
    }

    
}
