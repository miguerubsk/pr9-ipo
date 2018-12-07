
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguerubsk
 */
public class ventana extends JFrame {
    
    public static void leerfichero(ArrayList lista, String fichero) throws FileNotFoundException, IOException{
        FileReader f = new FileReader(fichero);
        BufferedReader b = new BufferedReader(f);
        String cadena;
        while((cadena = b.readLine())!=null) {
            lista.add(cadena);
    }
    };

    public ventana() throws IOException {
        super("Internacionalización");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        ArrayList<String> listaidiomas = new ArrayList<>();
        leerfichero(listaidiomas, "idiomas.txt");
        
        
        
        JComboBox idioma;
        idioma = new JComboBox();
        idioma.setModel(new DefaultComboBoxModel(listaidiomas.toArray()));
        
        idioma.addActionListener(idioma);
        
        idioma.getSelectedItem();
        String rutaTextos = idioma.getSelectedItem()+".txt";
        
        ArrayList<String> textos = new ArrayList<>();
        leerfichero(textos, rutaTextos);
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel(textos.get(0));
        JButton boton = new JButton(textos.get(1)); 
        cp.add(etiqueta);
        cp.add(idioma);
        cp.add(boton);
    }
} 

