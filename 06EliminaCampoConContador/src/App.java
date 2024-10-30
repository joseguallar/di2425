import java.awt.FlowLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class App extends JFrame{
	
	private JTextField campoTexto;//campo que se eliminara 
	private JTextField cuentaAtras;//campo para mostrar la cuenta atras
	private int tiempoRestante =5;
	
	public App() {
		
		setTitle("Cuenta atrás");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		//creamos el JTextField eliminar a los 5 sg y añadirlo al frame
		campoTexto = new JTextField("Este campo se eliminara en segundos",25);
		add(campoTexto);
		
		//creamos el JTextField para la cuenta atras y añadimos al frame
		cuentaAtras = new JTextField("Cuenta atras: 5", 10);
		//NUEVO hacemos este campo no editable por el usuario
		cuentaAtras.setEditable(false);
		add(cuentaAtras);
		//creamos el temporizador
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run () {
				tiempoRestante--;
				cuentaAtras.setText("Cuenta atrás: " + tiempoRestante);
				
				//si el tiempo llega a 0, eliminar el JTextField
				if (tiempoRestante <=0) {
					remove(campoTexto); //eliminamos el campo de texto
					revalidate();
					repaint();
					timer.cancel(); //detenemos el temporizador
				}
				
							}
		},1000,1000);//ejecuta cada segundo 
		
		
		
		
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new App();
	}

}
