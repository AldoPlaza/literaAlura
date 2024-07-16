package com.aluracursos.lireralura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
        @JsonAlias("birth_year") Integer anonacimiento,
        @JsonAlias("death_year") Integer anofallecimiento,
        @JsonAlias("name") String nombre
) {

}
