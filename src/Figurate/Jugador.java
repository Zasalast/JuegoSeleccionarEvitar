package Figurate;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jugador extends JPanel {
    JLabel labelVida1 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
    JLabel labelVida2 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
    JLabel labelVida3 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
    JLabel labelVida4 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
    JLabel labelVida5 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
    JLabel LBNivel = new JLabel();
    JLabel LBNombre = new JLabel();
    String pregunta1 = "ADVERTENCIA Evite figura que cambia";
    JLabel labelPregunta = new JLabel();
    JLabel puntos = new JLabel("Puntos=0");
    String Vidas = "4";
    String Nombre = "Zanoni Salas Tobon";
    String NivelActual = "3";
    Random random = new Random();
    int aleatorioAnterior = -1, cont = 0,NivelActual2 = 1;

    public int getNivelActual2() {
        return NivelActual2;
    }

    public void setNivelActual2(int NivelActual2) {
        this.NivelActual2 = NivelActual2;
    }
    public Jugador() {
        setLayout(null);
        setBackground(Color.GREEN);
        labelVida1.setBounds(490, 0, 26, 26);
        labelVida2.setBounds(518, 0, 26, 26);
        labelVida3.setBounds(546, 0, 26, 26);
        labelVida4.setBounds(574, 0, 26, 26);
        labelVida5.setBounds(602, 0, 26, 26);

        LBNivel.setText("Nivel: " + NivelActual);
        LBNivel.setBounds(0, 40, 250, 20);
        LBNivel.setForeground(Color.red);
        LBNombre.setText("Jugador: " + Nombre);
        LBNombre.setBounds(0, 0, 250, 20);
        LBNombre.setForeground(Color.red);
        puntos.setBounds(0, 20, 100, 20);
        puntos.setForeground(Color.red);

        SacarPreguntaAleatoria();

        add(labelVida1);
        add(labelVida2);
        add(labelVida3);
        add(labelVida4);
        add(labelVida5);
        add(puntos);
        add(LBNivel);
        add(LBNombre);
//        add(cronometro);
        add(labelPregunta);
    }

    void SacarPreguntaAleatoria() {
        if (NivelActual.equals("1")) {
            labelPregunta.setText(pregunta1);
   
        }else if (NivelActual.equals("2")) {
            labelPregunta.setText(pregunta1);
        }else if (NivelActual.equals("3")) {
            labelPregunta.setText(pregunta1);
        }else if (NivelActual.equals("4")) {
            labelPregunta.setText(pregunta1);
        }else{ }
        
    }

    public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public JLabel getPuntos() {
        return puntos;
    }

    public void setPuntos(JLabel puntos) {
        this.puntos = puntos;
    }

    public String getVidas() {
        return Vidas;
    }

    public void setVidas(String Vidas) {
        this.Vidas = Vidas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNivelActual() {
        return NivelActual;
    }

    public void setNivelActual(String NivelActual) {
        this.NivelActual = NivelActual;
    }

}
