package com.ercilla;

public record PersonaRegistro(String nombre, String apellidos) {
    public String toString(){
        //Pepe ha escrito el código inservible
        //System.out.println("Esta instrucción es inservible");
        return "%s %s" .formatted(nombre, apellidos);
    }
}
