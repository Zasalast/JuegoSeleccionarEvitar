
package Figurate;


import java.awt.Color;
import javax.swing.*;

class Ventana extends JFrame{
    int ancho = 650, alto = 600;
    Jugador panelsuperior = new Jugador();
    Nivel1 canvas = new Nivel1(panelsuperior, this);    
    Nivel2 canvas2 = new Nivel2(panelsuperior, this);
    Nivel3 canvas3 = new Nivel3(panelsuperior, this);
    Nivel4 canvas4 = new Nivel4(panelsuperior, this);
    public Ventana(int e) {   
        setLayout(null);
        setSize(ancho,alto);
        
//        canvas.setBounds(0, 80, getWidth(), getHeight()-120);
            Nivel(e);
//        add(canvas);
        setVisible(true);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panelsuperior();

    }  
    void panelsuperior(){
        panelsuperior.setBounds(0, 0, getWidth(), 80);add(panelsuperior); panelsuperior.setBackground(Color.black);
    }
    void Nivel(int e){
        if (e==1) {
            canvas.setBounds(0, 80, getWidth(), getHeight()-120);
            add(canvas);
        } else if (e==2) {
            canvas2.setBounds(0, 80, getWidth(), getHeight()-120);add(canvas2);
        } else if (e==3) {
            canvas3.setBounds(0, 80, getWidth(), getHeight()-120);add(canvas3);
        } else if (e==4) {
            canvas4.setBounds(0, 80, getWidth(), getHeight()-120);add(canvas4);
        } else{
        }
    }
}
