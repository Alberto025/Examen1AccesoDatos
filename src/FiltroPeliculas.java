import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FiltroPeliculas {
    public static void main(String[] args) {

        String archivoCSV = "C:/Users/AlbertoLópezCabello/IdeaProjects/ExamenAccesoDatos/peliculas.csv";

        try {
            File archivoCSVFile = new File(archivoCSV);
            if (!archivoCSVFile.exists()) {
                System.err.println("El archivo CSV no existe: " + archivoCSV);
                return;
            }
            // Leer las películas del archivo CSV
            List<String[]> peliculas = leerCSV(archivoCSV);

        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static List<String[]> leerCSV(String rutaArchivoCSV) throws IOException {
        List<String[]> peliculas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en columnas separadas por comas
                String[] datos = linea.split(",");
                // Validar que se tienen todos los campos requeridos
                if (datos.length != 5) {
                    System.err.println("Datos incompletos en la línea: " + linea);
                    continue; // Saltar a la siguiente línea si los datos son incorrectos
                }
                peliculas.add(datos);
            }
        }
        return peliculas;
    }
    public void filtrarPorAño(Integer año){
        try (BufferedReader bfr=new BufferedReader(FileReader(archivoCSV))){

        }


    }
    

    }




