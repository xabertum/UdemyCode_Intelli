package lecture153.laboratorioFinal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos {

  @Override
  public boolean existe (String nombreArchivo) throws AccesoDatosExc {
    File archivo = new File(nombreArchivo);
    return archivo.exists();
  }

  @Override
  public List <Pelicula> listar (String nombreArchivo) throws LecturaDatosExc {
    File archivo = new File(nombreArchivo);
    List<Pelicula> peliculas = new ArrayList();

    try {
      BufferedReader entrada = new BufferedReader(new FileReader(archivo));
      String linea = null;
      linea = entrada.readLine();
      while (linea != null) {
        Pelicula pelicula = new Pelicula(linea);
        peliculas.add(pelicula);
        linea = entrada.readLine();
      }
      entrada.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return peliculas;
  }

  @Override
  public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosExc {
    File archivo = new File(nombreArchivo);
    try {
      PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
      salida.println(pelicula.toString());
      salida.close();
      System.out.println("Se ha escrito correctamente al arcvivo");
    }catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public String buscar(String nombreArchivo, String buscar) throws LecturaDatosExc {
    File archivo = new File(nombreArchivo);
    String resultado = null;
    try {
      BufferedReader entrada = new BufferedReader(new FileReader(archivo));
      String linea = null;
      int i = 0;
      linea = entrada.readLine();
      while (linea !=null) {
        if (buscar != null && buscar.equalsIgnoreCase(linea)) {
          resultado = "Pelicula" + linea + " encontrada en el indice " + i;
          break;
        }
        linea = entrada.readLine();
        i++;
      }
      entrada.close();
    }catch (IOException ex) {
      ex.printStackTrace();
    }

    return resultado;
  }

  @Override
  public void crear(String nombreArchivo) throws AccesoDatosExc {
    File archivo = new File(nombreArchivo);
    try {
      PrintWriter salida = new PrintWriter(new FileWriter(archivo));
      salida.close();
      System.out.println("Se ha creado el archivo correctamente");
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void borrar(String nombreArchivo) throws AccesoDatosExc {
    File archivo = new File(nombreArchivo);
    archivo.delete();
    System.out.println("Se ha borrado el archivo correctamente");
  }
}
