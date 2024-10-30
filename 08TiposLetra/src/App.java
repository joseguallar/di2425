import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] misLetras=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String nombreFuentes:misLetras) {
			System.out.println(nombreFuentes);
		}
		//visualizar un mensaje del ordenador
		JOptionPane.showMessageDialog(null, "hola mundo");
		String mensaje = JOptionPane.showInputDialog("introduce un numero");
		
		
		
	}

}
