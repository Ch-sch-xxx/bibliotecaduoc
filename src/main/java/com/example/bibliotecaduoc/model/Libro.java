package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //Este se encarga de generar los get y set, asi como los toString, equals y hashcode, asi como los constructores,
@AllArgsConstructor //Este se encarga de generar el constructor sin argumentos para poder instanciar el objeto desde la clase principal que lo necesita
@NoArgsConstructor //este se encarga de generar el constructor sin argumentos para poder instanciar el objeto desde la clase principal que lo necesita
public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}
