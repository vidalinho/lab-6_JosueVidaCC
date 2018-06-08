
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
public class Usuario {

    private String correo;
    private String contra;
    private int fecha;
    private ArrayList<Peliculas> pelis = new ArrayList();
    private ArrayList<Series> serie = new ArrayList();

    public Usuario() {
    }

    public Usuario(String correo, String contra, int fecha) {
        this.correo = correo;
        this.contra = contra;
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Peliculas> getPelis() {
        return pelis;
    }

    public void setPelis(ArrayList<Peliculas> pelis) {
        this.pelis = pelis;
    }

    public ArrayList<Series> getSerie() {
        return serie;
    }

    public void setSerie(ArrayList<Series> serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", contra=" + contra + ", fecha=" + fecha + ", pelis=" + pelis + ", serie=" + serie + '}';
    }

}
