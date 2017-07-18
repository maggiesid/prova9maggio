package com.example.margheritasidoti.a9maggio;

/**
 * Created by margheritasidoti on 12/06/17.
 */

public class Persona {

    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return nome.equals(persona.nome);

    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
