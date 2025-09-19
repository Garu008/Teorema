package com.Ercilla;

public class HolaMundo {

    public static void main(String[] args){
        Mensaje msg = new Mensaje();
        String  nombre = msg.SolicitarDatos("Escribe tu nombre:");
        String apellidos = msg.SolicitarDatos("Escribe tu apellido:");
        Persona p1 = new Persona(nombre, apellidos);
        msg.saludar(p1);
    }}

