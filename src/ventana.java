
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macosx
 */
public class ventana extends JFrame {

    public ventana(ArrayList<String> listaidiomas) {
        super("Titulo de ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Idioma: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Aplicar"); 
        String[] idiomas = {listaidiomas.get(0), listaidiomas.get(1)};
        JComboBox idioma;
        idioma = new JComboBox(idiomas);
        cp.add(etiqueta);
        cp.add(idioma);
        cp.add(boton);
    }
} 

