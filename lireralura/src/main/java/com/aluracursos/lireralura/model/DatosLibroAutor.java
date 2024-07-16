package com.aluracursos.lireralura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibroAutor (
        @JsonAlias("results") List<DatosLibro> datosR,
        @JsonAlias("title") String titulo
) {



}
