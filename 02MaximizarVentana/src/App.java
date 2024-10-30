import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App  extends JFrame{

	public App() {
		// creo un botón 
		JButton boton = new JButton("botón");
		JButton boton2 = new JButton("botón 2");
		//establezco posicion de boton y tamaño
		boton.setBounds(50, 50, 200, 30);
		boton2.setBounds(50, 100, 200, 30);
		//añado el boton al panel
		this.add(boton);
		this.add(boton2);
		//elimino el layout por defecto
		this.setLayout(null);
		//cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//posicionamos la ventana
		this.setLocation(100, 100);
		//establezco tamaño de pantalla
		this.setSize(400, 400);
		//tamaño minimo de pantalla
		this.setMinimumSize(new Dimension (300,300));
		// pantalla maximilaza
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		// prohibo redimensionar la pantalla
		//this.setResizable(false);
		//visible
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
	}

}
