import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class App extends JFrame{
	
	public App() {
			
	//configuro la ventana
		setTitle("Verificar letra");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
	
	//sacar los tipos de letra
		String [] misLetras=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		
	// pedir el tipo de letra
		String tipoLetra = JOptionPane.showInputDialog("Introduce tipo de letra");
		
		//verificar la fuente
		boolean existeLetra = false;
		for (String font : misLetras) {
			if(font.equalsIgnoreCase(tipoLetra)){
			existeLetra = true;
			
			break;
		}
		}
		//si la letra no existe
		String letraSeleccionada;
		if (existeLetra) {
			letraSeleccionada = tipoLetra;
			
		}else {
			letraSeleccionada = misLetras[0];
			JOptionPane.showMessageDialog(null,"la fuente " + tipoLetra + " no esta disponible "+ "\n voy a usar "+letraSeleccionada);
		}
//crear la etiqueta del texto
		JLabel etiqueta = new JLabel("Tipos de fuente");
		etiqueta.setFont(new Font(letraSeleccionada,Font.PLAIN,20));
// informamos del tipo de letra que usarmos
		JLabel info = new JLabel("La fuente usada es "+ letraSeleccionada);
		
		add(etiqueta);
		add(info);
		setVisible(true);
		
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App();
	}

}
