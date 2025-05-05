package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro guardarLibro(Libro libro){
        return libroRepository.guardarLibro(libro);
    }
    public Libro actualizarLibro(Libro libro){
        return libroRepository.actualizarLibro(libro);
    }
    public String eliminarLibro(int id){
        libroRepository.eliminarLibro(id);
        return "Libro eliminado correctamente";
    }
    public Libro buscarPorId(int id){
        return libroRepository.buscarPorId(id);
    }
    public Libro buscarPorIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }


}
