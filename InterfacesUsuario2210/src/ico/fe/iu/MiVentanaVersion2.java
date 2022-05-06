/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fe.iu;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.MouseInfo;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.MouseInputListener;


/**
 *
 * @author ernst
 */
public class MiVentanaVersion2 extends Frame {
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadroTexto;
    private Label etiqueta;
   
            
    public MiVentanaVersion2() throws HeadlessException{
        setTitle("Mi ventana");
        setSize(300,200);
        layout=new FlowLayout();
        boton1=new Button("Saludar");
        cuadroTexto = new TextField(15);
        etiqueta = new Label("Valor inicial");
     
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
           etiqueta.setText("Hola" + cuadroTexto.getText());
                System.out.println("X=" + e.getX());
                System.out.println("Y=" + e.getY());
                System.out.println("Que boton?" + e.getButton());
               
            }
            
        });
               this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
               
            }
            
        });
         this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Enter code:"+KeyEvent.VK_ENTER);
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        System.out.println("Se dió enter");
                        break;
                    default:
                       System.out.println("Tecla:" + e.getKeyChar());    
                
                        
                }
            }
            
        });
        this.add(cuadroTexto);
        this.add(etiqueta);
        this.add(boton1);
        setVisible(true);
    }
    
}
