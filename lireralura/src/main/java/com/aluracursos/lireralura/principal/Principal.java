package com.aluracursos.lireralura.principal;

import com.aluracursos.lireralura.Repository.LibrosRepository;
import com.aluracursos.lireralura.model.DatosLibro;
import com.aluracursos.lireralura.model.DatosLibroAutor;
import com.aluracursos.lireralura.service.ConsumoAPI;
import com.aluracursos.lireralura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private final String URL_BASE = "https://gutendex.com/books/?search=";

    private ConvierteDatos conversor = new ConvierteDatos();

    private LibrosRepository repositorio;

    public Principal(LibrosRepository repository) {
        this.repositorio = repository;
    }

    //private  final String API_KEY ="&apikey=27cf08d5";
    public void muestraElMenu() {


        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar libro por nombre
                    2 - Buscar libro por lenguaje
                    3 - Buscar libro por palabra clave
                    4 - Buscar libro por tema
                    5 - Mostrar libros mas descargados
                    6 - Mostrar todos los libros por inicial
                    7 - Mostrar libros por autor
                    8 - Listar autores guardados
                    9 - Listar libros guardados
                    10 - Listar libros por autores vivos en determinado año
                    0 - Salir
                     """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    buscarSerieWeb();

                    break;
                case 2:


                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");

            }







        }
    }
    private DatosLibroAutor getDatosLibroAutor(){
        // System.out.println("Imgresa el nombre del libro");

        //var nombreSerie= teclado.nextLine();
        var nombreSerie = "Pride and Prejudice";
        var consumoApi = new ConsumoAPI();
        var json1 = consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "%20"));
        // var json = consumoApi.obtenerDatos("https://gutendex.com/books/");
        DatosLibroAutor datos = conversor.obtenerDatos(json1, DatosLibroAutor.class);






return datos;
    }
    private void buscarSerieWeb() {
        DatosLibroAutor datos = getDatosLibroAutor();
        //datosSeries.add(datos);
        Libros libros = new Libros(datos);
        //repositorio.save(libros);


        System.out.println("intetontitulo:   ");

        System.out.println("Sout del motodo buscar"+datos);
        System.out.println("Sout del motodo buscar"+libros);

    }
}