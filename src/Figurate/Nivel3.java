package Figurate;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

class Nivel3 extends JPanel implements Runnable, MouseListener {

    Thread hiloNumeros = new Thread(this);
    ImageIcon fondo;
    String nombreImagen = "1231", NombreJugador = "1111";
//    Nombre para iimagenes
    String Etivar = "Evitar3.gif", coger1 = "Circulo2.png", coger2 = "Circulo3.png", FIGURAS1 = "Nivel3",FIGURAS2 = "Nivel3";
    int NumeroFondo = 0, yTerminado = 600, NVidas = 5, yNombre = 300;
    Jugador J;
    Ventana vi;

    boolean SiguientePrueba = false, MostrarNivel = false;

    ImageIcon IMA1 = new ImageIcon(getClass().getResource("/" + FIGURAS2 + "/" + coger1));
    ImageIcon IMA2 = new ImageIcon(getClass().getResource("/" + FIGURAS2 + "/" + coger1));
    ImageIcon IMA3 = new ImageIcon(getClass().getResource("/" + FIGURAS2 + "/" + coger1));
    ImageIcon IMA4 = new ImageIcon(getClass().getResource("/" + FIGURAS2 + "/" + coger1));
    ImageIcon IMA5 = new ImageIcon(getClass().getResource("/" + FIGURAS2 + "/" + coger2));
    ImageIcon IMA6 = new ImageIcon(getClass().getResource("/" + FIGURAS2 + "/" + coger2));
    ImageIcon IMA7 = new ImageIcon(getClass().getResource("/" + FIGURAS2 + "/" + coger2));
    ImageIcon IMA8 = new ImageIcon(getClass().getResource("/" + FIGURAS2 + "/" + coger2));
    ImageIcon IMA9 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA10 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA11 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA12 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA13 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA14 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA15 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA16 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA17 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA18 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA19 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA20 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));
    ImageIcon IMA21 = new ImageIcon(getClass().getResource("/" + FIGURAS1 + "/" + Etivar));

    JLabel LB1 = new JLabel(IMA1);
    JLabel LB2 = new JLabel(IMA2);
    JLabel LB3 = new JLabel(IMA3);
    JLabel LB4 = new JLabel(IMA4);
    JLabel LB5 = new JLabel(IMA5);
    JLabel LB6 = new JLabel(IMA6);
    JLabel LB7 = new JLabel(IMA7);
    JLabel LB8 = new JLabel(IMA8);
    JLabel LB9 = new JLabel(IMA9);
    JLabel LB10 = new JLabel(IMA10);
    JLabel LB11 = new JLabel(IMA11);
    JLabel LB12 = new JLabel(IMA12);
    JLabel LB13 = new JLabel(IMA13);
    JLabel LB14 = new JLabel(IMA14);
    JLabel LB15 = new JLabel(IMA15);
    JLabel LB16 = new JLabel(IMA16);
    JLabel LB17 = new JLabel(IMA17);
    JLabel LB18 = new JLabel(IMA18);
    JLabel LB19 = new JLabel(IMA19);
    JLabel LB20 = new JLabel(IMA20);
    JLabel LB21 = new JLabel(IMA21);

    int XIMG1 = 20, yimagen1 = 200, velxImagen1 = -10, velyImagen1 = -10;
    int XIM2 = 300, yimagen2 = 400, velxImagen2 = 10, velyImagen2 = -10;
    int XIM3 = 470, yimagen3 = 50, velxImagen3 = 10, velyImagen3 = 10;
    int XIM4 = 100, yimagen4 = 300, velxImagen4 = 10, velyImagen4 = 10;
    int XIM5 = 200, yimagen5 = 100, velxImagen5 = -10, velyImagen5 = -10;
    int XIM6 = 390, yimagen6 = 340, velxImagen6 = -10, velyImagen6 = -10;
    int XIM7 = 480, yimagen7 = 390, velxImagen7 = 10, velyImagen7 = -10;
    int XIM8 = 216, yimagen8 = 410, velxImagen8 = -10, velyImagen8 = 10;
    int XIM9 = 120, yimagen9 = 110, velxImagen9 = -10, velyImagen9 = 10;
    int XIM10 = 130, yimagen10 = 20, velxImagen10 = 10, velyImagen10 = 10;
    int XIM11 = 220, yimagen11 = 80, velxImagen11 = 10, velyImagen11 = -10;
    int XIM12 = 420, yimagen12 = 140, velxImagen12 = -10, velyImagen12 = 10;
    int XIM13 = 260, yimagen13 = 170, velxImagen13 = -10, velyImagen13 = 10;
    int XIM14 = 160, yimagen14 = 230, velxImagen14 = -10, velyImagen14 = -10;
    int XIM15 = 320, yimagen15 = 280, velxImagen15 = -10, velyImagen15 = 10;
    int XIM16 = 350, yimagen16 = 22, velxImagen16 = 10, velyImagen16 = 10;
    int XIM17 = 410, yimagen17 = 250, velxImagen17 = -10, velyImagen17 = 10;
    int XIM18 = 280, yimagen18 = 418, velxImagen18 = 10, velyImagen18 = 10;
    int XIM19 = 40, yimagen19 = 450, velxImagen19 = -10, velyImagen19 = -10;
    int XIM20 = 90, yimagen20 = 120, velxImagen20 = -10, velyImagen20 = 10;
    int XIM21 = 380, yimagen21 = 410, velxImagen21 = -10, velyImagen21 = -10;

    public Nivel3(Jugador panelSup, Ventana vi) {
        this.J = panelSup;
        this.vi = vi;
        setLayout(null);
        LB1.setBounds(XIMG1, yimagen1, IMA1.getIconWidth(), IMA1.getIconHeight());
        LB2.setBounds(XIM2, yimagen2, IMA2.getIconWidth(), IMA2.getIconHeight());
        LB3.setBounds(XIM3, yimagen3, IMA3.getIconWidth(), IMA3.getIconHeight());
        LB4.setBounds(XIM4, yimagen4, IMA4.getIconWidth(), IMA4.getIconHeight());
        LB5.setBounds(XIM5, yimagen5, IMA5.getIconWidth(), IMA5.getIconHeight());
        LB6.setBounds(XIM6, yimagen6, IMA6.getIconWidth(), IMA6.getIconHeight());
        LB7.setBounds(XIM7, yimagen7, IMA7.getIconWidth(), IMA7.getIconHeight());
        LB8.setBounds(XIM8, yimagen8, IMA8.getIconWidth(), IMA8.getIconHeight());
        LB9.setBounds(XIM9, yimagen9, IMA9.getIconWidth(), IMA9.getIconHeight());
        LB10.setBounds(XIM10, yimagen10, IMA10.getIconWidth(), IMA10.getIconHeight());
        LB11.setBounds(XIM11, yimagen11, IMA11.getIconWidth(), IMA11.getIconHeight());
        LB12.setBounds(XIM12, yimagen12, IMA12.getIconWidth(), IMA12.getIconHeight());
        LB13.setBounds(XIM13, yimagen13, IMA13.getIconWidth(), IMA13.getIconHeight());
        LB14.setBounds(XIM14, yimagen14, IMA14.getIconWidth(), IMA14.getIconHeight());
        LB15.setBounds(XIM15, yimagen15, IMA15.getIconWidth(), IMA15.getIconHeight());
        LB16.setBounds(XIM16, yimagen16, IMA16.getIconWidth(), IMA16.getIconHeight());
        LB17.setBounds(XIM17, yimagen17, IMA17.getIconWidth(), IMA17.getIconHeight());
        LB18.setBounds(XIM18, yimagen18, IMA18.getIconWidth(), IMA18.getIconHeight());
        LB19.setBounds(XIM19, yimagen19, IMA19.getIconWidth(), IMA19.getIconHeight());
        LB20.setBounds(XIM20, yimagen20, IMA20.getIconWidth(), IMA20.getIconHeight());
        LB21.setBounds(XIM21, yimagen21, IMA21.getIconWidth(), IMA21.getIconHeight());

        LB1.addMouseListener(this);
        LB2.addMouseListener(this);
        LB3.addMouseListener(this);
        LB4.addMouseListener(this);
        LB5.addMouseListener(this);
        LB6.addMouseListener(this);
        LB7.addMouseListener(this);
        LB8.addMouseListener(this);
        LB10.addMouseListener(this);
        LB11.addMouseListener(this);
        LB12.addMouseListener(this);
        LB13.addMouseListener(this);
        LB14.addMouseListener(this);
        LB15.addMouseListener(this);
        LB16.addMouseListener(this);
        LB17.addMouseListener(this);
        LB18.addMouseListener(this);
        LB19.addMouseListener(this);
        LB20.addMouseListener(this);
        LB21.addMouseListener(this);

        add(LB1);
        add(LB2);
        add(LB3);
        add(LB4);
        add(LB5);
        add(LB6);
        add(LB7);
        add(LB8);
        add(LB9);
        add(LB10);
        add(LB11);
        add(LB12);
        add(LB13);
        add(LB14);
        add(LB15);
        add(LB16);
        add(LB17);
        add(LB18);
        add(LB19);
        add(LB20);
        add(LB21);

        fondo = new ImageIcon(getClass().getResource("/Imagenes Fondo/fondomin.gif"));
        hiloNumeros.start();
    }

    void ControladorDeRebotes() {
        if (XIMG1 < 2 || (XIMG1 + IMA1.getIconWidth()) > getWidth() - 100) {
            velxImagen1 *= -1;
        }
        if (yimagen1 < 2 || (yimagen1 + IMA1.getIconHeight()) > getHeight() - 100) {
            velyImagen1 *= -1;
        }
        if (XIM2 < 2 || (XIM2 + IMA2.getIconWidth()) > getWidth() - 100) {
            velxImagen2 *= -1;
        }
        if (yimagen2 < 2 || (yimagen2 + IMA2.getIconHeight()) > getHeight() - 100) {
            velyImagen2 *= -1;
        }
        if (XIM3 < 2 || (XIM3 + IMA3.getIconWidth()) > getWidth() - 100) {
            velxImagen3 *= -1;
        }
        if (yimagen3 < 2 || (yimagen3 + IMA3.getIconHeight()) > getHeight() - 10) {
            velyImagen3 *= -1;
        }
        if (XIM4 < 2 || (XIM4 + IMA4.getIconWidth()) > getWidth() - 10) {
            velxImagen4 *= -1;
        }
        if (yimagen4 < 2 || (yimagen4 + IMA4.getIconHeight()) > getHeight() - 10) {
            velyImagen4 *= -1;
        }
        if (XIM5 < 2 || (XIM5 + IMA5.getIconWidth()) > getWidth() - 10) {
            velxImagen5 *= -1;
        }
        if (yimagen5 < 2 || (yimagen5 + IMA5.getIconHeight()) > getHeight() - 10) {
            velyImagen5 *= -1;
        }
        if (XIM6 < 2 || (XIM6 + IMA6.getIconWidth()) > getWidth() - 10) {
            velxImagen6 *= -1;
        }
        if (yimagen6 < 2 || (yimagen6 + IMA6.getIconHeight()) > getHeight() - 10) {
            velyImagen6 *= -1;
        }
        if (XIM7 < 2 || (XIM7 + IMA7.getIconWidth()) > getWidth() - 10) {
            velxImagen7 *= -1;
        }
        if (yimagen7 < 2 || (yimagen7 + IMA7.getIconHeight()) > getHeight() - 10) {
            velyImagen7 *= -1;
        }
        if (XIM8 < 2 || (XIM8 + IMA8.getIconWidth()) > getWidth() - 10) {
            velxImagen8 *= -1;
        }
        if (yimagen8 < 2 || (yimagen8 + IMA8.getIconHeight()) > getHeight() - 10) {
            velyImagen8 *= -1;
        }
        if (XIM9 < 2 || (XIM9 + IMA9.getIconWidth()) > getWidth() - 10) {
            velxImagen9 *= -1;
        }
        if (yimagen9 < 2 || (yimagen9 + IMA9.getIconHeight()) > getHeight() - 10) {
            velyImagen9 *= -1;
        }
        if (XIM10 < 2 || (XIM10 + IMA10.getIconWidth()) > getWidth() - 10) {
            velxImagen10 *= -1;
        }
        if (yimagen10 < 2 || (yimagen10 + IMA10.getIconHeight()) > getHeight() - 10) {
            velyImagen10 *= -1;
        }
        if (XIM11 < 2 || (XIM11 + IMA11.getIconWidth()) > getWidth() - 10) {
            velxImagen11 *= -1;
        }
        if (yimagen11 < 2 || (yimagen11 + IMA11.getIconHeight()) > getHeight() - 10) {
            velyImagen11 *= -1;
        }
        if (XIM12 < 2 || (XIM12 + IMA12.getIconWidth()) > getWidth() - 10) {
            velxImagen12 *= -1;
        }
        if (yimagen12 < 2 || (yimagen12 + IMA12.getIconHeight()) > getHeight() - 10) {
            velyImagen12 *= -1;
        }
        if (XIM13 < 2 || (XIM13 + IMA13.getIconWidth()) > getWidth() - 10) {
            velxImagen13 *= -1;
        }
        if (yimagen13 < 2 || (yimagen13 + IMA13.getIconHeight()) > getHeight() - 10) {
            velyImagen13 *= -1;
        }
        if (XIM14 < 2 || (XIM14 + IMA14.getIconWidth()) > getWidth() - 10) {
            velxImagen14 *= -1;
        }
        if (yimagen14 < 2 || (yimagen14 + IMA14.getIconHeight()) > getHeight() - 10) {
            velyImagen14 *= -1;
        }
        if (XIM15 < 2 || (XIM15 + IMA15.getIconWidth()) > getWidth() - 10) {
            velxImagen15 *= -1;
        }
        if (yimagen15 < 2 || (yimagen15 + IMA15.getIconHeight()) > getHeight() - 10) {
            velyImagen15 *= -1;
        }
        if (XIM16 < 2 || (XIM16 + IMA16.getIconWidth()) > getWidth() - 10) {
            velxImagen16 *= -1;
        }
        if (yimagen16 < 2 || (yimagen16 + IMA16.getIconHeight()) > getHeight() - 10) {
            velyImagen16 *= -1;
        }
        if (XIM17 < 2 || (XIM17 + IMA17.getIconWidth()) > getWidth() - 10) {
            velxImagen17 *= -1;
        }
        if (yimagen17 < 2 || (yimagen17 + IMA17.getIconHeight()) > getHeight() - 10) {
            velyImagen17 *= -1;
        }
        if (XIM18 < 2 || (XIM18 + IMA18.getIconWidth()) > getWidth() - 10) {
            velxImagen18 *= -1;
        }
        if (yimagen18 < 2 || (yimagen18 + IMA18.getIconHeight()) > getHeight() - 10) {
            velyImagen18 *= -1;
        }
        if (XIM19 < 2 || (XIM19 + IMA19.getIconWidth()) > getWidth() - 10) {
            velxImagen19 *= -1;
        }
        if (yimagen19 < 2 || (yimagen19 + IMA19.getIconHeight()) > getHeight() - 10) {
            velyImagen19 *= -1;
        }
        if (XIM20 < 2 || (XIM20 + IMA20.getIconWidth()) > getWidth() - 10) {
            velxImagen20 *= -1;
        }
        if (yimagen20 < 2 || (yimagen20 + IMA20.getIconHeight()) > getHeight() - 10) {
            velyImagen20 *= -1;
        }
        if (XIM21 < 2 || (XIM21 + IMA21.getIconWidth()) > getWidth() - 10) {
            velxImagen21 *= -1;
        }
        if (yimagen21 < 2 || (yimagen21 + IMA21.getIconHeight()) > getHeight() - 10) {
            velyImagen21 *= -1;
        }

        XIMG1 += velxImagen1;
        yimagen1 += velyImagen1;
        XIM2 += velxImagen2;
        yimagen2 += velyImagen2;
        XIM3 += velxImagen3;
        yimagen3 += velyImagen3;
        XIM4 += velxImagen4;
        yimagen4 += velyImagen4;
        XIM5 += velxImagen5;
        yimagen5 += velyImagen5;
        XIM6 += velxImagen6;
        yimagen6 += velyImagen6;
        XIM7 += velxImagen7;
        yimagen7 += velyImagen7;
        XIM8 += velxImagen8;
        yimagen8 += velyImagen8;
        XIM9 += velxImagen9;
        yimagen9 += velyImagen9;
        XIM10 += velxImagen10;
        yimagen10 += velyImagen10;
        XIM11 += velxImagen11;
        yimagen11 += velyImagen11;
        XIM12 += velxImagen12;
        yimagen12 += velyImagen12;
        XIM13 += velxImagen13;
        yimagen13 += velyImagen13;
        XIM14 += velxImagen14;
        yimagen14 += velyImagen14;
        XIM15 += velxImagen15;
        yimagen15 += velyImagen15;
        XIM16 += velxImagen16;
        yimagen16 += velyImagen16;
        XIM17 += velxImagen17;
        yimagen17 += velyImagen17;
        XIM18 += velxImagen18;
        yimagen18 += velyImagen18;
        XIM19 += velxImagen19;
        yimagen19 += velyImagen19;
        XIM20 += velxImagen20;
        yimagen20 += velyImagen20;
        XIM21 += velxImagen21;
        yimagen21 += velyImagen21;

        LB1.setLocation(XIMG1, yimagen1);
        LB2.setLocation(XIM2, yimagen2);
        LB3.setLocation(XIM3, yimagen3);
        LB4.setLocation(XIM4, yimagen4);
        LB5.setLocation(XIM5, yimagen5);
        LB6.setLocation(XIM6, yimagen6);
        LB7.setLocation(XIM7, yimagen7);
        LB8.setLocation(XIM8, yimagen8);
        LB9.setLocation(XIM9, yimagen9);
        LB10.setLocation(XIM10, yimagen10);
        LB11.setLocation(XIM11, yimagen11);
        LB12.setLocation(XIM12, yimagen12);
        LB13.setLocation(XIM13, yimagen13);
        LB14.setLocation(XIM14, yimagen14);
        LB15.setLocation(XIM15, yimagen15);
        LB16.setLocation(XIM16, yimagen16);
        LB17.setLocation(XIM17, yimagen17);
        LB18.setLocation(XIM18, yimagen18);
        LB19.setLocation(XIM19, yimagen19);
        LB20.setLocation(XIM20, yimagen20);
        LB21.setLocation(XIM21, yimagen21);
    }

    Nivel3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void paint(Graphics g) {
        if (NVidas >= 1) {
            g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            nombreImagen = (fondo.getDescription().substring(fondo.getDescription().indexOf("fondo"), fondo.getDescription().length() - 4));
            super.paint(g);
        } else {
            try {
                new VentanaHall();
                setVisible(false);
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Nivel3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void run() {
        while (true) {
            try {
                ControladorDeRebotes();
                if (SiguientePrueba == true) {
                }
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("aqui estoyy");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
    int f = 0;

    @Override
    public void mousePressed(MouseEvent e) {
        if (J.labelPregunta.getText().equals("ADVERTENCIA Evite figura que cambia")) {
            if (e.getSource().equals(LB4)) {
                f = f + 20;
                LB4.setVisible(false);
            } else if (e.getSource().equals(LB1)) {
                f = f + 20;
                LB1.setVisible(false);
            } else if (e.getSource().equals(LB2)) {
                f = f + 20;
                LB2.setVisible(false);
            } else if (e.getSource().equals(LB3)) {
                f = f + 20;
                LB3.setVisible(false);
            } else if (e.getSource().equals(LB4)) {
                f = f + 50;
                LB4.setVisible(false);
            } else if (e.getSource().equals(LB5)) {
                f = f + 50;
                LB5.setVisible(false);
            } else if (e.getSource().equals(LB6)) {
                f = f + 50;
                LB6.setVisible(false);
            } else if (e.getSource().equals(LB7)) {
                f = f + 50;
                LB7.setVisible(false);
            } else if (e.getSource().equals(LB8)) {
                f = f + 50;
                LB8.setVisible(false);
            } else {
                if (NVidas >= 0) {
                    NVidas--;
                }

            }
        } else {
        }
        QuitarVidas();
        vi.panelsuperior.puntos.setText("Puntos: " + f);
        System.out.println(f);
        if (f >= 280) {
            vi.setVisible(false);
J.setNivelActual("2");
VentanaHall vh= new VentanaHall();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    void QuitarVidas() {
        if (NVidas == 4) {
            J.labelVida5.setVisible(false);
            J.setVidas("" + NVidas);
            System.out.println(NVidas);
        } else if (NVidas == 3) {
            J.labelVida4.setVisible(false);
            J.setVidas("" + NVidas);
            System.out.println(NVidas);
        } else if (NVidas == 2) {
            J.labelVida3.setVisible(false);
            J.setVidas("" + NVidas);
            System.out.println(NVidas);
        } else if (NVidas == 1) {
            J.labelVida2.setVisible(false);
            J.setVidas("" + NVidas);
            System.out.println(NVidas);
        } else if (NVidas == 0) {
            J.labelVida1.setVisible(false);
            J.setVidas("" + NVidas);
            System.out.println(NVidas);
        }
    }

    void AgrandarPantallaYsusCompentes() {
        vi.ancho = Toolkit.getDefaultToolkit().getScreenSize().width;
        vi.alto = Toolkit.getDefaultToolkit().getScreenSize().height;
        vi.setSize(vi.ancho, vi.alto);
        vi.setLocation(0, 0);
        setBounds(0, 30, vi.ancho, vi.alto);
        J.setBounds(0, 0, getWidth(), 30);
//        Jugador.cronometro.setBounds(getWidth() - 100, 0, 100, 20);
    }
}
