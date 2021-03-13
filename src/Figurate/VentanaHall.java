package Figurate;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaHall extends JFrame implements ActionListener {

    private Fondo fondo;
    JLabel Texto;
    JButton Comenzar, siguienteNivel;
    Ventana b;
    Nivel2 b2;
    Jugador J;
private int con=1;
    VentanaHall() {
        this.setLayout(null);
        this.setTitle("Figurate ");
        this.setBounds(40, 40, 600, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        fondo = new Fondo();

        Comenzar = new JButton("1");
        ImageIcon x = new ImageIcon("src\\Imagenes\\Empezar.png");
        Comenzar.setIcon(x);
        Comenzar.setBounds(200, 10, 70, 65);
        Comenzar.setBackground(Color.WHITE);
        Comenzar.addActionListener(this);
        siguienteNivel = new JButton("2");
        ImageIcon a = new ImageIcon("src\\Imagenes\\NEXTLEVEL.jpg");
        siguienteNivel.setIcon(a);
        siguienteNivel.setBounds(290, 10, 120, 65);
        siguienteNivel.setBackground(Color.WHITE);
        siguienteNivel.addActionListener(this);

        getContentPane().add(Comenzar);
        getContentPane().add(siguienteNivel);
        getContentPane().add(fondo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "1":
                b = new Ventana(2);
                con++;
                dispose();
                break;
            case "2":
//                if (J.getNivelActual() == "2") {
//                    b = new Ventana(2);
//                   dispose();
//                } else if (J.getNivelActual() == "3") {
//                    b = new Ventana(3);
//                   dispose();
//                } else if (J.getNivelActual() == "4") {
//                    b = new Ventana(4);
//                    dispose();
//                } else {
//                    b = new Ventana(5);
//                    dispose();
//                }
//                b = new Ventana(2);
                b = new Ventana(Integer.parseInt(J.getNivelActual()));
                dispose();
               
                break;
        }
    }
}
