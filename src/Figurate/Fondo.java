package Figurate;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class Fondo extends JDesktopPane {

  private Image imagen;
  private String fondo="Fondo.png";
     public Fondo() {  
       this.setLayout(null); 
       this.setBounds(0, 0, 600, 500);  
  try {
       imagen=ImageIO.read(getClass().getResource("/imagenes/Fondo.png"));
  }
 catch (IOException e) {
   e.printStackTrace();
  }

  }
 
 public void paintComponent(Graphics g){
  
     super.paintComponent(g);
     g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
     setOpaque(false);
 }

}
