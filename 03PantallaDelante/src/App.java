import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App extends JFrame {
	
	public App(){
		JButton boton = new JButton("Soy un boton");
		boton.setBounds(50, 50, 200, 30);
		
		//agregamos el boton
		this.add(boton);
		//establecemos el tamaño de la ventana
		this.setSize(300, 200);
		this.setTitle("ventana 1");
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//hacemos que la ventana este siempre delante
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		
		JFrame ventana2 = new JFrame("Ventana 2");
		ventana2.setSize(500, 500);
		ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel etiqueta = new JLabel("ventana 2");
		ventana2.add(etiqueta);
		
		ventana2.setVisible(true);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
	}

}
