import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JPanel;

public class Panel01 extends JPanel {
	TextField txf;
	Font letra;
	public Panel01(){
		txf= new TextField(20);
		//esteblecer color de fondo del panel
		setBackground(new Color(100,100,100));
		//fondo de txf
		txf.setBackground(new Color(150,150,150));
		letra = new Font("Verdana",Font.BOLD,25);
		txf.setFont(letra);
		//cambiar el color de la letra
		txf.setForeground(Color.MAGENTA);
		
		add(txf);
	}
	

}
