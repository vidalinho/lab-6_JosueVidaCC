
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josue
 */
public class AdminUsuario {

    private ArrayList<Usuario> listaPersonas = new ArrayList();
    private File archivo = null;

    public AdminUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Usuario> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Personas=" + listaPersonas;
    }

    //extra mutador
    public void setPersona(Usuario p) {
        this.listaPersonas.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : listaPersonas) {
                bw.write(t.getCorreo() + ";");
                bw.write(t.getContra() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getTarjeta() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int c, a, fecha, tarjeta;
                    String n;
                    String categoria, productora, director, correo, contra;

                    int duracion, rating;
                    ArrayList<Peliculas> temp = new ArrayList();
                    correo = sc.next();
                    contra = sc.next();
                    fecha = sc.nextInt();
                    tarjeta = sc.nextInt();
                    listaPersonas.add(new Usuario(correo, contra, fecha, tarjeta));

                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }

    void setUsuario(Usuario p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
