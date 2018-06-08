
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
class Peliculas {

    private String id;
    private String nombre;
    private String categoria;
    private ArrayList idiomas = new ArrayList();
    private ArrayList subs = new ArrayList();
    private int duracion;
    private int rating;
    private ArrayList comentarios = new ArrayList();
    private String productora;
    private String director;
    private ArrayList actores = new ArrayList();

    public Peliculas() {
    }

    public Peliculas(String id, String nombre, String categoria, int duracion, int rating, String productora, String director) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
        this.rating = rating;
        this.productora = productora;
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Peliculas{" + "id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", idiomas=" + idiomas + ", subs=" + subs + ", duracion=" + duracion + ", rating=" + rating + ", comentarios=" + comentarios + ", productora=" + productora + ", director=" + director + ", actores=" + actores + '}';
    }
    
}
