package com.ercilla;

public record PersonaRegistro(String nombre, String apellidos) {
    public String toString(){
        //Jai 
        System.out.println("Esta instrucción es inservible");
        return "%s %s" .formatted(nombre, apellidos);
    }
}
