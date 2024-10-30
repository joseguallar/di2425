import java.awt.FlowLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame {
	
	
	private JTextField campoTexto;
		
	public App() {
	//configuramos la ventana
		//titulo
		this.setTitle("desaparece en 5 segundo");
		//tamaño ventana
		this.setSize(400, 200);;
		//al cerrar la ventana cierro el programa
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//establezco un layout para no tener que poner direcciones
		//absolutas
		this.setLayout(new FlowLayout());
		//caracteristicas del campo de texto
		campoTexto = new JTextField("Este campo de texto se eliminara en"
				+ " 5 segundos",25);
		this.add(campoTexto);
		//NUEVO TEMPORIZADOR
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			public void run () {
				//elimino el campo de texto del panel
				remove(campoTexto);
				//recalculo el diseño y redibujo el panel
				revalidate();
				repaint();
			}
		},5000);//eliminar despues de 5000 milisegundo (5 segundos)
		
		//hacer visible
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App();
	}

}
