import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Panel extends JPanel{
	JLabel etiqueta;
	JButton boton;
	Border borde;
	Color color;
	
	public Panel() {
		etiqueta = new JLabel("soy una etiqueta");
		boton = new JButton("Click aqui");
		//tamaño preferido del panel
		this.setPreferredSize(new Dimension(200,200));
		//borde de tamaño 5 color azul
		//borde = BorderFactory.createLineBorder(Color.BLUE, 5);
		//borde vacio con margenes de 10 pixeles
		//sirve para dejar un espacio de 10 px alrededor del borde
		//borde = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		//borde de color verde
		//borde = BorderFactory.createLineBorder(Color.GREEN);
		//crear un borde de color rojo con distintos tamaños en los lados
		//borde = BorderFactory.createMatteBorder(10, 1, 10, 1, Color.RED);
		//borde con relieve (bajo relieve)
		//borde = BorderFactory.createLoweredBevelBorder();
		//borde con sobre relieve
		//borde = BorderFactory.createRaisedBevelBorder();
		//borde con titulo
		borde = BorderFactory.createTitledBorder("Mi Panel");
		//establecer el color del fondo
		//forma 01
		this.setBackground(new Color(195));
		//forma 02
		this.setBackground(Color.CYAN);
		//forma 03 creando una variable de tipo color
		color =new Color (100,200,200);
		this.setBackground(color);
		//añadimos el borde al panel
		
		
		this.setBorder(borde);
				
		this.add(etiqueta);
		this.add(boton);
		
		
		
	}
	
	
}
