/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fe.iu.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ernst
 */
public class VentanaSwing extends JFrame{
    private FlowLayout layout;
    private JTextField cuadroTexto;

    public VentanaSwing() throws HeadlessException {
        this.setTitle("Mi ventana Swing");
        this.setSize(300,220);
        this.setVisible(true);
        layout = new FlowLayout();
        this.setLayout(layout);
        cuadroTexto = new JTextField(15);
        this.getContentPane().add(cuadroTexto);
        this.validate();
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ((JFrame)e.getSource()).setVisible(false);
            }
            
        });
    }
    
    
}
