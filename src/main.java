
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Miguel Gonz-alez García
 */
public class main {
    
    
    public static void leerfichero(ArrayList lista, String fichero) throws FileNotFoundException, IOException{
        FileReader f = new FileReader(fichero);
        BufferedReader b = new BufferedReader(f);
        String cadena;
        while((cadena = b.readLine())!=null) {
            lista.add(cadena);
    }
    };

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> listaidiomas = new ArrayList<>();
        leerfichero(listaidiomas, "idiomas.txt");
        ventana vent = new ventana(listaidiomas);
        vent.setVisible(true);
    }
    
}
