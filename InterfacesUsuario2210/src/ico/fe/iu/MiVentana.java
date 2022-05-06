/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fe.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseListener;
import javax.swing.event.MouseInputListener;


/**
 *
 * @author ernst
 */
public class MiVentana extends Frame implements MouseListener{
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadroTexto;
    private Label etiqueta;
   
            
    public MiVentana() throws HeadlessException{
        setTitle("Mi ventana");
        setSize(300,200);
        layout= new FlowLayout();
        boton1=new Button("Saludar");
        cuadroTexto = new TextField(15);
        etiqueta = new Label("Valor inicial");
     
        this.boton1.addMouseListener(this);
        this.add(cuadroTexto);
        this.add(etiqueta);
        this.add(boton1);
        setVisible(true);
    }
    
}
