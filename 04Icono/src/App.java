import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ejemplo Icono");
		//establecemos el tamaño de la ventana
		frame.setSize(300, 200);
		//establecemos la localización en la ventana
		frame.setLocation(300, 300);
		//activamos que salga del programa al pulsar la "X"
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//creamos el icono
		Image icono = new ImageIcon("R.png").getImage();
		//establecer el icono
		frame.setIconImage(icono);
		//lo hacemos visible
		frame.setVisible(true);
		
		
		
		
	}

}
