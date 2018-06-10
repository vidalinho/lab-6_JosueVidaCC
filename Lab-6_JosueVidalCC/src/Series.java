
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josue
 */
class Series {

    private int id;
    private String nombre;
    private int temporadas;
    private String categoria;
    private ArrayList idiomas = new ArrayList();
    private ArrayList subs = new ArrayList();
    private int duracion;
    private int rating;
    private ArrayList comentarios = new ArrayList();
    private String productora;
    private String director;
    private ArrayList actores = new ArrayList();

    public Series() {
    }

    public Series(int id, String nombre, int temporadas, String categoria, int duracion, int rating, String productora, String director) {
        this.id = id;
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.categoria = categoria;
        this.duracion = duracion;
        this.rating = rating;
        this.productora = productora;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList getSubs() {
        return subs;
    }

    public void setSubs(ArrayList subs) {
        this.subs = subs;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList comentarios) {
        this.comentarios = comentarios;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList getActores() {
        return actores;
    }

    public void setActores(ArrayList actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
