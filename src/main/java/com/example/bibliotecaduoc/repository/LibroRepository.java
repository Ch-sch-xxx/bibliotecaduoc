package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //esto es para que se encuentre en el contexto de spring y se pueda usar en la clase principal
public class LibroRepository {


    private List<Libro> listalibros = new ArrayList<>();
    //metodo que crea una lista de libros vacia
    public List<Libro> obtenerLibros(){
        return listalibros; //metodo que retorna la lista de libros creada
    }



    public Libro buscarPorId(int id){ //Metodo que busca un libro por su id
        for (Libro l : listalibros) {
            if (l.getId() == id) {
                return l;
            }
        }
        return null;
    }

    public Libro buscarPorIsbn(String isbn){ //Metodo que busca un libro por su isbn
        for (Libro l : listalibros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }



    public Libro guardarLibro(Libro lib){ //Metodo que guarda un libro en la lista de libros
        listalibros.add(lib);
        return lib;
    }

    public Libro actualizarLibro(Libro libro) { //Metodo que actualiza un libro en la lista de libros
        Libro libroA_actualizar = buscarPorId(libro.getId());
        if (libroA_actualizar != null) {
            libroA_actualizar.setAutor(libro.getAutor());
            libroA_actualizar.setEditorial(libro.getEditorial());
            libroA_actualizar.setFechaPublicacion(libro.getFechaPublicacion());
            libroA_actualizar.setIsbn(libro.getIsbn());
            libroA_actualizar.setTitulo(libro.getTitulo());
        }
        return libroA_actualizar;
    }

    public void eliminarLibro(int id) {
        Libro libroA_eliminar = buscarPorId(id);
        if (libroA_eliminar != null) {
            listalibros.remove(libroA_eliminar);
        }
    }

}
