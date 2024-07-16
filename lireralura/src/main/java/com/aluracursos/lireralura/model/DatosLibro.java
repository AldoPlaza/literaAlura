package com.aluracursos.lireralura.model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        @JsonAlias("title") String titulo,

        @JsonAlias("authors") List<DatosAutor> autor,
       @JsonAlias("languages") List idiomas,
        @JsonAlias("download_count")Integer descargas
) {



}
