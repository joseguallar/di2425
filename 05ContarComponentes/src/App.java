import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Contar Componentes");
		
		//creamos algunos componentes
		JButton boton1 = new JButton("boton 1");
		JButton boton2 = new JButton("boton 2");
		JTextField campoTexto = new JTextField("Campo de texto");
		JLabel etiqueta = new JLabel("etiqueta");
		
		//creamos el Layout
		frame.setLayout(new FlowLayout());
		
		//añadimos los componentes al frame
		frame.add(etiqueta);
		frame.add(campoTexto);
		frame.add(boton2);
		frame.add(boton1);
		
		//obtenemos la cantidad de componentes
		
		int cantidadComponentes = frame.getContentPane().getComponentCount();
		
		System.out.println("la cantidad de componentes es: "+ cantidadComponentes);
		//obtener los componentes

		Component[] componentes = frame.getContentPane().getComponents();
		System.out.println("lista de componentes ");
		for (Component component:componentes) {
			System.out.println(component.getClass().getSimpleName());
			}
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.pack();
		//no poder mover el tamaño de la ventana
		frame.setResizable(false);
		//colocar la ventana en el centro de la pantalla
		frame.setLocationRelativeTo(null);
		//hacer visible
		
		frame.setVisible(true);
		
		
	
		
	}

}
