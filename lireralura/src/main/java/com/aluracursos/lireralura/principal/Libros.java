package com.aluracursos.lireralura.principal;

import com.aluracursos.lireralura.model.DatosAutor;
import com.aluracursos.lireralura.model.DatosLibro;
import com.aluracursos.lireralura.model.DatosLibroAutor;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

@Table(name= "libros")
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String titulo;
    private ArrayList autor;
    private ArrayList idiomas;
    private Integer descargas;
    private String anonacimiento;
    private String anofallecimiento;





    public Libros(DatosLibro datosLibro){
       this.titulo=datosLibro.titulo();
        this.autor=(ArrayList)datosLibro.autor();
        this.idiomas= (ArrayList) datosLibro.idiomas();
        this.descargas=datosLibro.descargas();

    }

    public Libros(DatosLibroAutor datosR) {


        this.titulo= String.valueOf(datosR.datosR());
    }

    /*public Libros(DatosAutor datosAutor){
         this.anonacimiento= String.valueOf(datosAutor.anonacimiento());
         this.anofallecimiento= String.valueOf(datosAutor.anofallecimiento());
    }*/



    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList getAutor() {
        return autor;
    }

    public void setAutor(ArrayList autor) {
        this.autor = autor;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getDescargas() {
        return descargas;
    }

    public void setDescargas(Integer descargas) {
        this.descargas = descargas;
    }

    public String getAnonacimiento() {
        return anonacimiento;
    }

    public void setAnonacimiento(String anonacimiento) {
        this.anonacimiento = anonacimiento;
    }

    public String getAnofallecimiento() {
        return anofallecimiento;
    }

    public void setAnofallecimiento(String anofallecimiento) {
        this.anofallecimiento = anofallecimiento;
    }


    @Override
    public String toString() {
        return
                "Id=" + Id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idiomas='" + idiomas + '\'' +
                ", descargas=" + descargas +
                ", anonacimiento='" + anonacimiento + '\'' +
                ", anofallecimiento='" + anofallecimiento ;
    }
}
